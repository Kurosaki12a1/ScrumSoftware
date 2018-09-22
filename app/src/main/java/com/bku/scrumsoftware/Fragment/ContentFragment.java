package com.bku.scrumsoftware.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bku.scrumsoftware.Activity.DetailActivity;

import com.bku.scrumsoftware.Constants;

import com.bku.scrumsoftware.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import butterknife.OnClick;

/**
 * Created by Welcome on 9/22/2018.
 */

public class ContentFragment extends Fragment {
    @BindView(R.id.cardViewSprintPlanning)
    CardView cardViewSprintPlanning;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_content, container, false);
        ButterKnife.bind(this, v);

        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
    }

    @OnClick(R.id.cardViewSprintPlanning)
    public void onClickViewSprint(){
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra(Constants.BundleConstants.DETAIL_TYPE, Constants.DetailConstants.MEETING);
        startActivity(intent);
    }
}
