package com.adeks.listviewapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import com.adeks.listviewapplication.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    fun navigateToListActivity(view: View) {
        var name: TextInputLayout? = binding?.username
        var password: TextInputLayout? = binding?.password
        if (TextUtils.isEmpty(name?.editText?.text.toString()) || TextUtils.isEmpty(password?.editText?.text.toString())) {
            Toast.makeText(this, "Invalid Inputs", Toast.LENGTH_LONG).show()
            Log.d(TAG, "navigateToListActivity: " + name?.editText?.text)
        } else if (name?.editText?.text.toString() == "Adekunle" && password?.editText?.text.toString() == "123456" ) {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        } else {
            Log.d(TAG, "navigateToListActivity: " + name?.editText?.text)
            Log.d(TAG, "navigateToListActivity: " + password?.editText?.text)
            Toast.makeText(this, "Incorrect login details", Toast.LENGTH_LONG).show()
        }
    }

}