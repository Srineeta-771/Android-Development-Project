package com.example.pocketyoga;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Postures extends Fragment
{
    private Button bsirsasana, bmountain, btree, brevprayer, bcobra, bplow, bshoulder, bcamel, bbridge, bnatraj, bsunsalute;

    public Postures()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_postures, container, false);

        bsirsasana = view.findViewById(R.id.bsirsasana);
        bmountain = view.findViewById(R.id.bmountain);
        btree = view.findViewById(R.id.btree);
        brevprayer = view.findViewById(R.id.brevprayer);
        bcobra = view.findViewById(R.id.bcobra);
        bplow = view.findViewById(R.id.bplow);
        bshoulder = view.findViewById(R.id.bshoulder);
        bcamel = view.findViewById(R.id.bcamel);
        bbridge = view.findViewById(R.id.bbridge);
        bnatraj = view.findViewById(R.id.bnatraj);
        bsunsalute = view.findViewById(R.id.bsunsalute);

        bsirsasana.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Sirsasana.class));
                //finish();
            }
        });

        bmountain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Mountain.class));
                //finish();
            }
        });

        btree.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Tree.class));
                //finish();
            }
        });

        brevprayer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Revprayer.class));
                //finish();
            }
        });

        bcobra.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Cobra.class));
                //finish();
            }
        });

        bplow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Plow.class));
                //finish();
            }
        });

        bshoulder.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Shoulder.class));
                //finish();
            }
        });

        bcamel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Camel.class));
                //finish();
            }
        });

        bbridge.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Bridge.class));
                //finish();
            }
        });

        bnatraj.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Natraj.class));
                //finish();
            }
        });

        bsunsalute.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getContext(), Sunsalute.class));
                //finish();
            }
        });

        return view;
    }
}