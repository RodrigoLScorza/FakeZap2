package br.com.nois.fakes.fakezap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.orhanobut.hawk.Hawk

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       // Toast.makeText(MainActivity@this, Hawk.get("TOKENFIREBASE",""),Toast.LENGTH_LONG).show()

    }
}
