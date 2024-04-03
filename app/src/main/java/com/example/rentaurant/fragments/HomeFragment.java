package com.example.rentaurant.fragments;
// HomeFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentaurant.MenuAdapter;
import com.example.rentaurant.MenuModel;
import com.example.rentaurant.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private MenuAdapter adapter;
    private List<MenuModel> menuList;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.RVmakananFavorit);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        menuList = new ArrayList<>();
        menuList.add(new MenuModel(R.drawable.img_1, "Ayam Goreng", "Indonesian Food"));
        menuList.add(new MenuModel(R.drawable.img_2, "Sate Ayam", "Indonesian Food"));
        menuList.add(new MenuModel(R.drawable.img, "Onigiri", "JPN Food"));
        menuList.add(new MenuModel(R.drawable.img_3, "Nasi Goreng", "Indonesian Food"));
        menuList.add(new MenuModel(R.drawable.img_4, "Burger", "US Food"));
        menuList.add(new MenuModel(R.drawable.img_5, "Quaso", "French Food"));
        // Tambahkan menu lainnya sesuai kebutuhan

        adapter = new MenuAdapter(getContext(), menuList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
