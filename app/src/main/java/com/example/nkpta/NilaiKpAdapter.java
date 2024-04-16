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

public class NilaiKpAdapter extends RecyclerView.Adapter<NilaiKpAdapter.ViewHolder> {

    private Context context;
    private ArrayList<NilaiKpItem> modelkp;

    public NilaiKpAdapter(Context context, ArrayList<NilaiKpItem> model) {
        this.context = context;
        this.modelkp = model;
    }

    @NonNull
    @Override
    public NilaiKpAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listmhskp,parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull NilaiKpAdapter.ViewHolder holder, int position) {
        holder.namaM.setText(modelkp.get(position).getNamaM());
        holder.nimM.setText(modelkp.get(position).getNimM());
        holder.judulM.setText(modelkp.get(position).getJudulM());

        final int currentPosition = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NilaiKpItem clickedItem = modelkp.get(currentPosition);

                if (context != null) {
                    Intent intent = new Intent(context, InputNilaiKP.class);
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
        return modelkp.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaM, nimM, judulM;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaM = itemView.findViewById(R.id.nama);
            nimM = itemView.findViewById(R.id.nim);
            judulM = itemView.findViewById(R.id.judulKP);
        }
    }
}
