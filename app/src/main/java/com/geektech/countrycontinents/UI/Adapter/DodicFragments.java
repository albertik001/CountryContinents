package com.geektech.countrycontinents.UI.Adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.geektech.countrycontinents.R;

public class DodicFragments extends Fragment {
    private ImageView imageMatch;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dodic_fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageMatch = view.findViewById(R.id.image_cloun);
        Glide.with(imageMatch).load("https://c.wallhere.com/photos/8c/0e/beavis_butthead_cartoon_balloon_clown_ArtStation_Michelle_Sorensen-1830655.jpg!d").into(imageMatch);
    }
}