package edu.temple.imagepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerAdapter.OnItemClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null

    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter(this)

        recyclerView.adapter = adapter

    }

    override fun onItemClick(imageView: ImageView) {
        displayImage.setImageResource(imageView.imageAlpha)
    }
}