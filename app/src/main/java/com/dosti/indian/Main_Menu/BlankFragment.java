package com.dosti.indian.Main_Menu;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dosti.indian.Main_Menu.RelateToFragment_OnBack.RootFragment;
import com.dosti.indian.R;

public class BlankFragment extends RootFragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }

}
