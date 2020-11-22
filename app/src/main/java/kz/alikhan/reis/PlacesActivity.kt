package kz.alikhan.reis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PlacesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)
        title = "Места";
    }


    fun toReservation(view: View) {
        val intent = Intent(this, NewPassengerActivity::class.java)

        startActivity(intent)
    }
}