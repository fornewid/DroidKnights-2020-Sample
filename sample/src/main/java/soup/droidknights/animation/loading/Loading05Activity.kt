package soup.droidknights.animation.loading

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import soup.droidknights.animation.R
import soup.droidknights.animation.hideNavBar

class Loading05Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_05)
        hideNavBar()

        findViewById<View>(R.id.button).setOnClickListener {
            val nm = getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                nm?.createNotificationChannel(
                    NotificationChannel(
                        CHANNEL_NOTIFICATION,
                        "Notification",
                        NotificationManager.IMPORTANCE_HIGH
                    )
                )
            }
            nm?.notify(
                1,
                NotificationCompat
                    .Builder(this, CHANNEL_NOTIFICATION)
                    .setSmallIcon(R.drawable.stat_sys_download)
                    .setContentTitle("AnimationDrawable")
                    .setContentText("Animated icon will be shown!")
                    .build()
            )
        }
    }

    companion object {
        private const val CHANNEL_NOTIFICATION = "NOTIFICATION"
    }
}
