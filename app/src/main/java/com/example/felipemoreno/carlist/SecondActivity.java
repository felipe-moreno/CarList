package com.example.felipemoreno.carlist;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends ListActivity {

    int marcaId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);

        Intent it = getIntent();

        String[] marcas = new String[] {"Fiat", "Chevrolet", "Volkswagen", "Honda"};
        String[] fiat = new String[]{"Uno", "Strada", "Palio"};
        String[] chev = new String[]{"Corsa", "Spin", "Montana"};
        String[] volks = new String[]{"Gol", "Saveiro", "Golf"};
        String[] honda = new String[]{"Civic", "HRV", "City"};

        ArrayAdapter<String> array = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, fiat);

        if (it != null) {
            marcaId = it.getIntExtra("marcaId", 4);
            if (marcaId == 0) {
                array = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, fiat);
            } else if (marcaId == 1) {
                array = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, chev);
            } else if (marcaId == 2) {
                array = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, volks);
            } else if (marcaId == 3) {
                array = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, honda);
            }
        }
        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, DetailActivity.class);
        it.putExtra("modeloId", position);
        it.putExtra("marcaId", marcaId);
        startActivity(it);
    }
}
