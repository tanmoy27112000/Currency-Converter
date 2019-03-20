package com.codesera.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void clickFunction(View view){
        EditText dollar = (EditText)findViewById(R.id.dollarTextView);
        String samount =dollar.getText().toString();
        double amount =Double.parseDouble(dollar.getText().toString());
        double inr= amount*68.78;
        String sinr=Double.toString(inr);
        Toast.makeText(this,samount+"$ is "+sinr+"Rs",Toast.LENGTH_LONG).show();
        //Log.i("amount",dollar.getText().toString());
    }
}
