package tr.mfk.appcentertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "c71e882e-a227-490e-b669-c2f2382529c4",
            Analytics::class.java, Crashes::class.java
        )
    }
}