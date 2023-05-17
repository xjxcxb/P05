package sg.edu.rp.c346.id22001027.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        String answer = questionSelected + " answer is: Gone";
        tvAnswer.setText(answer);
    }
}


