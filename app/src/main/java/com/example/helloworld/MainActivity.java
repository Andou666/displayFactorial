package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstText = (TextView)findViewById(R.id.firstText);
        int n = 10;

        /* タイトル名を変更 */
        //String message = "タイトル";
        //this.setTitle(message);

        /* 20の階乗をタイトルに表示 */
        //long product = 1L;
        //for(int i = 1; i<= 20; i++){
        //  product = product * i;
        //}
        //this.setTitle(String.valueOf(product));

        long factorial = calculateFactorial(n);

        /* タイトルに階乗を表示 */
        //this.setTitle(String.valueOf(factorial));

        this.setTitle(String.valueOf(n) + "の階乗");
        firstText.setText(String.valueOf(factorial));
        firstText.setTextSize(30.5f);
        int color = ContextCompat.getColor(getApplicationContext(), R.color.colorAccent);
        firstText.setTextColor(color);

    }

    /* 階乗を求める */
    private long calculateFactorial(int n){
        long product = 1L;
        for(int i = 1; i <= n; i++){
            product = product * i;
        }
        return product;
    }
}
