package com.kiranbahalaskar.assignmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.mytoolbar.*

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        menuToolbar.title = ""
        setSupportActionBar(menuToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }


}