package com.bku.scrumsoftware.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.bku.scrumsoftware.Constants;
import com.bku.scrumsoftware.Fragment.ArtifactFragment;
import com.bku.scrumsoftware.Fragment.MeetingDetailFragment;
import com.bku.scrumsoftware.Fragment.PopUpDetailFragment;
import com.bku.scrumsoftware.Fragment.ProductBacklogDetailFragment;
import com.bku.scrumsoftware.Fragment.RoleFragment;
import com.bku.scrumsoftware.R;
import com.bku.scrumsoftware.onListener.OnClickItemListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity implements MeetingDetailFragment.OnFragmentInteractionListener ,OnClickItemListener {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

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
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                break;
            case Constants.DetailConstants.POPUP:
                renderUI(PopUpDetailFragment.newInstance(intent.getStringExtra(Constants.BundleConstants.POPUP_TYPE)));
                toolbar.setTitle(Constants.DetailConstants.POPUP);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                break;
            case Constants.DetailConstants.ROLE:
                renderUI(RoleFragment.newInstance("", ""));
                toolbar.setTitle(Constants.DetailConstants.ROLE);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                break;
            case Constants.DetailConstants.ARTIFACTS:
                renderUI(ArtifactFragment.newInstance("",""));
                toolbar.setTitle(Constants.DetailConstants.ARTIFACTS);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                break;
            case Constants.DetailConstants.PRODUCT_BACKLOG_DETAIL:
                renderUI(ProductBacklogDetailFragment.newInstance("", ""));
                toolbar.setTitle(Constants.DetailConstants.PRODUCT_BACKLOG_DETAIL);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                break;
            default:
                break;
        }
    }

    private void renderUI(Fragment replaceFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.container, replaceFragment);

        transaction.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClickItem(String keyword) {

    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
