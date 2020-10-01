package com.skill_factory.unit8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.skill_factory.unit8.adapter.MyAdapter
import com.skill_factory.unit8.model.Fruit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recycler_view1)
        val snapHelper1 = LinearSnapHelper()
        snapHelper1.attachToRecyclerView(recyclerView1)

        fun data() : ArrayList<Fruit> = arrayListOf(
            Fruit(R.drawable.ic_apple, "Apple"),
            Fruit(R.drawable.ic_banana, "Banana"),
            Fruit(R.drawable.ic_lemon, "Lemon"),
            Fruit(R.drawable.ic_orange, "Orange"),
            Fruit(R.drawable.ic_pear, "Pear"),
            Fruit(R.drawable.ic_pear, "Pear1"),
            Fruit(R.drawable.ic_pear, "Pear2"),
            Fruit(R.drawable.ic_pear, "Pear3"),
            Fruit(R.drawable.ic_strawberry, "Strawberry"),
        )

        recyclerView1.adapter = MyAdapter(data())

        val recyclerView2 = findViewById<RecyclerView>(R.id.recycler_view2)
        val snapHelper2 = PagerSnapHelper()
        snapHelper2.attachToRecyclerView(recyclerView2)

        recyclerView2.adapter = MyAdapter(data())
    }
}
