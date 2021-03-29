package ssc.appname.whitelabel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_screen_chat_room.*
import ssc.appname.whitelabel.R
import ssc.appname.whitelabel.adapter.AdapterTeam
import ssc.appname.whitelabel.adapter.Userdapter
import ssc.appname.whitelabel.adapter.ViewPagerAdapter

class ScreenChatRoom : AppCompatActivity() {


    private val mUserAdapter: AdapterTeam by lazy {
        AdapterTeam()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_chat_room)

        setupRecycleView()
    }

    private fun setupRecycleView() {
        val mLLM = LinearLayoutManager(this)
        recycle_team.apply {
            layoutManager = mLLM
            setHasFixedSize(true)
            adapter = mUserAdapter
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
