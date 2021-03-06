package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dtu extends AppCompatActivity {
      Button b1,b2,b3,b4,b5,b6,b7;
      TextView[] tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtu);

        tv=new TextView[7];
        tv[0]=findViewById(R.id.tv1a);
        tv[1]=findViewById(R.id.tv1b);
        tv[2]=findViewById(R.id.tv1c);
        tv[3]=findViewById(R.id.tv1d);
        tv[4]=findViewById(R.id.tv1e);
        tv[5]=findViewById(R.id.tv1f);
        tv[6]=findViewById(R.id.tv1g);
        View.OnClickListener textClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t= (TextView)view;
                Intent intent= new Intent(getApplicationContext(),PopUp.class);
                intent.putExtra("event_name",t.getText().toString());
                startActivity(intent);
            }
        };
        for(int i=0; i<7; i++)
            tv[i].setOnClickListener(textClick);


        b1=findViewById(R.id.btn1a);
        b2=findViewById(R.id.btn1b);
        b3=findViewById(R.id.btn1c);
        b4=findViewById(R.id.btn1d);
        b5=findViewById(R.id.btn1e);
        b6=findViewById(R.id.btn1f);
        b7=findViewById(R.id.btn1g);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Bytes";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P",s);
                startActivity(inti);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="SudoCode";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Programmer's DATE";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Code Golf";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Infinity";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Codethon";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Cranium";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Delhi Technological University";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });

    }
}
