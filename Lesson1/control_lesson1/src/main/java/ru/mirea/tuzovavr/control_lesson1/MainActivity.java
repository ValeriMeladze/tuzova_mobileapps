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
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button);
        editTextMain = findViewById(R.id.editText);
        button.setText("MireaButton");
        imageButtonMain = findViewById(R.id.imageButton);
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
        imageViewMain = findViewById(R.id.imageView);

    }
    private TextView textViewMain;
    private EditText editTextMain;
    private Button buttonMain;
    private ImageButton imageButtonMain;
    private CheckBox checkBoxMain;
    private ImageView imageViewMain;

}