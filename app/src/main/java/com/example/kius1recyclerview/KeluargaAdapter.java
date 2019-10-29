package com.example.kius1recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {

    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> dataList){
        this.dataList = dataList;
    }
    @NonNull
    @Override

    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }
    public void onBindViewHolder(KeluargaViewHolder holder, int position){
        holder.txt_nama.setText(dataList.get(position).GetNama());
        holder.txt_ket.setText(dataList.get(position).GetKet());
        holder.vfoto.setImageResource(dataList.get(position).GetFoto());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_nama, txt_ket;
        private ImageView vfoto;

        public KeluargaViewHolder(View itemView) {
            super(itemView);

            txt_nama = (TextView) itemView.findViewById(R.id.txt_nama);
            txt_ket = (TextView) itemView.findViewById(R.id.txt_ket);
            vfoto = (ImageView) itemView.findViewById(R.id.viewfoto);
        }
    }
}
