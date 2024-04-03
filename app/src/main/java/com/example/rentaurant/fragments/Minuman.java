package com.example.rentaurant.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentaurant.MenuAdapter;
import com.example.rentaurant.MenuModel;
import com.example.rentaurant.R;

import java.util.ArrayList;
import java.util.List;


public class Minuman extends Fragment {
    private RecyclerView recyclerView;
    private MenuAdapter adapter;
    private List<MenuModel> menuList;


    public Minuman() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman, container, false);

        recyclerView = view.findViewById(R.id.RVminumanFavorit);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        menuList = new ArrayList<>();
        menuList.add(new MenuModel(R.drawable.img_6, "Es Teh", "Indonesian Drink"));
        menuList.add(new MenuModel(R.drawable.img_7, "Es Jeruk", "Indonesian Drink"));
        menuList.add(new MenuModel(R.drawable.img_8, "Teh Tarik", "Malay Drink"));
        menuList.add(new MenuModel(R.drawable.img_9, "Mango Lassi", "Indian Drink"));
        menuList.add(new MenuModel(R.drawable.img_10, "Bubble Tea", "Taiwan Drink"));
        menuList.add(new MenuModel(R.drawable.img_11, "Mint Tea", "Maroko Drink"));


        adapter = new MenuAdapter(getContext(), menuList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}