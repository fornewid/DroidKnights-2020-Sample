package soup.droidknights.animation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import soup.droidknights.animation.click.*
import soup.droidknights.animation.loading.*
import soup.droidknights.animation.purpose.ClickActivity
import soup.droidknights.animation.purpose.LoadingActivity
import soup.droidknights.animation.transition.Transition01Activity
import soup.droidknights.animation.transition.Transition02Activity
import soup.droidknights.animation.transition.Transition03Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hideNavBar()
    }

    fun onButtonClick(view: View) {
        when (view.id) {
            R.id.button_01 -> startActivity(Intent(this, LoadingActivity::class.java))
            R.id.button_02 -> startActivity(Intent(this, ClickActivity::class.java))
            R.id.button_03 -> startActivity(Intent(this, Loading01Activity::class.java))
            R.id.button_04 -> startActivity(Intent(this, Loading02Activity::class.java))
            R.id.button_05 -> startActivity(Intent(this, Loading03Activity::class.java))
            R.id.button_06 -> startActivity(Intent(this, Loading04Activity::class.java))
            R.id.button_07 -> startActivity(Intent(this, Loading05Activity::class.java))
            R.id.button_08 -> startActivity(Intent(this, Click01Activity::class.java))
            R.id.button_09 -> startActivity(Intent(this, Click02Activity::class.java))
            R.id.button_10 -> startActivity(Intent(this, Click03Activity::class.java))
            R.id.button_11 -> startActivity(Intent(this, Click04Activity::class.java))
            R.id.button_12 -> startActivity(Intent(this, Click05Activity::class.java))
            R.id.button_13 -> startActivity(Intent(this, Transition01Activity::class.java))
            R.id.button_14 -> startActivity(Intent(this, Transition02Activity::class.java))
            R.id.button_15 -> startActivity(Intent(this, Transition03Activity::class.java))
        }
    }
}
