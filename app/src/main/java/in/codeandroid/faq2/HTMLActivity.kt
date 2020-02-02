package `in`.codeandroid.faq2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_html.*

class HTMLActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html)

        tv_html_text.text = "<h2>Title</h2><br><p>Description here</p>"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv_html_view.text = Html.fromHtml(
                "<h2>Title</h2><br><p>Description here</p>",
                Html.FROM_HTML_MODE_COMPACT
            )
        } else {
            tv_html_view.text = Html.fromHtml("<h2>Title</h2><br><p>Description here</p>")
        }

    }
}
