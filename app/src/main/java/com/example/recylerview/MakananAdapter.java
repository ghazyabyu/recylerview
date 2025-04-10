package com.example.recylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder>{
    // array list data yang akan kita olah di adapter

    ArrayList<Modelmakanan> listMakanan;

    private final OnItemClickListener listener;


    public interface OnItemClickListener{
        void onItemClick(Modelmakanan modelmakanan);
    }

    public MakananAdapter(ArrayList<Modelmakanan> listMakanan, OnItemClickListener listener){
        this.listMakanan = listMakanan;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ViewHolder holder, int position) {
        Modelmakanan makanan = this.listMakanan.get(position);
        holder.tvNamaMakanan.setText(makanan.getNamaMakanan());
        holder.tvharga.setText(makanan.getHargaMakanan());
        holder.imageview.setImageResource(makanan.getImage());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makanan));
    }



    @Override
    public int getItemCount() {
        return this.listMakanan.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNamaMakanan;
        TextView tvharga;
        ImageView imageview;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaMakanan = (TextView) itemView.findViewById(R.id.tvNamaMakanan);
            tvharga = (TextView) itemView.findViewById(R.id.tvharga);
            imageview = (ImageView) itemView.findViewById(R.id.imageview);
        }}

}
