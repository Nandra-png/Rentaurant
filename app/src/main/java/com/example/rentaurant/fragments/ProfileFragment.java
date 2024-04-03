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

public class ProfileFragment extends Fragment {

    private RecyclerView recyclerView;
    private MenuAdapter adapter;
    private List<MenuModel> menuList;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        recyclerView = view.findViewById(R.id.RvFavoritt);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        menuList = new ArrayList<>();
        menuList.add(new MenuModel(R.drawable.img_12, "Udang Goreng", "Udang Goreng Enak"));
        menuList.add(new MenuModel(R.drawable.img_13, "MIE!", "Semua Jenis Mie Enak"));
        menuList.add(new MenuModel(R.drawable.img_14, "Bimbimbap", "enak kadang di masak emak!"));


        adapter = new MenuAdapter(getContext(), menuList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
