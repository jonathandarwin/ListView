package com.example.user.listview25juli2018;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // THIS ARRAY OF STRING CAN BE REPLACED BY YOUR OWN MODEL
        String[] foods = {"Nasi Goreng", "Kebab", "Toripirikaradon", "Rocky", "Cinke", "Ciz & Chic", "AW", "Nasi Goreng", "Kebab", "Toripirikaradon", "Rocky", "Cinke", "Ciz & Chic", "AW"};
        ListAdapter foodsAdapter = new CustomAdapter(this, foods);

        ListView lvFood = (ListView) findViewById(R.id.lvFood);

        // SET THE CUSTOM ADAPTER TO YOUR LISTVIEW
        lvFood.setAdapter(foodsAdapter);

        // SET A LISTENER IF THE LIST IS CLICKED
        lvFood.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String toast = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
