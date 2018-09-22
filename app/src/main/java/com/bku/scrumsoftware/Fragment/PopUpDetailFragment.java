package com.bku.scrumsoftware.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bku.scrumsoftware.R;

import butterknife.BindView;

/**
 * Created by Welcome on 9/22/2018.
 */

public class PopUpDetailFragment extends Fragment{


    @BindView(R.id.backArrow) ImageView backArrow;

    @BindView(R.id.Row1Column1) TextView row1col1;
    @BindView(R.id.Row1Column2) TextView row1col2;
    @BindView(R.id.Row2Column1) TextView row2col1;
    @BindView(R.id.Row2Column2) TextView row2col2;
    @BindView(R.id.Row3Column1) TextView row3col1;
    @BindView(R.id.Row3Column2) TextView row3col2;
    @BindView(R.id.Row4Column1) TextView row4col1;
    @BindView(R.id.Row4Column2) TextView row4col2;
    @BindView(R.id.Row5Column1) TextView row5col1;
    @BindView(R.id.Row5Column2) TextView row5col2;
    @BindView(R.id.Row6Column1) TextView row6col1;
    @BindView(R.id.Row6Column2) TextView row6col2;
    @BindView(R.id.Row7Column1) TextView row7col1;
    @BindView(R.id.Row7Column2) TextView row7col2;
    @BindView(R.id.Row8Column1) TextView row8col1;
    @BindView(R.id.Row8Column2) TextView row8col2;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String Type_Day = "typeday";




    // TODO: Rename and change types of parameters
    private String typeSprint;




    public PopUpDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.

     * @return A new instance of fragment MeetingDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PopUpDetailFragment newInstance(String param1) {
        PopUpDetailFragment fragment = new PopUpDetailFragment();
        Bundle args = new Bundle();
        args.putString(Type_Day, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            typeSprint = getArguments().getString(Type_Day);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_detail, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRow1();
        switch (typeSprint){
            case "mon1":
                break;
                default:break;
        }
    }

    private void initRow1(){
        row1col1.setText(getString(R.string.row1col1));
        row2col1.setText(getString(R.string.row2col1));
        row3col1.setText(getString(R.string.row3col1));
        row4col1.setText(getString(R.string.row4col1));
        row5col1.setText(getString(R.string.row5col1));
        row6col1.setText(getString(R.string.row6col1));
        row7col1.setText(getString(R.string.row7col1));
        row8col1.setText(getString(R.string.row8col1));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



}
