package `in`.codeandroid.faq2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.rv_child.*

/**
 * A simple [Fragment] subclass.
 */
class CarouselItem : Fragment() {

    companion object {

        const val INDEX = "INDEX"

        fun newInstance(int: Int): CarouselItem {
            val bundle = Bundle()
            bundle.putInt(INDEX, int)
            val fragment = CarouselItem()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_carousel_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (arguments != null) {
            tv_index.text = arguments!!.getInt(INDEX).toString()
        }
        super.onViewCreated(view, savedInstanceState)
    }

}
