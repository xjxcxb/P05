package sg.edu.rp.c346.id22001027.p05ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Retrieve the module data from the intent
        String moduleCode = getIntent().getStringExtra("moduleCode");
        String moduleName = getIntent().getStringExtra("moduleName");
        String academicYear = getIntent().getStringExtra("academicYear");
        String semester = getIntent().getStringExtra("semester");
        int moduleCredit = getIntent().getIntExtra("moduleCredit", 0);
        String venue = getIntent().getStringExtra("venue");
        String lecturer = getIntent().getStringExtra("lecturer");

        // Display the module details in the activity_module_detail layout
        TextView textModuleCode = findViewById(R.id.text_module_code);
        TextView textModuleName = findViewById(R.id.text_module_name);
        TextView textAcademicYear = findViewById(R.id.text_academic_year);
        TextView textSemester = findViewById(R.id.text_semester);
        TextView textModuleCredit = findViewById(R.id.text_module_credit);
        TextView textVenue = findViewById(R.id.text_venue);
        TextView textLecturer = findViewById(R.id.text_lecturer);

        textModuleCode.setText("Module Code: " + moduleCode);
        textModuleName.setText("Module Name: " + moduleName);
        textAcademicYear.setText("Academic Year: " + academicYear);
        textSemester.setText("Semester: " + semester);
        textModuleCredit.setText("Module Credit: " + moduleCredit);
        textVenue.setText("Venue: " + venue);
        textLecturer.setText("Lecturer: " + lecturer);
    }
}
