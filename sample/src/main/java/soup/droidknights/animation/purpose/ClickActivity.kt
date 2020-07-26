package soup.droidknights.animation.purpose

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class ClickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.purpose_click)
        hideNavBar()

        findViewById<View>(R.id.button).setOnClickListener {
            it.isVisible = false
        }
    }
}
