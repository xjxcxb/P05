package sg.edu.rp.c346.id22001027.p05ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set click listeners for each module TextView

        TextView module1 = findViewById(R.id.module1);
        TextView module2 = findViewById(R.id.module2);
        TextView module3 = findViewById(R.id.module3);
        TextView module4 = findViewById(R.id.module4);
        TextView module5 = findViewById(R.id.module5);
        TextView module6 = findViewById(R.id.module6);
        TextView module7 = findViewById(R.id.module7);

        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Details("C346", "Mobile App Development", "2023", "1", 4, "E63A", "Andy Tao");
            }
        });

        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details("C203", "Web Appln Development in php", "2023", "1", 4, "W65C", "Annie Ong");
            }
        });

        module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details("G953", "Life Skills III", "2023", "1", 1, "E-Learning", "Andrew V");
            }
        });

        module4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details("C218", "UI/UX Design for Apps", "2023", "1", 4, "W65C", "Stanley Tan");
            }
        });

        module5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details("C235", "IT Security and Management", "2023", "1", 4, "W65C", "Hygin Fernandez");
            }
        });

        module6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details("C206", "Software Development Process", "2023", "1", 4, "W65C", "Yong Yoke Fong");
            }
        });

        module7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details("C390", "Portfolio Development", "2023", "1", 4, "W65C", "Derek Lee");
            }
        });
    }

    private void Details(String moduleCode, String moduleName, String academicYear, String semester, int moduleCredit, String venue, String lecturer) {
        Intent intent = new Intent(MainActivity.this, Second.class);
        intent.putExtra("moduleCode", moduleCode);
        intent.putExtra("moduleName", moduleName);
        intent.putExtra("academicYear", academicYear);
        intent.putExtra("semester", semester);
        intent.putExtra("moduleCredit", moduleCredit);
        intent.putExtra("venue", venue);
        intent.putExtra("lecturer", lecturer);
        startActivity(intent);
    }

    // ...
}
