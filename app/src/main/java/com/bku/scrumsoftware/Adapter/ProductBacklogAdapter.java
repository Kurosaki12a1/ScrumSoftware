package com.bku.scrumsoftware.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bku.scrumsoftware.ProductBacklogItem;
import com.bku.scrumsoftware.R;

import java.util.List;

public class ProductBacklogAdapter extends BaseAdapter {
    private Context context;
    private List<ProductBacklogItem> itemList;
    private LayoutInflater layoutInflater;
    public ProductBacklogAdapter(Context context, List<ProductBacklogItem> itemList){
        this.context = context;
        this.itemList = itemList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public ProductBacklogItem getItem(int i) {
        return itemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ProductBacklogViewHolder holder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.product_backlog_item_layout, null);
            holder = new ProductBacklogViewHolder();
            holder.Id = view.findViewById(R.id.product_backlog_item_id);
            holder.Name = view.findViewById(R.id.product_backlog_item_name);
            holder.Priority = view.findViewById(R.id.product_backlog_item_priority);
            view.setTag(holder);
        } else {
            holder = (ProductBacklogViewHolder) view.getTag();
        }
        ProductBacklogItem item = this.itemList.get(i);
        holder.Id.setText(item.getItemId());
        holder.Name.setText(item.getItemName());
        holder.Priority.setText(item.getItemPriority());
        return view;
    }
    static class ProductBacklogViewHolder {
        TextView Id, Name, Priority;
    }
}
