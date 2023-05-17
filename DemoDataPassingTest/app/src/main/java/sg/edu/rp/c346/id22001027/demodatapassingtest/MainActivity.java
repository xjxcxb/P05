package sg.edu.rp.c346.id22001027.demodatapassingtest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Event handling Step 1
    Button btnPassInteger;
    Button btnPassCharacter;
    TextView tvPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Event handling Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassCharacter = findViewById(R.id.buttonPassChar);
        tvPassDouble = findViewById(R.id.textViewPassDouble);

        // Event handling Step 3 - Pass Integer
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        // Event handling Step 3 - Pass Character
        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("character", 'a');
                startActivity(intent);
            }
        });

        // Event handling Step 3 - Pass Double
        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("doubleValue", 99.99);
                startActivity(intent);
            }
        });
    }
}
