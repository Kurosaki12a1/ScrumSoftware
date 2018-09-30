package com.bku.scrumsoftware.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bku.scrumsoftware.Activity.ProductBacklogList;
import com.bku.scrumsoftware.R;

public class ArtifactFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    View mProductBacklog;
    View mSprintBacklog;

    public static ArtifactFragment newInstance (String param1, String param2) {
        ArtifactFragment fragment = new ArtifactFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.scrum_artifacts_item,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mProductBacklog = view.findViewById(R.id.product_backlog_view);
        mSprintBacklog = view.findViewById(R.id.sprint_backlog_view);
        mProductBacklog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ProductBacklogList.class);
                startActivity(intent);
            }
        });
    }
}
