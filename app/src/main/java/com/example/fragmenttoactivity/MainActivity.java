package com.example.fragmenttoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DataFragment.OnFragmentClickListener {
    TextView tvAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataFragment dataFragment = new DataFragment(this);
        tvAct =findViewById(R.id.tvAct);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.Fcont, dataFragment);
        transaction.commit();


    }

    @Override
    public void OnFragmentInteraction(String data) {

        tvAct.setText(data);
    }

}
