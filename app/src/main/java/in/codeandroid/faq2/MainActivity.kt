package `in`.codeandroid.faq2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_carousel.setOnClickListener {
            startActivity(Intent(this, CarouselActivity::class.java))
        }

        btn_html.setOnClickListener {
            startActivity(Intent(this, HTMLActivity::class.java))
        }

        btn_auto_scroll_textview.setOnClickListener {
            startActivity(Intent(this, AutoScrollTextViewActivity::class.java))
        }
    }

}
