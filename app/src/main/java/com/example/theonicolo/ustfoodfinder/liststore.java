package com.example.theonicolo.ustfoodfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class liststore extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liststore);

        String[] buildings={"Bonchon", "Shakey's", "Mcdonalds"};
        ListAdapter buildingLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildings);
        ListView displayView = (ListView) findViewById(R.id.listespana);
        displayView.setAdapter(buildingLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice = String.valueOf(parent.getItemAtPosition(position));
                if (choice == "Bonchon") {
                    Intent intent = new Intent(getApplicationContext(), storeInfo.class);
                    startActivity(intent);
                } else if (choice == "Shakey's") {
                    Intent intent = new Intent(getApplicationContext(), storeInfo.class);
                    startActivity(intent);
                } else if (choice == "Mcdonalds") {
                    Intent intent = new Intent(getApplication(), storeInfo.class);
                    startActivity(intent);
                }
            }
        })
    ;}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.liststore, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
