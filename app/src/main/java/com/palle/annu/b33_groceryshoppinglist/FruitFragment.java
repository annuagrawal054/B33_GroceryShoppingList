package com.palle.annu.b33_groceryshoppinglist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FruitFragment extends Fragment {
    ListView lv;
    ArrayAdapter<String> aa;


    public FruitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fruit, container, false);
         //   aa = new ArrayAdapter<String>(getActivity(),and)
        return v;
    }

}
