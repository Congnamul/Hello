package com.example.mpizza2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    ImageView img_pizza_main;
    RadioButton pizza1, pizza2, pizza3, medium, large;
    Button btn_minus, btn_plus, btn_pay;
    EditText edit_cola_count;
    TextView txt_pizza_price, txt_size_price,txt_cola_price, txt_total_price;
    CheckBox chk_agree;

    int val_pizza_price = 10000;
    int val_size_price = 0;

    int val_cola_count = 1;
    int val_cola_price = 1000;
    int val_total_pay = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_pizza_main = findViewById(R.id.img_pizza_main);
        pizza1 = findViewById(R.id.pizza1);
        pizza2 = findViewById(R.id.pizza2);
        pizza3 = findViewById(R.id.pizza3);
        medium = findViewById(R.id.medium);
        large = findViewById(R.id.large);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_pay = findViewById(R.id.btn_pay);
        edit_cola_count = findViewById(R.id.edit_cola_count);
        txt_pizza_price = findViewById(R.id.txt_pizza_price);
        txt_cola_price = findViewById(R.id.txt_cola_price);
        txt_size_price = findViewById(R.id.txt_size_price);
        txt_total_price = findViewById(R.id.txt_total_pay);
        chk_agree = findViewById(R.id.chk_agree);

        pizza1.setOnClickListener(this);
        pizza2.setOnClickListener(this);
        pizza3.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_pay.setOnClickListener(this);
        chk_agree.setOnClickListener(this);
        medium.setOnClickListener(this);
        large.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId() ) {
            case R.id.pizza1:
                img_pizza_main.setImageResource(R.drawable.menu_pizza1);
                val_pizza_price = 10000;
                MakeSum();
                break;
            case R.id.pizza2:
                img_pizza_main.setImageResource(R.drawable.menu_pizza2);
                val_pizza_price = 20000;
                break;
            case R.id.pizza3:
                img_pizza_main.setImageResource(R.drawable.menu_pizza3);
                val_pizza_price = 30000;
                break;
            case R.id.medium:
                break;
        }

    }

    private void MakeSum() {
        txt_pizza_price.setText(val_pizza_price+"원");

    }
}



