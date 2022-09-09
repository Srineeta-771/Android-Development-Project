package com.example.pocketyoga;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Feed extends Fragment
{
    private Button babtyog, bmudras, bmantras, bbmi;

    public Feed()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed, container, false);

        babtyog = view.findViewById(R.id.babtyog);
        bmudras = view.findViewById(R.id.bmudras);
        bmantras = view.findViewById(R.id.bmantras);
        bbmi = view.findViewById(R.id.bbmi);

        babtyog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Abtyoga.class));
                //finish();
            }
        });

        bmudras.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Mudras.class));
                //finish();
            }
        });

        bmantras.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Mantras.class));
                //finish();
            }
        });

        bbmi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Bmi.class));
                //finish();
            }
        });

        return view;
    }
}