package cl.ubiobio.medidoriot;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mtemperatura extends AppCompatActivity {

    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtemperatura);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        volver = (Button)findViewById(R.id.vuelveM);

       volver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent iralmenu = new Intent(Mtemperatura.this,MainActivity.class);
               startActivity(iralmenu);
           }
       });

    }
}
