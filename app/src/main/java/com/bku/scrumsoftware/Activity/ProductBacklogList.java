package com.bku.scrumsoftware.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.bku.scrumsoftware.Adapter.ProductBacklogAdapter;
import com.bku.scrumsoftware.ProductBacklogItem;
import com.bku.scrumsoftware.R;

import java.util.ArrayList;
import java.util.List;

public class ProductBacklogList extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_backlog_list);

        List<ProductBacklogItem> itemList = getData();
        final ListView listview = findViewById(R.id.product_backlog_listview);
        listview.setAdapter(new ProductBacklogAdapter(this,itemList));

    }
    private List<ProductBacklogItem> getData() {
        List<ProductBacklogItem> itemList = new ArrayList<ProductBacklogItem>();
        itemList.add(new ProductBacklogItem("01","FEATURE01","1"));
        return itemList;
    }
}
