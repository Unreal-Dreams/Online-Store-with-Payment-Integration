package com.example.productscategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;
    private ElegantNumberButton quantity1,quantity2,quantity3;
    private TextView mrp1,mrp2,mrp3;
    private EditText quantitypages;


    public static final String PRICE="Price of article";
    public static final String QUANTITY="Quantity of  article";
    public static final String NAME="Name of item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.price1);
        btn2=(Button) findViewById(R.id.price2);
        btn3=(Button) findViewById(R.id.price3);
        btn4=(Button) findViewById(R.id.price4);
        quantity1=(ElegantNumberButton) findViewById(R.id.elegantNumberButton);
        quantity2=(ElegantNumberButton) findViewById(R.id.elegantNumberButton2);
        quantity3=(ElegantNumberButton) findViewById(R.id.elegantNumberButton3);

        mrp1=(TextView) findViewById(R.id.mrp1);
        mrp2=(TextView) findViewById(R.id.mrp2);
        mrp3=(TextView) findViewById(R.id.mrp3);

        mrp1.setPaintFlags(mrp1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp2.setPaintFlags(mrp2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp3.setPaintFlags(mrp3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        quantitypages=(EditText) findViewById(R.id.quantitypages);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity1.getNumber());
                String name="Soft cover 26 pages";
                intent.putExtra(NAME,name);
                intent.putExtra(QUANTITY,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*25);
                intent.putExtra(PRICE,totalprice);


                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity2.getNumber());
                intent.putExtra(NAME,"Soft cover 40 pages");
                intent.putExtra(QUANTITY,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*32);
                intent.putExtra(PRICE,totalprice);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity3.getNumber());
                intent.putExtra(NAME,"Hard cover 42 pages");
                intent.putExtra(QUANTITY,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*43);
                intent.putExtra(PRICE,totalprice);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantitypages.getText());
                if(quantity.equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter the quantity of assignment pages",Toast.LENGTH_LONG).show();
                }else {
                    intent.putExtra(NAME, "Assignment Pages");
                    intent.putExtra(QUANTITY, quantity);
                    String totalprice = String.valueOf(Integer.parseInt(quantity) * 0.5);
                    intent.putExtra(PRICE, totalprice);

                    startActivity(intent);
                }
            }
        });
    }
}
