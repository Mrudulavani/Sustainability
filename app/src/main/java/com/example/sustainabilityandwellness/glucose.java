package com.example.sustainabilityandwellness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class glucose extends AppCompatActivity {
    RadioGroup glu;
    TextView enter;
    RadioButton level140,level150,level180;
    Button btn;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glucose);
        enter=(Button)findViewById(R.id.enter);
        RadioButton level140=(RadioButton)findViewById(R.id.level140);
        RadioButton level150=(RadioButton)findViewById(R.id.level150);
        RadioButton level180=(RadioButton)findViewById(R.id.level180);
        btn=(Button)findViewById(R.id.button);
        TextView textView = (TextView) this.findViewById(R.id.pick);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(level140.isChecked())
                {
                    textView.setText("good");
                }
                else if (level150.isChecked())
                {
                    textView.setText("normal");
                }
                else if (level180.isChecked())
                {
                    textView.setText("bad");
                }
            }
        });
    }
}






