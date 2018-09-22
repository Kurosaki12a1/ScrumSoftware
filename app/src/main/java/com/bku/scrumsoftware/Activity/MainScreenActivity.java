package com.bku.scrumsoftware.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bku.scrumsoftware.Adapter.MainFragmentViewPager;
import com.bku.scrumsoftware.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import devlight.io.library.ntb.NavigationTabBar;

/**
 * Created by Welcome on 9/22/2018.
 */

public class MainScreenActivity extends AppCompatActivity {

    @BindView(R.id.vp_horizontal_ntb)
    ViewPager mainViewPager;
    @BindView(R.id.txtTab)
    TextView txtStatus;
    MainFragmentViewPager mainFragmentViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        ButterKnife.bind(this);

        mainFragmentViewPager = new MainFragmentViewPager(getSupportFragmentManager());
        mainViewPager.setAdapter(mainFragmentViewPager);
       // mainViewPager.setOffscreenPageLimit(2);
        initUI();
    }

    private void initUI() {
        final String[] colors = getResources().getStringArray(R.array.default_preview);

        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_horizontal);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_transparent_home),
                        Color.parseColor(colors[0]))
                        .title("Manifest")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_transparent_compass),
                        Color.parseColor(colors[1]))
                        .title("Content")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_transparent_compass),
                        Color.parseColor(colors[2]))
                        .title("About")
                        .build()
        );


        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(mainViewPager, 0);
        //set Default Item


        //IMPORTANT: ENABLE SCROLL BEHAVIOUR IN COORDINATOR LAYOUT
        navigationTabBar.setBehaviorEnabled(true);


        navigationTabBar.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(final NavigationTabBar.Model model, final int index) {

            }

            @Override
            public void onEndTabSelected(final NavigationTabBar.Model model, final int index) {
                model.hideBadge();
            }
        });
        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 0) {
                    txtStatus.setText(R.string.manifest);
                } else if (position == 1) {
                    txtStatus.setText(R.string.content);
                } else {
                    txtStatus.setText(R.string.about);
                }

            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

    }
}
