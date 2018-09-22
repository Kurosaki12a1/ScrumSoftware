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
import com.bku.scrumsoftware.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Welcome on 9/22/2018.
 */

public class ContentFragment extends Fragment {

   /* @BindView(R.id.cardViewMeetings)
    CardView mMeeting;*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_content, container, false);
        ButterKnife.bind(this,view);
        return null;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       /* mMeeting = view.findViewById(R.id.cardViewMeetings);
        mMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("type","Meeting");
                startActivity(i);
            }
        });*/
    }

    /*@OnClick(R.id.cardViewMeetings)
    public void viewMeetings(){

    }*/
}
