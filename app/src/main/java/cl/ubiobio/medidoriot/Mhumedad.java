package cl.ubiobio.medidoriot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mhumedad extends AppCompatActivity {

    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhumedad);

        volver = (Button)findViewById(R.id.volverM);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volvermenu = new Intent(Mhumedad.this, MainActivity.class);
                startActivity(volvermenu);
            }
        });


    }
}
