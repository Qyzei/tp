package com.example.myfirst_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button heybutton = findViewById (R.id.buttonSayHi);
        final TextView textViewDisplay = findViewById(R.id.textViewDisplay);
        final EditText editTextName = findViewById(R.id.editTextName);


        heybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= editTextName.getText().toString();
                if (name.isEmpty())
                textViewDisplay.setText("please provide a name");
                else
                    textViewDisplay.setText("Hello " +name);
                editTextName.setText("");
            }
        });
    }
}