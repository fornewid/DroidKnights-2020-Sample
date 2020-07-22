package soup.droidknights.animation.transition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class Transition01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transition_01)
        hideNavBar()
    }
}