package ssc.appname.whitelabel.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import ssc.appname.whitelabel.R
import ssc.appname.whitelabel.adapter.Userdapter
import ssc.appname.whitelabel.adapter.ViewPagerAdapter


class MainActivity : AppCompatActivity() {

    private val mUserAdapter: Userdapter by lazy {
        Userdapter()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preInitViews()
        setupRecycleView()
    }

    private fun setupRecycleView() {
        val mLLM = LinearLayoutManager(this)
        recycle_chatrooms.apply {
            layoutManager = mLLM
            setHasFixedSize(true)
            adapter = mUserAdapter
        }

    }

    private fun preInitViews() {

        val mAdapterViewPager = ViewPagerAdapter()
        view_pager2?.apply {
            adapter = mAdapterViewPager
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            offscreenPageLimit = 1

        }

        indicator.setViewPager(view_pager2)
        // submit the data to the list
        //  mAdapterViewPager.submitList(mBannerList)

        // Set indicator on view pager
        indicator.setViewPager(view_pager2)

        // Register adapter optional
        mAdapterViewPager.registerAdapterDataObserver(indicator.adapterDataObserver)


    }

    fun onChatroom(v: View) {
        startActivity(Intent(this, ScreenChatRoom::class.java))
    }


}
