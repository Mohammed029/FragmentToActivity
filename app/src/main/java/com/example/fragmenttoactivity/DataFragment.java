package com.example.fragmenttoactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class DataFragment extends Fragment {
    OnFragmentClickListener onFragmentClickListener;
    EditText editText;



    public DataFragment(OnFragmentClickListener onFragmentClickListener) {
        this.onFragmentClickListener= onFragmentClickListener;
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button pass_data = view.findViewById(R.id.btn);
        editText= view.findViewById(R.id.editText);
        pass_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onFragmentClickListener.OnFragmentInteraction(editText.getText().toString());

            }
        });
    }

    public interface OnFragmentClickListener {
        void OnFragmentInteraction(String s);
    }
}