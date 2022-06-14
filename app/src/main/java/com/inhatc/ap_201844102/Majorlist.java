package com.inhatc.ap_201844102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Majorlist extends AppCompatActivity {


    ListView listView;
    MyBaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majorlist);


        ListView listView = (ListView) findViewById(R.id.listView);

        adapter = new MyBaseAdapter(this);
        Resources res = getResources();

        final String[] nation = getResources().getStringArray(R.array.nation);
        String[] explain = getResources().getStringArray(R.array.explain);
        String [] population = getResources().getStringArray(R.array.population);
        final String[] capital = getResources().getStringArray(R.array.capital);

        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation00),nation[0],explain[0],population[0]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation01),nation[1],explain[1],population[1]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation02),nation[2],explain[2],population[2]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation03),nation[3],explain[3],population[3]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation04),nation[4],explain[4],population[4]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation05),nation[5],explain[5],population[5]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation06),nation[6],explain[6],population[6]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation07),nation[7],explain[7],population[7]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation08),nation[8],explain[8],population[8]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation09),nation[9],explain[9],population[9]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation10),nation[0],explain[10],population[10]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation11),nation[11],explain[11],population[11]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation12),nation[12],explain[12],population[12]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation13),nation[13],explain[13],population[13]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation14),nation[14],explain[14],population[14]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation15),nation[15],explain[15],population[15]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation16),nation[16],explain[16],population[16]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation17),nation[17],explain[17],population[17]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation18),nation[18],explain[18],population[18]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation19),nation[19],explain[19],population[19]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation20),nation[20],explain[20],population[20]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation21),nation[21],explain[21],population[21]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation22),nation[22],explain[22],population[22]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation23),nation[23],explain[23],population[23]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation24),nation[24],explain[24],population[24]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation25),nation[25],explain[25],population[25]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation26),nation[26],explain[26],population[26]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation27),nation[27],explain[27],population[27]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation28),nation[28],explain[28],population[28]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation29),nation[29],explain[29],population[29]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation30),nation[30],explain[30],population[30]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation31),nation[31],explain[31],population[31]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation32),nation[32],explain[32],population[32]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation33),nation[33],explain[33],population[33]));

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemDataBox currentItem = (ItemDataBox) adapter.getItem(position);
                String[] currentData = currentItem.getData();

                Toast.makeText(getApplicationContext(), nation[position]+": "+capital[position],Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id ==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}