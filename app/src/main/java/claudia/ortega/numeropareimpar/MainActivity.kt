package claudia.ortega.numeropareimpar

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var txtNumero = findViewById<TextView>(R.id.txtNumero)
        var txtResultado =  findViewById<TextView>(R.id.txtResultado)
        var btnCalcular =  findViewById<Button>(R.id.btnCalcular)

        val objCalculo = Calculo()
        btnCalcular.setOnClickListener {
            val Resultado = objCalculo.Calcular(txtNumero.text.toString().toInt())

            txtResultado.text = "Tu numero es $Resultado"
        }
    }
}