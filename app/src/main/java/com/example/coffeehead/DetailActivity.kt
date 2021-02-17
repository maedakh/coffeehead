package com.example.coffeehead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }

    private var dataCoffee = Coffee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val supportActionBar = supportActionBar

        if (intent.extras != null) {
            dataCoffee = intent.getParcelableExtra(EXTRA_DETAIL)!!

            //Set nama toolbar sesuai nama kopi
            supportActionBar?.title = dataCoffee.name

            showDataToView(dataCoffee)
        }
    }

    private fun showDataToView(data: Coffee) {
        data.let {
            tvTitle.text = it.name
            tvDetail.text = it.detail

            Glide.with(this)
                .load(it.photo)
                .centerCrop()
                .into(ivCoffee)
        }
    }
}