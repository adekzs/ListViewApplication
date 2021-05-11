package com.adeks.listviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adeks.listviewapplication.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    var binding : ActivityListBinding? = null
    var adapter : FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact() {
        adapter = FactAdapter(this, FactDummyData.facts)
        binding?.itemList?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}