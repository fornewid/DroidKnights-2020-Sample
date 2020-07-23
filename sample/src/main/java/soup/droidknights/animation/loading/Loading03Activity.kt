package soup.droidknights.animation.loading

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class Loading03Activity : AppCompatActivity() {

    private var progressView: ProgressBar? = null

    private val animator = ValueAnimator.ofFloat(0f, 5f).apply {
        duration = 5_000
        interpolator = LinearInterpolator()
        addUpdateListener {
            val fraction = it.animatedValue as Float
            val currentTimeMillis: Int = (fraction * 100).toInt()
            progressView?.progress = currentTimeMillis
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_03)
        hideNavBar()
        progressView = findViewById(R.id.progress_view)
    }

    override fun onResume() {
        super.onResume()
        animator.start()
    }

    override fun onPause() {
        super.onPause()
        animator.cancel()
    }
}
