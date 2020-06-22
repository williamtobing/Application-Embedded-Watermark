package com.develops.phonearena;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class ListPhoneAdapter extends RecyclerView.Adapter<ListPhoneAdapter.PhoneViewHolder> {

    private ArrayList<String> merk;
    private ArrayList<String> spek;
    private ArrayList<String> image;
    private Context nContext;

    public ListPhoneAdapter(Context nContext, ArrayList<String> merk, ArrayList<String> spek, ArrayList<String> image) {
        this.merk = merk;
        this.spek = spek;
        this.image = image;
        this.nContext = nContext;
    }

    @NonNull
    @Override
    public ListPhoneAdapter.PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new PhoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPhoneAdapter.PhoneViewHolder holder, final int position) {

        Glide.with(nContext)
                .asBitmap()
                .load(image.get(position))
                .into(holder.Image);

        holder.Merk.setText(merk.get(position));
        holder.Spek.setText(spek.get(position));

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + image.get(position));
                Toast.makeText(nContext, merk.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(nContext, Detail.class);
                intent.putExtra("image", image.get(position));
                intent.putExtra("merk", merk.get(position));
                intent.putExtra("spek", spek.get(position));
                nContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return merk.size();
    }

    public class PhoneViewHolder extends RecyclerView.ViewHolder {

        ImageView Image;
        TextView Merk, Spek;
        RelativeLayout parent;

        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.ly_image);
            Merk = itemView.findViewById(R.id.ly_merk);
            Spek = itemView.findViewById(R.id.ly_spek);
            parent = itemView.findViewById(R.id.parent);
        }
    }
}
