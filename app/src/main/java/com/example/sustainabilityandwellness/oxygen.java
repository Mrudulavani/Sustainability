
package com.example.sustainabilityandwellness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class oxygen extends AppCompatActivity {
    RadioGroup parametero;
    Button enter;
    RadioButton nineghty,less90;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oxygen);
        enter=(Button)findViewById(R.id.enter);
        RadioButton nineghty=(RadioButton)findViewById(R.id.nineghty);
        RadioButton less90=(RadioButton)findViewById(R.id.less90);
        textView=(TextView)this.findViewById(R.id.good);
        enter.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(nineghty.isChecked())
                {
                    textView.setText("your health condition is good");
                }
                else if(less90.isChecked())
                {
                    textView.setText("bad...........");
                }
            }
        });
    }
}