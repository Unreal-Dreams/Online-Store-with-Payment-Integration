package com.example.productscategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    private TextView txtname,txtquantity,txttotalprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        txtname=(TextView) findViewById(R.id.txtname);
        txtquantity=(TextView) findViewById(R.id.txtquantity);
        txttotalprice=(TextView) findViewById(R.id.txttotalprice);

        Intent intent=getIntent();
        String name=intent.getStringExtra(MainActivity.NAME);
        String quantity=intent.getStringExtra(MainActivity.QUANTITY);
        String totalp=intent.getStringExtra(MainActivity.PRICE);

        txtname.setText(name);
        txttotalprice.setText(totalp);
        txtquantity.setText(quantity);
    }
}
