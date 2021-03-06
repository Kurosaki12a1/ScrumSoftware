package com.bku.scrumsoftware.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.bku.scrumsoftware.R;
import com.bku.scrumsoftware.onListener.OnClickItemListener;

public class MeetingAdapter extends BaseAdapter {
    public static final int NUM_ELEMENTS = 12;
    public static final int NUM_VIEW_TYPE = 2;
    public static final int TYPE_TITLE = 0;
    public static final int TYPE_SPINNER = 1;

    private Context mContext;

    OnClickItemListener onClick;

    public MeetingAdapter(Context context, OnClickItemListener onClick) {
        super();
        this.mContext = context;
        this.onClick = onClick;
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

        final Spinner spinner = (Spinner) v;

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (spinner.getSelectedItem().toString()) {
                    case "Planning Topic 1":
                        onClick.onClickItem(mContext.getString(R.string.mon1_col2_row1));
                        break;
                    case "Planning Topic 2":
                        onClick.onClickItem(mContext.getString(R.string.mon1_col3_row1));
                        break;
                    case "Sprint Forecast":
                        onClick.onClickItem(mContext.getString(R.string.mon1_col4_row1));
                        break;
                    case "Sprint Goal Communication":
                        onClick.onClickItem(mContext.getString(R.string.mon1_col5_row1));
                        break;
                    case "Start Workshop":
                        onClick.onClickItem(mContext.getString(R.string.tue1_col2_row1));
                        break;
                    case "Product Backlog refinement":
                        onClick.onClickItem(mContext.getString(R.string.mon2_col2_row1));
                        break;
                    case "Backlog ordering":
                        onClick.onClickItem(mContext.getString(R.string.thu2_col2_row1));
                        break;
                    case "Sprint Retrospective":
                        onClick.onClickItem(mContext.getString(R.string.fri2_col3_row1));
                        break;
                    case "Sprint Review":
                        onClick.onClickItem(mContext.getString(R.string.fri2_col2_row1));
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        switch (position) {
            case 1:
                String data1[] = {"Monday", "Planning Topic 1","Planning Topic 2","Sprint Forecast","Sprint Goal Communication"};
                ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data1);
                spinnerArrayAdapter1.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter1);
                /*spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position){
                            case 0:
                                onClick.onClickItem(mContext.getString(R.string.mon1_col2_row1));
                                break;
                            case 1:
                                onClick.onClickItem(mContext.getString(R.string.mon1_col3_row1));
                                break;
                            case 2:
                                onClick.onClickItem(mContext.getString(R.string.mon1_col4_row1));
                                break;
                            case 3:
                                onClick.onClickItem(mContext.getString(R.string.mon1_col5_row1));
                                break;
                        }
                    }
                });*/
                return v;
            case 2:
                String data2[] = {"Tuesday", "Start Workshop"};
                ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data2);
                spinnerArrayAdapter2.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter2);
                return v;
            case 3:
                String data3[] = {"Wednesday", "Start Workshop"};
                ArrayAdapter<String> spinnerArrayAdapter3 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data3);
                spinnerArrayAdapter3.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter3);
                return v;
            case 4:
                String data4[] = {"Thursday", "Start Workshop"};
                ArrayAdapter<String> spinnerArrayAdapter4 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data4);
                spinnerArrayAdapter4.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter4);
                return v;
            case 5:
                String data5[] = {"Friday", "Start Workshop"};
                ArrayAdapter<String> spinnerArrayAdapter5 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data5);
                spinnerArrayAdapter5.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter5);
                return v;
            case 7:
                String data6[] = {"Monday", "Product Backlog refinement"};
                ArrayAdapter<String> spinnerArrayAdapter6 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data6);
                spinnerArrayAdapter6.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter6);
                return v;
            case 8:
                String data7[] = {"Tuesday", "Product Backlog refinement"};
                ArrayAdapter<String> spinnerArrayAdapter7 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data7);
                spinnerArrayAdapter7.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter7);
                return v;
            case 9:
                String data8[] = {"Wednesday", "Product Backlog refinement"};
                ArrayAdapter<String> spinnerArrayAdapter8 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data8);
                spinnerArrayAdapter8.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter8);
                return v;
            case 10:
                String data9[] = {"Thursday", "Backlog ordering"};
                ArrayAdapter<String> spinnerArrayAdapter9 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data9);
                spinnerArrayAdapter9.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter9);
                return v;
            case 11:
                String data10[] = {"Friday", "Sprint Retrospective", "Sprint Review"};
                ArrayAdapter<String> spinnerArrayAdapter10 = new ArrayAdapter<>
                        (mContext, android.R.layout.simple_spinner_item, data10);
                spinnerArrayAdapter10.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerArrayAdapter10);
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
