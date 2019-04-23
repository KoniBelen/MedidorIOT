package cl.ubiobio.medidoriot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MradiacionUV extends AppCompatActivity {

    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mradiacion_uv);

        volver = (Button)findViewById(R.id.almenu);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iralmenu = new Intent(MradiacionUV.this,MainActivity.class);
                startActivity(iralmenu);
            }
        });
    }
}
