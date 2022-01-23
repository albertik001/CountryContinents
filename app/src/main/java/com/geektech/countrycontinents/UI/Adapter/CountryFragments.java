package com.geektech.countrycontinents.UI.Adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.geektech.countrycontinents.Data.Model;
import com.geektech.countrycontinents.UI.Adapter.Adapter.Adapter;
import com.geektech.countrycontinents.Interfaces.OnClick;
import com.geektech.countrycontinents.R;
import com.geektech.countrycontinents.databinding.FragmentCountryFragmentsBinding;

import java.util.ArrayList;

public class CountryFragments extends Fragment implements OnClick {
    private Adapter twoAdapter;
    private FragmentCountryFragmentsBinding binding;
    private ArrayList<Model> twoList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryFragmentsBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        twoAdapter = new Adapter(this, twoList);
        binding.countryRecycler.setAdapter(twoAdapter);
    }

    private void loadData() {
        Bundle bundle = getArguments();
        twoList = new ArrayList<>();
        int continents = bundle.getInt("I_LOVE");
        switch (continents) {
            case 1:
                twoList.add(new Model("Киргизия", R.drawable.ic_kg));
                twoList.add(new Model("Киргизия", R.drawable.ic_ar_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_ca_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_au_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_ma_3x));
                break;
            case 2:
                twoList.add(new Model("Киргизия", R.drawable.ic_us_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_ve_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_uy_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_pw_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_to_3x));
                break;
            case 3:
                twoList.add(new Model("Киргизия", R.drawable.ic_no_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_mx_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_eu));
                twoList.add(new Model("Киргизия", R.drawable.ic_ve_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_fr_3x));
                break;
            case 4:
                twoList.add(new Model("Киргизия", R.drawable.ic_es_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_kr));
                twoList.add(new Model("Киргизия", R.drawable.ic_pa_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_ng_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_ky_3x));
                break;
            case 5:
                twoList.add(new Model("Киргизия", R.drawable.ic_cr_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_de_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_fj_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_to_3x));
                twoList.add(new Model("Киргизия", R.drawable.ic_us_3x));
                break;
            case 6:
                Toast.makeText(requireActivity(),"Додик\uD83E\uDD21", Toast.LENGTH_SHORT).show();
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new DodicFragments()).commit();
                break;

        }
    }

    @Override
    public void onClick(Model model) {

    }
}