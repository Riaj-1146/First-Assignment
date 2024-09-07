package com.example.smart_phone_application_assignment_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button Division_button;
    private Button Border_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_ban = findViewById(R.id.txt_ban);
        TextView textView = findViewById(R.id.txt_ban);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });



        ImageView img_bd = findViewById(R.id.img_bd);


        TextView txt_bd = findViewById(R.id.txt_bd);
        TextView textView2 = findViewById(R.id.txt_bd);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("");
            }
        });


        Division_button =(Button) findViewById(R.id.button_Div);
        Border_button =(Button) findViewById(R.id.button_Border);


        Division_button.setOnClickListener(v -> {

            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.customs_layout,findViewById(R.id.custom_toast_id));
            Toast toast=new Toast(MainActivity.this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.setView(layout);
            toast.show();

            Intent intent = new Intent(MainActivity.this,division_activity.class);
            startActivity(intent);



        });



        Border_button.setOnClickListener(v -> {

            LayoutInflater inflater = getLayoutInflater();
            View layout2 = inflater.inflate(R.layout.customs_layout2,findViewById(R.id.custom_toast_id2));
            Toast toast=new Toast(MainActivity.this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.setView(layout2);
            toast.show();

            Intent intent = new Intent(MainActivity.this,border_activity.class);
            startActivity(intent);


        });
    }


}
