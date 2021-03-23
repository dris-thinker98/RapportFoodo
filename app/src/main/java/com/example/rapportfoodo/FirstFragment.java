package com.example.rapportfoodo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
     private TextView recipe;
     private Data d;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_first, container, false);
        recipe=v.findViewById(R.id.ordername);
        String r=d.getName();
        recipe.setText(r);
        return v;
    }
}