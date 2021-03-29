package ssc.appname.whitelabel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ssc.appname.whitelabel.R

class AdapterTeam : RecyclerView.Adapter<AdapterTeam.PagerVH>() {
    // array of colors to change the background color of screen

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        return PagerVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.row_team, parent, false)
        )
    }

    //binding the screen with view
    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
    }

    inner class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun getItemCount(): Int = 50


}

