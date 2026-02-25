package ru.mirea.tuzovavr.control_lesson1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMain = findViewById(R.id.textView);
        editTextMain = findViewById(R.id.editText);
        buttonMain = findViewById(R.id.button);
        imageButtonMain = findViewById(R.id.imageButton);
        checkBoxMain = findViewById(R.id.checkBox);
        imageViewMain = findViewById(R.id.imageView);

    }
    private TextView textViewMain;
    private EditText editTextMain;
    private Button buttonMain;
    private ImageButton imageButtonMain;
    private CheckBox checkBoxMain;
    private ImageView imageViewMain;

}