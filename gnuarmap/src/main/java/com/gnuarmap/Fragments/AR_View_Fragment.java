package com.gnuarmap.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.gnuarmap.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AR_View_Fragment extends Fragment {


    public AR_View_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ar_view, container, false);
    }

}
