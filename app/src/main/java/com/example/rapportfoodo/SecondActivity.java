package com.example.rapportfoodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView rec;
    private Button ord,inst;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    public static final int intent=R.id.second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rec=findViewById(R.id.textViewDishName);
        ord=findViewById(R.id.buttonOrder);
        inst=findViewById(R.id.buttonGetRecipe);

        Intent i=getIntent();
        String r=i.getStringExtra("Recipe");
        rec.setText(r);
        Log.i("Sec",r);
        Data d=new Data();
        Data.setName(r);

        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstFragment=new FirstFragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=manager.beginTransaction();
                fragmentTransaction.add(intent,firstFragment);
                fragmentTransaction.commit();
            }
        });
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondFragment=new SecondFragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=manager.beginTransaction();
                fragmentTransaction.add(intent,secondFragment);
                fragmentTransaction.commit();

            }
        });

    }
}