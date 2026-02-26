package ru.mirea.tuzovavr.buttonclickerr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;

    private CheckBox check;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        check = findViewById(R.id.check);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 18");
                check.performClick();
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

        View.OnClickListener oclBtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Это не я сделал");
                check.performClick();
            }
        };
        btnItIsNotMe.setOnClickListener(oclBtnItIsNotMe);
    }
}


