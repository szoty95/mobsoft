package com.example.cocktaillist.ui.main.specific;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cocktaillist.R;

public class SpecificFragment extends Fragment {

    private SpecificViewModel specificViewModel;
    int cocktailId;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        specificViewModel =
                new ViewModelProvider(this).get(SpecificViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);



        //default
        final TextView textView = root.findViewById(R.id.text_home);
        specificViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        //default until this point

        return root;
    }

    public void setCocktailId(int cocktailId) {
        this.cocktailId = cocktailId;
    }

    public int getCocktailId() {
        return cocktailId;
    }
}
