package soup.droidknights.animation.click

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class Click01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.click_01)
        hideNavBar()

        val button: View = findViewById(R.id.button)
        button.setOnClickListener {
            it.isSelected = !it.isSelected
        }
    }
}
