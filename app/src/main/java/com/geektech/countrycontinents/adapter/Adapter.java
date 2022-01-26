package com.geektech.countrycontinents.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.countrycontinents.data.Model;
import com.geektech.countrycontinents.interfaces.OnClick;
import com.geektech.countrycontinents.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private OnClick onClick;
    ArrayList<Model> continents;

    public Adapter(OnClick onClick, ArrayList<Model> continents) {
        this.onClick = onClick;
        this.continents = continents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.country_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(continents.get(position), context);
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(continents.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textContinents;
        private ImageView imageContinents;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageContinents = itemView.findViewById(R.id.image_continents);
            textContinents = itemView.findViewById(R.id.continents);
        }

        public void bind(Model model, Context context) {
            Glide.with(context).load(model.getImage()).into(imageContinents);
            textContinents.setText(model.getName());
        }
    }
}
