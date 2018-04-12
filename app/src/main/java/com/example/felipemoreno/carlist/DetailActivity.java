package com.example.felipemoreno.carlist;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent it = getIntent();
        int marcaId;
        int modeloId;

        String[] fiat = new String[]{"Uno", "Strada", "Palio"};
        String[] chev = new String[]{"Corsa", "Spin", "Montana"};
        String[] volks = new String[]{"Gol", "Saveiro", "Golf"};
        String[] honda = new String[]{"Civic", "HRV", "City"};
        String[] fiatValor = new String[] {"1", "2", "3"};
        String[] chevValor = new String[] {"4", "5", "6"};
        String[] volksValor = new String[] {"7", "8", "9"};
        String[] hondaValor = new String[] {"10", "11", "12"};
        Integer[] fiatImage = new Integer[] {R.drawable.uno, R.drawable.strada, R.drawable.palio};
        Integer[] chevImage = new Integer[] {R.drawable.corsa, R.drawable.spin, R.drawable.montana};
        Integer[] volksImage = new Integer[] {R.drawable.gol, R.drawable.saveiro, R.drawable.golf};
        Integer[] hondaImage = new Integer[] {R.drawable.civic, R.drawable.hrv, R.drawable.city};

        TextView tvNome = findViewById(R.id.tvNome);
        TextView tvValor = findViewById(R.id.tvValor);
        ImageView imgCarro = findViewById(R.id.imgCarro);

        if (it != null){
            marcaId = it.getIntExtra("marcaId", 5);
            modeloId = it.getIntExtra("modeloId", 5);

            switch (marcaId){
                case 0:
                    switch (modeloId){
                        case 0:
                            tvNome.setText(fiat[0]);
                            tvValor.setText(fiatValor[0]);
                            imgCarro.setImageResource(fiatImage[0]);
                            break;
                        case 1:
                            tvNome.setText(fiat[1]);
                            tvValor.setText(fiatValor[1]);
                            imgCarro.setImageResource(fiatImage[1]);
                            break;
                        case 2:
                            tvNome.setText(fiat[2]);
                            tvValor.setText(fiatValor[2]);
                            imgCarro.setImageResource(fiatImage[2]);
                            break;
                    }
                    break;
                case 1:
                    switch (modeloId){
                        case 0:
                            tvNome.setText(chev[0]);
                            tvValor.setText(chevValor[0]);
                            imgCarro.setImageResource(chevImage[0]);
                            break;
                        case 1:
                            tvNome.setText(chev[1]);
                            tvValor.setText(chevValor[1]);
                            imgCarro.setImageResource(chevImage[1]);
                            break;
                        case 2:
                            tvNome.setText(chev[2]);
                            tvValor.setText(chevValor[2]);
                            imgCarro.setImageResource(chevImage[2]);
                            break;
                    }
                    break;
                case 2:
                    switch (modeloId){
                        case 0:
                            tvNome.setText(volks[0]);
                            tvValor.setText(volksValor[0]);
                            imgCarro.setImageResource(volksImage[0]);
                            break;
                        case 1:
                            tvNome.setText(volks[1]);
                            tvValor.setText(volksValor[1]);
                            imgCarro.setImageResource(volksImage[1]);
                            break;
                        case 2:
                            tvNome.setText(volks[2]);
                            tvValor.setText(volksValor[2]);
                            imgCarro.setImageResource(volksImage[2]);
                            break;
                    }
                    break;
                case 3:
                    switch (modeloId){
                        case 0:
                            tvNome.setText(honda[0]);
                            tvValor.setText(hondaValor[0]);
                            imgCarro.setImageResource(hondaImage[0]);
                            break;
                        case 1:
                            tvNome.setText(honda[1]);
                            tvValor.setText(hondaValor[1]);
                            imgCarro.setImageResource(hondaImage[1]);
                            break;
                        case 2:
                            tvNome.setText(honda[2]);
                            tvValor.setText(hondaValor[2]);
                            imgCarro.setImageResource(hondaImage[2]);
                            break;
                    }
                    break;
            }
        }
    }
}
