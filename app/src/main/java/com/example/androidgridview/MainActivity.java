package com.example.androidgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView ;
    String []  Countryname;
    private  int [] Flags = {R.drawable.img1,R.drawable.img2,
            R.drawable.img14,R.drawable.img3,
            R.drawable.img13,R.drawable.img4,
            R.drawable.img12,R.drawable.img5,
            R.drawable.img11,R.drawable.img6,
            R.drawable.img10,R.drawable.img7,
            R.drawable.img9,R.drawable.img8,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridid);
        Countryname = getResources().getStringArray(R.array.country_names);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,Countryname,Flags);
        gridView.setAdapter(adapter);

        gridView.setVerticalScrollBarEnabled(false);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = Countryname[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
            }
        });


    }
}