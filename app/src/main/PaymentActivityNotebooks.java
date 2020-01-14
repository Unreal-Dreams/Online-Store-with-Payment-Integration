package com.example.productscategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PaymentActivityNotebooks extends AppCompatActivity {

    private TextView txtname,txtquantity,txttotalprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_notebooks);

        txtname=(TextView) findViewById(R.id.txtname);
        txtquantity=(TextView) findViewById(R.id.txtquantity);
        txttotalprice=(TextView) findViewById(R.id.txttotalprice);

        Intent intent=getIntent();
        String name=intent.getStringExtra(NotebooksActivity.NAME1);
        String quantity=intent.getStringExtra(NotebooksActivity.QUANTITY1);
        String totalp=intent.getStringExtra(NotebooksActivity.PRICE1);

        txtname.setText(name);
        txttotalprice.setText(totalp);
        txtquantity.setText(quantity);
    }
}
