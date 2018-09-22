package com.bku.scrumsoftware.Activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bku.scrumsoftware.Constants;
import com.bku.scrumsoftware.Fragment.MeetingDetailFragment;
import com.bku.scrumsoftware.R;

import butterknife.BindView;

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setSupportActionBar(toolbar);
        initUI();

    }

    private void initUI() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String detailType = intent.getStringExtra(Constants.BundleConstants.DETAIL_TYPE);
        switch (detailType) {
            case Constants.DetailConstants.MEETING:
                renderUI(MeetingDetailFragment.newInstance("", ""));
                toolbar.setTitle(Constants.DetailConstants.MEETING);
                break;
            default:
        }
    }

    private void renderUI(Fragment replaceFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.container, replaceFragment);
        transaction.addToBackStack(null);

        transaction.commit();

    }
}
