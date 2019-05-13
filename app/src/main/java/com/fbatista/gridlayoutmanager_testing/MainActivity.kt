package com.fbatista.gridlayoutmanager_testing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listToTesting = listOf<TestingItem>(
            TestingItem("Fernando", 23),
            TestingItem("Fernando", 24),
            TestingItem("Fernando", 25),
            TestingItem("Fernando", 26),
            TestingItem("Fernando", 27),
            TestingItem("Fernando", 28),
            TestingItem("Fernando", 29),
            TestingItem("Fernando", 30)
        )

        val adapter = MyAdapter(listToTesting)

        val orientation = LinearLayoutManager.VERTICAL
        val spanCount = 3


        /*
        When orientation is VERTICAL, the list will grow vertically, that means the number of columns will be fixed, and
        the rows number will grow according to number of elements. (spanCount will define the columns number).
        When orientation is HORIZONTAL, the opposite happens, the list will grow horizontally, that means the rows number will be fixed, and
        the columns number will grow according to number of elements.
        It is important to understand this, because the sequence of elements depends on it, when the orientation is HORIZONTAL, the elements
        will be distributed vertically for example.
         */

        recyclerView.layoutManager = GridLayoutManager(this, spanCount, orientation, false)
        recyclerView.adapter = adapter



    }
}
