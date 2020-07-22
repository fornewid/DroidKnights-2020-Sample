package soup.droidknights.animation.click

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class Click04Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.click_04)
        hideNavBar()
    }
}
