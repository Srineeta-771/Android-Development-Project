package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends AppCompatActivity
{
    TextView display;
    Button calculate;
    EditText etweight, etheight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        display = findViewById(R.id.display);
        calculate = findViewById(R.id.calculate);
        etweight = findViewById(R.id.etweight);
        etheight = findViewById(R.id.etheight);

        calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String h, w;
                float wt, ht, bmi;
                w = etweight.getText().toString();
                h = etheight.getText().toString();

                wt = Float.parseFloat(w);
                ht = Float.parseFloat(h);

                bmi = wt/(ht*ht);
                if(bmi<20)
                    display.setText(bmi+ ", Underweight");
                else if(bmi>=20 && bmi<=25)
                    display.setText(bmi+ ", Healthy");
                else if(bmi>25 && bmi<=30)
                    display.setText(bmi+ ", Over Weight");
                else if(bmi>30 && bmi<=40)
                    display.setText(bmi+ ", Obese");
                else
                    display.setText(bmi+ ", very Obese");
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}