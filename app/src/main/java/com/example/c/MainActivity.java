package com.example.c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SHOW(View view) {
        EditText a = findViewById(R.id.ed_name);
        EditText h =(EditText) findViewById(R.id.ed_height);
        EditText w =(EditText) findViewById(R.id.ed_weight);
        ImageView view1 =(ImageView) findViewById(R.id.iv_pic);

        double w_value = Double.parseDouble(w.getText().toString());
        double h_value = Double.parseDouble(h.getText().toString());
        double bmi = w_value / (h_value/100.0*h_value/100.0);

        DecimalFormat df = new DecimalFormat("# .#");

        TextView b = findViewById(R.id.tv_showbmi);

        String msg;
        if(bmi<18.5){
            msg= "體重過輕";
            Toast.makeText(this, "體重過輕", Toast.LENGTH_SHORT).show();
            view1.setImageResource(R.drawable.b1);
        }else if(bmi>24) {
            msg = "體重過重";
            Toast.makeText(this, "體重過重", Toast.LENGTH_SHORT).show();
            view1.setImageResource(R.drawable.b2);
        }else{
                msg= "體重正常";
                Toast.makeText(this, "體重正常", Toast.LENGTH_SHORT).show();
                view1.setImageResource(R.drawable.b3);
        b.setText(n.getText().toString()+"你的BMI是"+df.format(bmi)+msg);

    }
}
