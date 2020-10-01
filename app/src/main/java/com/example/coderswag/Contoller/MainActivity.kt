package com.example.coderswag.Contoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryRecycleAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categoties)
        categoryListView.adapter = adapter


        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
//            val category = DataService.categoties[position]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT)

        }
    }
