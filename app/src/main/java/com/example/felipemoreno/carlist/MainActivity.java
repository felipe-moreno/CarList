package com.example.felipemoreno.carlist;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        String[] marcas = new String[] {"Fiat", "Chevrolet", "Volkswagen", "Honda"};

        ArrayAdapter<String> array = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, marcas);

        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView l , View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, SecondActivity.class);
        it.putExtra("marcaId", position);
        startActivity(it);
    }
}
