package com.example.sustainabilityandwellness;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class respiration1 extends AppCompatActivity {
    RadioGroup res;
    TextView textView;
    RadioButton twenty,fourty,fifty;
    Button select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        select=(Button)findViewById(R.id.select);
        RadioButton twenty=(RadioButton)findViewById(R.id.twenty);
        RadioButton fourty=(RadioButton)findViewById(R.id.fourty);
        RadioButton fifty=(RadioButton)findViewById(R.id.fifty);
        textView=(TextView)this.findViewById(R.id.average);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(twenty.isChecked())
                {
                    textView.setText("good");
                }
                else if (fourty.isChecked())
                {
                    textView.setText("average");
                }
                else if (fifty.isChecked())
                {
                    textView.setText("bad");
                }
            }
        });
    }
}






