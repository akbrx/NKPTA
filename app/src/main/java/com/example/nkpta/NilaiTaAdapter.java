package com.example.nkpta;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NilaiTaAdapter extends RecyclerView.Adapter<NilaiTaAdapter.ViewHolder> {

    private Context context;
    private ArrayList<NilaiTaItem> modelta;

    public NilaiTaAdapter(Context context, ArrayList<NilaiTaItem> model) {
        this.context = context;
        this.modelta = model;
    }

    @NonNull
    @Override
    public NilaiTaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listmhsta,parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull NilaiTaAdapter.ViewHolder holder, int position) {
        holder.namaM.setText(modelta.get(position).getNamaM());
        holder.nimM.setText(modelta.get(position).getNimM());
        holder.judulM.setText(modelta.get(position).getJudulM());

        final int currentPosition = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NilaiTaItem clickedItem = modelta.get(currentPosition);

                if (context != null) {
                    Intent intent = new Intent(context, InputNilaiTA.class);
                    intent.putExtra("nama", clickedItem.getNamaM());
                    intent.putExtra("nim", clickedItem.getNimM());
                    intent.putExtra("judul", clickedItem.getJudulM());
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelta.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaM, nimM, judulM;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaM = itemView.findViewById(R.id.nama);
            nimM = itemView.findViewById(R.id.nim);
            judulM = itemView.findViewById(R.id.judulTA);
        }
    }
}
