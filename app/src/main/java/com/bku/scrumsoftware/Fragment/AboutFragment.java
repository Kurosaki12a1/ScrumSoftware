package com.bku.scrumsoftware.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bku.scrumsoftware.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Welcome on 9/22/2018.
 */

public class AboutFragment extends Fragment {

    @BindView(R.id.txtAbout)
    TextView txtAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about, container, false);
        ButterKnife.bind(this, v);

        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtAbout.setText(getString(R.string.about_row1));

    }



}
