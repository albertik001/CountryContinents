package com.geektech.countrycontinents.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.countrycontinents.data.Model;
import com.geektech.countrycontinents.interfaces.OnClick;
import com.geektech.countrycontinents.R;
import com.geektech.countrycontinents.adapter.Adapter;
import com.geektech.countrycontinents.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class ContinentFragments extends Fragment implements OnClick {
    private FragmentCountryBinding binding;
    private Adapter adapter;
    private ArrayList<Model> list;
    private static final String KEY = "I_LOVE";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new Adapter(this, list);
        binding.continentsRecycler.setAdapter(adapter);

    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model("Евразия", R.drawable.ic_cna_3x, 1));
        list.add(new Model("Северная Америка", R.drawable.ic_caf, 2));
        list.add(new Model("Южная Америка", R.drawable.ic_ceu, 3));
        list.add(new Model("Африка", R.drawable.ic_csa, 4));
        list.add(new Model("Австралия", R.drawable.ic_cas, 5));
        list.add(new Model("Анта рктида", R.drawable.ic_coc, 6));

    }

    @Override
    public void onClick(Model model) {
        Bundle bundle = new Bundle();
        Fragment fragment = new CountryFragments();
        bundle.putInt(KEY, model.getKeyID());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                fragment).addToBackStack("Назад").commit();

    }
}