package kz.alikhan.reis

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        title = "Оплата";
    }

    fun openPaymentDialog(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Оплачено")
        builder.setMessage("Чтобы посмотреть покупку перейдите в \"Историю заказов\"")

        builder.setPositiveButton("Ok"){dialogInterface, which ->
//            Toast.makeText(applicationContext,"clicked ok",Toast.LENGTH_LONG).show()
            val intent = Intent(this, OrderDetailsActivity::class.java)
            startActivity(intent)

        }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}