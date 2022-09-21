package com.example.yoroba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ArrayList<NumberHelper>list=new ArrayList<>();
        list.add(new NumberHelper("q","q",R.drawable.funny));
        list.add(new NumberHelper("e","e",R.drawable.funny));
        list.add(new NumberHelper("f","f",R.drawable.funny));
        list.add(new NumberHelper("h","h",R.drawable.funny));
        list.add(new NumberHelper("y","y",R.drawable.funny));

        NumberAdapter adapter=new
                NumberAdapter(this,list);
        ListView listView=findViewById(R.id.listNumber);
        listView.setAdapter(adapter);
    }
}
