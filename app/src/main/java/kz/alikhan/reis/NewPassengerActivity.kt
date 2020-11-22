package kz.alikhan.reis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewPassengerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_passenger)
        title = "Пассажиры"
    }

    fun toPaymentView(view: View) {
        val intent = Intent(this, PaymentActivity::class.java)
        startActivity(intent)

    }
}