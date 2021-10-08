package com.example.lb_1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String[] words={"Black","Blue","Red","Green"};
    private static final String[] colors={"#FF000000","#122385","#B51105","#157C1A"};
    private int a=0;
    private int b=0;
private TextView textView;
private Button button1;
private Button button2;
private ImageButton button;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button1=findViewById(R.id.button_yes);
        button2=findViewById(R.id.button_no);
        button=findViewById(R.id.button_rest);
        a=(int)(Math.random()*4);
        b=(int)(Math.random()*4);
        textView.setText(words[a]);
        textView.setTextColor(Color.parseColor(colors[b]));

        View.OnClickListener onClickListenerRest=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 a=(int)(Math.random()*4);
                 b=(int)(Math.random()*4);
                textView.setText(words[a]);
                textView.setTextColor(Color.parseColor(colors[b]));
            }
        };
        button.setOnClickListener(onClickListenerRest);

        View.OnClickListener onClickListenerYes=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(a==b){
                textView.setText("Ответ верный");
            }
            else {
                textView.setText("Ответ неверный");
            }
        }
    };

        button1.setOnClickListener(onClickListenerYes);

    View.OnClickListener onClickListenerNo=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(a==b){
                textView.setText("Ответ неверный");
            }
            else {
                textView.setText("Ответ верный");
            }
        }
    };

        button2.setOnClickListener(onClickListenerNo);

    }
}