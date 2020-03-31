package com.frozenbrain.fiimateriale

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.frozenbrain.fiimateriale.RecyclerView.RecyclerViewItem
import com.frozenbrain.fiimateriale.semester.ClassItem
import com.frozenbrain.fiimateriale.semester.Semester
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.miguelcatalan.materialsearchview.MaterialSearchView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    lateinit var searchView: MaterialSearchView
    lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setIcon(R.drawable.ic_logo)

        db = FirebaseDatabase.getInstance().reference.child("Years")


        yearOneLeft.setOnClickListener {
            val intent = Intent(this, SemesterActivity::class.java)
            intent.putExtra("semester", Semester("First Year", "First Year/First Semester"))
            startActivity(intent)
        }

    }

}
//ref.setValue("ma-ta") { error, ref ->
//    if (error != null) {
//        Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
//    }
//}