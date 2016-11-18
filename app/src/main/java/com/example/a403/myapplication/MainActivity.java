package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    CheckBox checkBox1;
    RadioButton r1,r2,r3;
    Button btn1;
    ImageView img1;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.textView1);
        tv2 = (TextView)findViewById(R.id.textView2);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox);
        rg = (RadioGroup)findViewById(R.id.radioGroup4);
        r1 = (RadioButton)findViewById(R.id.radioButton1);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        btn1 = (Button)findViewById(R.id.button);
        img1 = (ImageView)findViewById(R.id.imageView);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv2.setVisibility(View.VISIBLE);
                    r1.setVisibility(View.VISIBLE);
                    r2.setVisibility(View.VISIBLE);
                    r3.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                }
                else{
                    tv2.setVisibility(View.INVISIBLE);
                    r1.setVisibility(View.INVISIBLE);
                    r2.setVisibility(View.INVISIBLE);
                    r3.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setVisibility(View.VISIBLE);
                if(r1.isChecked()){
                    img1.setImageResource(R.drawable.a);
                }
                else if(r2.isChecked()){
                    img1.setImageResource(R.drawable.b);
                }
                if(r3.isChecked()){
                    img1.setImageResource(R.drawable.c);
                }
            }
        });
    }
}
