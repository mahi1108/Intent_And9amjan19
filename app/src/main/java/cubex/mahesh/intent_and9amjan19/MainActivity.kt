package cubex.mahesh.intent_and9amjan19

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            var i = Intent()
            i.action = Intent.ACTION_DIAL
         //   i.action = "android.media.action.IMAGE_CAPTURE"
         //     i.action = Intent.ACTION_VIEW
            startActivity(i)
        }

        b2.setOnClickListener {

        }

        b3.setOnClickListener {

        }

    }  // onCreate( )
} // MainActivity
