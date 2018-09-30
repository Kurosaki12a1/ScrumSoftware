package com.bku.scrumsoftware.Adapter;

<<<<<<< HEAD
import android.content.Context;
import android.view.LayoutInflater;
=======
>>>>>>> 7ecced86782afda9a601d5ab0d11f365aa1d789a
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
    public Object getItem(int i) {
        return i;
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
<<<<<<< HEAD
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
        return view;
    }
    static class ProductBacklogViewHolder {
        TextView Id, Name, Priority;
=======
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
>>>>>>> 7ecced86782afda9a601d5ab0d11f365aa1d789a
    }
}
