
package com.example.sustainabilityandwellness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class secondsreen extends AppCompatActivity {
    RadioGroup glucose;
    TextView textView;
    RadioButton level140,level150,level180;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondsreen);
        RadioButton level140=(RadioButton)findViewById(R.id.level140);
        RadioButton level150=(RadioButton)findViewById(R.id.level150);
        RadioButton level180=(RadioButton)findViewById(R.id.level180);
        btn=(Button)findViewById(R.id.button);
        textView=(TextView)this.findViewById(R.id.bad);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(level140.isChecked())
                {
                    textView.setText("normal");
                }
                else if (level150.isChecked())
                {
                    textView.setText("prediabeties");
                }
                else if (level180.isChecked())
                {
                    textView.setText("diabeties");
                }
            }
        });
    }
}






