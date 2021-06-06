package com.example.uts_ilham_10118311;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPager {

    ViewPager viewPager;
    Adapter adapter;

    private void setupViewPager(){
        adapter = new Adapter(this);

    }

    private class Adapter extends PagerAdapter {
        ViewPager context;
        LayoutInflater inflater;

        public Adapter(ViewPager context) {
            this.context = context;
        }

        int[] list_img = {
            R.drawable.anemo,
            R.drawable.person,
            R.drawable.info
        };

        int[] list_judul = {
                R.string.judul_1,
                R.string.judul_2,
                R.string.judul_3
        };

        int[] list_deskripsi = {
                R.string.desk_1,
                R.string.desk_2,
                R.string.desk_3
        };

        int[] list_bg = {
                R.color.putih,
                R.color.biru,
                R.color.biru
        };

        @Override
        public int getCount() {
            return list_judul.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            /* Tanggal Pengerjaan 6-7 juni 2021
             *  Nama = Ilham Pahrul Anam
             * Nim = 10118311
             * Kelas = IF8*/
            return (view == object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View view = inflater.inflate(R.layout.item_layout,container,false);
            LinearLayout linearLayout = view.findViewById(R.id.item_layout);
            ImageView imageView = view.findViewById(R.id.img);
            TextView judul = view.findViewById(R.id.judul);
            TextView desk = view.findViewById(R.id.deskripsi);
            judul.setText(list_judul[position]);
            desk.setText(list_deskripsi[position]);
            container.addView(view);
            return view;

        }

}
}
