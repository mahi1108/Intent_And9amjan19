package cubex.mahesh.intent_and9amjan19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var n  = intent.getStringExtra("name")
        var q = intent.getStringExtra("qual")
        tv1.text = "Welcome To NareshIT :  $n , $q"
    }
}
