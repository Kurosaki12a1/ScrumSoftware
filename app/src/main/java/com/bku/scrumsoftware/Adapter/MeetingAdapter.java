package com.bku.scrumsoftware.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.bku.scrumsoftware.R;

public class MeetingAdapter extends BaseAdapter {
    public static final int NUM_ELEMENTS = 12;
    public static final int NUM_VIEW_TYPE = 2;
    public static final int TYPE_TITLE = 0;
    public static final int TYPE_SPINNER = 1;

    private Context mContext;

    public MeetingAdapter(Context context) {
        super();
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return NUM_ELEMENTS;
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
        int type = getItemViewType(position);

        if (type == TYPE_TITLE) {
            View v = LayoutInflater.from(mContext).inflate(R.layout.meeting_title, parent, false);
            TextView txtTitle = v.findViewById(R.id.txtWeek);
            if (position == 0) {
                txtTitle.setText("Week 1");
            } else {
                txtTitle.setText("Week 2");
            }

            return v;
        }

        View v = LayoutInflater.from(mContext).inflate(R.layout.day_spinner, parent, false);

        Spinner spinner = (Spinner) v;

        switch (position) {
            case 1:
                String data1[] = {"Planning Topic 1","Planning Topic 2","Sprint Forecast","Sprint Goal Communication"};
                ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data1);
                spinnerArrayAdapter1.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter1);
                return v;
            case 2:
            case 3:
            case 4:
            case 5:
                String data2[] = {"Start Workshop"};
                ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data2);
                spinnerArrayAdapter2.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter2);
                return v;
            case 7:
            case 8:
            case 9:
                String data3[] = {"Product Backlog refinement"};
                ArrayAdapter<String> spinnerArrayAdapter3 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data3);
                spinnerArrayAdapter3.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter3);
                return v;
            case 10:
                String data4[] = {"Backlog ordering"};
                ArrayAdapter<String> spinnerArrayAdapter4 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data4);
                spinnerArrayAdapter4.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter4);
                return v;
            case 11:
                String data5[] = {"Sprint Retrospective", "Sprint Review"};
                ArrayAdapter<String> spinnerArrayAdapter5 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data5);
                spinnerArrayAdapter5.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter5);
                return v;
        }

        return v;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0 || position == 6) {
            return TYPE_TITLE;
        }

        return TYPE_SPINNER;
    }

    @Override
    public int getViewTypeCount() {
        return NUM_VIEW_TYPE;
    }
}
