package sg.edu.rp.c346.id22001027.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    // Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Step 2
        tvAnswer = findViewById(R.id.textView);
        char character = getIntent().getCharExtra("character", ' ');
        tvAnswer.setText("Character value received is: " + character);
    }
}
