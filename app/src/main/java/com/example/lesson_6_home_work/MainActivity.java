package com.example.lesson_6_home_work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView vhod = findViewById(R.id.vhod);
        TextView dobro = findViewById(R.id.dobro);
        TextView vp = findViewById(R.id.vp);
        TextView iz = findViewById(R.id.iz);

        EditText e1 = findViewById(R.id.e1);
        EditText e2 = findViewById(R.id.e2);


        Button b1 = findViewById(R.id.b1);


        TextView zb1 = findViewById(R.id.zb1);

        e1.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (e1.getText().toString().isEmpty()){
                    b1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
                }else{
                    b1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });

        e2.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (e2.getText().toString().isEmpty()){
                    b1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
                }else{
                    b1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });










        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("admin@mail.ru")&& e2.getText().toString().equals("admin")){
                    vhod.setVisibility(View.GONE);
                    vp.setVisibility(View.GONE);
                    e1.setVisibility(View.GONE);
                    e2.setVisibility(View.GONE);
                    b1.setVisibility(View.GONE);
                    zb1.setVisibility(View.GONE);
                    iz.setVisibility(View.GONE);

                    Toast.makeText(MainActivity.this, "вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();




                }else {
                    Toast.makeText(MainActivity.this, "не правельный логин или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}