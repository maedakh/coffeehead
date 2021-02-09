package com.example.coffeehead

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listCoffeeAdapter: ListCoffeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listCoffeeAdapter = ListCoffeeAdapter(CoffeeData.listData)
        rv_coffee.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listCoffeeAdapter
        }

        listCoffeeAdapter.setOnItemClickCallback(object : ListCoffeeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Coffee) {
                Toast.makeText(this@MainActivity, data.toString(), Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(SelectedMode: Int){
        when(SelectedMode){
            R.id.action_about->{
                val intent = Intent(this@MainActivity,About::class.java)
                startActivity(intent)
            }
        }
    }
}