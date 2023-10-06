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
            application, "9c39983d-7ac7-4b1c-bcb8-1a0d03e8e41b",
            Analytics::class.java, Crashes::class.java
        )
    }
}