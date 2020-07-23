package soup.droidknights.animation.click

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class Click02Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.click_02)
        hideNavBar()

        val button: View = findViewById(R.id.button)
        button.setOnClickListener {
            it.isSelected = false
            it.isSelected = true
        }
    }
}
