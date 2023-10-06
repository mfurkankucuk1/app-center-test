package tr.mfk.appcentertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "5d3cc5f8-69bf-417f-b24b-a3f69d949f4e",
            Analytics::class.java, Crashes::class.java
        )

    }
}