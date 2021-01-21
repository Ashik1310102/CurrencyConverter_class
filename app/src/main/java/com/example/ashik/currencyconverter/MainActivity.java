package com.example.ashik.currencyconverter;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEnterNumber;
    TextView tvDollarP,tvPoundP,tvEuroP,tvRialP;
    Double convertValu,dollarD,poundD,euroD,rialD;

    public void converter(View view){
        String enterValu= String.valueOf(etEnterNumber.getText());
        if(enterValu.length()>11){
            Toast.makeText(MainActivity.this,"Place Enter lase than 99 Billion ",Toast.LENGTH_LONG).show();
            tvDollarP.setText("0.0");
            tvPoundP.setText("0.0");
            tvEuroP.setText("0.0");
            tvRialP.setText("0.0");
        }
        else{
            convertValu= Double.parseDouble(enterValu);
            dollarD=convertValu*0.016;//Australian Dollar
            poundD=convertValu*0.21923;//Egyptian Pound
            euroD=convertValu*0.010480;//Euro
            rialD=convertValu*0.038640;//Brazilian Real
            //setText(new DecimalFormat("##.##").format(i2))
            tvDollarP.setText(String.format("%.2f",dollarD));
            tvPoundP.setText(String.format("%.2f",poundD));
            tvEuroP.setText(String.format("%.2f",euroD));
            tvRialP.setText(String.format("%.2f",rialD));
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDollarP= (TextView) findViewById(R.id.tvDollarP);
        tvPoundP= (TextView) findViewById(R.id.tvPoundP);
        tvEuroP= (TextView) findViewById(R.id.tvEuroP);
        tvRialP= (TextView) findViewById(R.id.tvRialP);
        etEnterNumber= (EditText) findViewById(R.id.etEnterNumber);
    }
}
