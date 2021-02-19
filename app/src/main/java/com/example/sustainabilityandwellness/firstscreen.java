package com.example.sustainabilityandwellness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class firstscreen extends AppCompatActivity {
    private RadioGroup parameters;
    Button button;
    RadioButton glucose,respiration,oxygen,stress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton glucose=(RadioButton) findViewById(R.id.glucose);
                RadioButton respiration=(RadioButton) findViewById(R.id.respiration);
                RadioButton oxygen=(RadioButton) findViewById(R.id.oxygen);
                RadioButton stress=(RadioButton) findViewById(R.id.stress);

                if(glucose.isChecked())
                {
                    Intent page =new Intent(firstscreen.this,glucose.class);

                    startActivity(page);
                }
                else if(respiration.isChecked())
                {
                    Intent page=new Intent(firstscreen.this,respiration1.class);
                    startActivity(page);
                }
                else if(oxygen.isChecked())
                {
                    Intent page =new Intent(firstscreen.this,oxygen.class);
                    startActivity(page);
                }
                else if(stress.isChecked())
                {
                    Intent page =new Intent(firstscreen.this,stress.class);
                    startActivity(page);
                }
            }
        });
    }
}














