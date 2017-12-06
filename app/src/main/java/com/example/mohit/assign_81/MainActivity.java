package com.example.mohit.assign_81;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] month= new String[]{"April","Feb","Jan","July","June","March",};

    String[] month1= new String[]{ "May", "Mar","Jun" , "July","Jan","Feb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1= (Button)findViewById(R.id.btnacc);
        Button btn2= (Button)findViewById(R.id.btndcc);
        list= (ListView)findViewById(R.id.listview1);



        View.OnClickListener click= new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ArrayAdapter<String> adapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, month);
                list.setAdapter(adapter);



            }
        };

        btn1.setOnClickListener(click);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, month1);
                list.setAdapter(adapter);
            }
        });
}
}
