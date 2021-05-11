package com.adeks.listviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adeks.listviewapplication.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private var binding : ActivityDetailsBinding? = null
    private var logo = 0
    private var name : String? = ""
    private var detail : String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAS, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRA)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)
        setUpFactDetail()
    }

    private fun setUpFactDetail() {
        binding?.detailTv?.text = detail
        binding?.logoIv?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}