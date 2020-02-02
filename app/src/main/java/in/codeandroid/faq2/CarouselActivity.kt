package `in`.codeandroid.faq2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_carousel.*
import kotlinx.android.synthetic.main.rv_child.view.*

class CarouselActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousel)

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = CarouselAdapter(this)


        viewPager.adapter = MyPagerAdapter(supportFragmentManager)

    }

    class MyPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

        override fun getItem(position: Int): Fragment {
            return CarouselItem.newInstance(position)
        }

        override fun getCount(): Int {
            return 10
        }

    }

    class CarouselAdapter(ctx: Context) :
        RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

        private var context = ctx

        override fun getItemCount(): Int {
            return 10
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.index.text = position.toString()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(context).inflate(
                    R.layout.rv_child,
                    parent,
                    false
                )
            )
        }

        class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            val index = v.tv_index!!
        }
    }
}
