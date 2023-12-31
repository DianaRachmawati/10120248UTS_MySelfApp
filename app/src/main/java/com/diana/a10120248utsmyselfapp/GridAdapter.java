/*
 *     Tanggal Pengerjaan : 17/5/2022
 *     Nim : 10119203
 *     Nama : Albee Akbar Fillah
 */

package com.diana.a10120248utsmyselfapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    List<GridItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<GridItem>();
        GridItem nama = new GridItem();
        nama.setThumbnail(R.drawable.g1);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g2);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g3);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.profileabl);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g5);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g6);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g7);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g8);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g9);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g10);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g11);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g4);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g13);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g14);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.g15);
        mItems.add(nama);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        GridItem nature = mItems.get(i);
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);

        }
    }
}
