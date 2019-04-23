package cl.ubiobio.medidoriot;

import android.content.Intent;
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
