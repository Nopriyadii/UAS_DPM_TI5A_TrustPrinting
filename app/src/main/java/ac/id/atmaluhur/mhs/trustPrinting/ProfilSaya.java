package ac.id.atmaluhur.mhs.trustPrinting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfilSaya extends AppCompatActivity {
    ImageView imageKembaliProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_saya);

        imageKembaliProfil = findViewById(R.id.imageKembaliProfil);

        imageKembaliProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfilSaya.this, Dashboard.class);
                startActivity(i);
            }
        });

    }
}