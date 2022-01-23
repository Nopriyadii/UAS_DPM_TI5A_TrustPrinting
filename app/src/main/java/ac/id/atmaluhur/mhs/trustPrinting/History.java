package ac.id.atmaluhur.mhs.trustPrinting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class History extends AppCompatActivity {
    ImageView Imagekembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Imagekembali = findViewById(R.id.Imagekembali);

        Imagekembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(History.this, Dashboard.class);
                startActivity(i);
            }
        });

    }
}