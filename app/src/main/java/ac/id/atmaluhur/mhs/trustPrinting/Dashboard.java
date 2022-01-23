package ac.id.atmaluhur.mhs.trustPrinting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {
    LinearLayout layoutCetakFoto, layoutAkun, layoutHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        layoutCetakFoto = findViewById(R.id.layoutCetakFoto);
        layoutAkun = findViewById(R.id.LayoutAkun);
        layoutHistory = findViewById(R.id.layoutHistory);

        layoutCetakFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, CetakFoto.class);
                startActivity(i);
            }
        });

        layoutAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, ProfilSaya.class);
                startActivity(i);
            }
        });

        layoutHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, History.class);
                startActivity(i);
            }
        });
    }
}