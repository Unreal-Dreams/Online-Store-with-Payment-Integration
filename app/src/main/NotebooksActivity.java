package com.example.productscategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class NotebooksActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    private ElegantNumberButton quantity1,quantity2,quantity3,quantity4,quantity5,quantity6,quantity7;
    private TextView mrp1,mrp2,mrp3,mrp4,mrp5,mrp6,mrp7;

    public static final String PRICE1="Price of article";
    public static final String QUANTITY1="Quantity of  article";
    public static final String NAME1="Name of item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notebooks);

        btn1=(Button) findViewById(R.id.price1);
        btn2=(Button) findViewById(R.id.price2);
        btn3=(Button) findViewById(R.id.price3);
        btn4=(Button) findViewById(R.id.price4);
        btn5=(Button) findViewById(R.id.price5);
        btn6=(Button) findViewById(R.id.price6);
        btn7=(Button) findViewById(R.id.price7);

        quantity1=(ElegantNumberButton) findViewById(R.id.elegantNumberButton);
        quantity2=(ElegantNumberButton) findViewById(R.id.elegantNumberButton2);
        quantity3=(ElegantNumberButton) findViewById(R.id.elegantNumberButton3);
        quantity4=(ElegantNumberButton) findViewById(R.id.elegantNumberButton4);
        quantity5=(ElegantNumberButton) findViewById(R.id.elegantNumberButton5);
        quantity6=(ElegantNumberButton) findViewById(R.id.elegantNumberButton6);
        quantity7=(ElegantNumberButton) findViewById(R.id.elegantNumberButton7);


        mrp1=(TextView) findViewById(R.id.mrp1);
        mrp2=(TextView) findViewById(R.id.mrp2);
        mrp3=(TextView) findViewById(R.id.mrp3);
        mrp4=(TextView) findViewById(R.id.mrp4);
        mrp5=(TextView) findViewById(R.id.mrp5);
        mrp6=(TextView) findViewById(R.id.mrp6);
        mrp7=(TextView) findViewById(R.id.mrp7);

        mrp1.setPaintFlags(mrp1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp2.setPaintFlags(mrp2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp3.setPaintFlags(mrp3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp4.setPaintFlags(mrp4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp5.setPaintFlags(mrp5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp6.setPaintFlags(mrp6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        mrp7.setPaintFlags(mrp7.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity1.getNumber());
                String name="Classmate Notebook";
                intent.putExtra(NAME1,name);
                intent.putExtra(QUANTITY1,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*68);
                intent.putExtra(PRICE1,totalprice);


                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity2.getNumber());
                intent.putExtra(NAME1,"Classmate Noteboook");
                intent.putExtra(QUANTITY1,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*85);
                intent.putExtra(PRICE1,totalprice);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity3.getNumber());
                String name="Classmate Notebook";
                intent.putExtra(NAME1,name);
                intent.putExtra(QUANTITY1,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*128);
                intent.putExtra(PRICE1,totalprice);


                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity4.getNumber());
                intent.putExtra(NAME1,"Classmate Notebook");
                intent.putExtra(QUANTITY1,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*51);
                intent.putExtra(PRICE1,totalprice);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity5.getNumber());
                intent.putExtra(NAME1,"Rough Notebook");
                intent.putExtra(QUANTITY1,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*30);
                intent.putExtra(PRICE1,totalprice);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity6.getNumber());
                    intent.putExtra(NAME1, "Assignment Pages");
                    intent.putExtra(QUANTITY1, quantity);
                    String totalprice = String.valueOf(Integer.parseInt(quantity) * 52);
                    intent.putExtra(PRICE1, totalprice);

                    startActivity(intent);

            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(NotebooksActivity.this,PaymentActivity.class);
                String quantity=String.valueOf(quantity7.getNumber());
                String name="Classmate Notebook";
                intent.putExtra(NAME1,name);
                intent.putExtra(QUANTITY1,quantity);
                String totalprice=String.valueOf(Integer.parseInt(quantity)*38);
                intent.putExtra(PRICE1,totalprice);


                startActivity(intent);

            }
        });



    }
}
