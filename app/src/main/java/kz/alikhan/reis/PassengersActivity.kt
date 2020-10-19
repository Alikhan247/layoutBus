package kz.alikhan.reis

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_passengers.*
import kotlinx.android.synthetic.main.item_lyout.*

class PassengersActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var statusList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passengers)

        postToList()

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RecyclerAdapter(titlesList, descList, statusList)

    }

    private fun addToList(title: String, description: String, status: String ) {
        titlesList.add(title)
        descList.add(description)
        statusList.add(status)
    }

    private fun postToList() {
        for (i in 1..10) {
            addToList("Aigerim", "0A", "OFFLINE")
        }
    }
}