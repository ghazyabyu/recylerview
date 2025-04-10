package com.example.recylerview;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity implements MakananAdapter.OnItemClickListener{

        RecyclerView rvlistmakanan;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

           rvlistmakanan = (RecyclerView) findViewById(R.id.rvlistmakanan);
           rvlistmakanan.setLayoutManager(new LinearLayoutManager(this));

            ArrayList<Modelmakanan> datamakanan = new ArrayList<>();
            datamakanan.add(new Modelmakanan("lontong","Rp.10.000",R.drawable.lontong));
            datamakanan.add(new Modelmakanan("martabak telor","Rp.12.000",R.drawable.martabak_telor));
            datamakanan.add(new Modelmakanan("martabak manis","Rp.12.000",R.drawable.martabak_manis));
            datamakanan.add(new Modelmakanan("lumpia","Rp.5.000",R.drawable.lumpia ));
            datamakanan.add(new Modelmakanan("nasi goreng","Rp.23.000",R.drawable.nasi_goreng ));
            datamakanan.add(new Modelmakanan("pindang serani","Rp25.000",R.drawable.pindang ));
            datamakanan.add(new Modelmakanan("rendang","Rp.13.000",R.drawable.rendang ));
            datamakanan.add(new Modelmakanan("sate","Rp.12.000",R.drawable.sate ));


            MakananAdapter adapterListMakanan = new MakananAdapter(datamakanan,this);
            rvlistmakanan.setAdapter(adapterListMakanan);
        }

        @Override
        public void onItemClick(Modelmakanan modelmakanan) {
            Intent in = new Intent(MainActivity.this,DetailMakanan.class);
            in.putExtra("namamakanan",modelmakanan.getNamaMakanan());
            in.putExtra("hargamakanan",modelmakanan.getHargaMakanan());
            in.putExtra("image",modelmakanan.getImage());
            startActivity(in);
        }
    }