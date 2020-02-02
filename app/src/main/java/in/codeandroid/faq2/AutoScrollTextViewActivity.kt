package `in`.codeandroid.faq2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_auto_scroll_text_view.*


class AutoScrollTextViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_scroll_text_view)

        tv_autoscroll.isSelected = true

        tv_fast_autoscroll.startScroll()

    }

}
