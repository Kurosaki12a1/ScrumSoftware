package com.bku.scrumsoftware.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.bku.scrumsoftware.Adapter.ProductBacklogAdapter;
import com.bku.scrumsoftware.Constants;
import com.bku.scrumsoftware.ProductBacklogItem;
import com.bku.scrumsoftware.R;

import java.util.ArrayList;
import java.util.List;

public class SprintBacklogList extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sprint_backlog_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(Constants.DetailConstants.ARTIFACTS);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        List<ProductBacklogItem> itemList = getData();
        final ListView listView = findViewById(R.id.sprint_backlog_listview);
        listView.setAdapter(new ProductBacklogAdapter(this,itemList));
    }
    private List<ProductBacklogItem> getData() {
        List<ProductBacklogItem> itemList = new ArrayList<ProductBacklogItem>();
        itemList.add(new ProductBacklogItem("AS-01","Scrum framework summary","1"));
        itemList.add(new ProductBacklogItem("AS-02","Role summary","2"));
        itemList.add(new ProductBacklogItem("AS-03","Meeting summary","3"));
        itemList.add(new ProductBacklogItem("AS-04","Item Detail Accessing","4"));
        itemList.add(new ProductBacklogItem("AS-05","Update information about Scrum/Agile and AxonActive","5"));
        itemList.add(new ProductBacklogItem("AS-06","Update information about Scrum Framework","6"));
        return itemList;
    }


    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
