package com.bku.scrumsoftware.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bku.scrumsoftware.R;
import com.bku.scrumsoftware.onListener.OnClickItemListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Welcome on 9/22/2018.
 */

public class PopUpDetailFragment extends Fragment implements OnClickItemListener {



    @BindView(R.id.Row1Column1)
    TextView row1col1;
    @BindView(R.id.Row1Column2)
    TextView row1col2;
    @BindView(R.id.Row2Column1)
    TextView row2col1;
    @BindView(R.id.Row2Column2)
    TextView row2col2;
    @BindView(R.id.Row3Column1)
    TextView row3col1;
    @BindView(R.id.Row3Column2)
    TextView row3col2;
    @BindView(R.id.Row4Column1)
    TextView row4col1;
    @BindView(R.id.Row4Column2)
    TextView row4col2;
    @BindView(R.id.Row5Column1)
    TextView row5col1;
    @BindView(R.id.Row5Column2)
    TextView row5col2;
    @BindView(R.id.Row6Column1)
    TextView row6col1;
    @BindView(R.id.Row6Column2)
    TextView row6col2;
    @BindView(R.id.Row7Column1)
    TextView row7col1;
    @BindView(R.id.Row7Column2)
    TextView row7col2;
    @BindView(R.id.Row8Column1)
    TextView row8col1;
    @BindView(R.id.Row8Column2)
    TextView row8col2;


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
        Log.d("TESTING", "onCreate:  asdadsas"+Type_Day + ".." +param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            typeSprint = getArguments().getString(Type_Day);
            Log.d("TESTING", "onCreate:    "+typeSprint);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.layout_detail, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRow1();
        setScrollRow2();
        if(typeSprint.equals(getString(R.string.mon1_col2_row1))){
            initRow2(getString(R.string.mon1_col2_row1)
                    ,getString(R.string.mon1_col2_row2),getString(R.string.mon1_col2_row3),
                    getString(R.string.mon1_col2_row4),
                    getString(R.string.mon1_col2_row5),getString(R.string.mon1_col2_row6),
                    getString(R.string.mon1_col2_row7),"");
        }

    }

    private void initRow2(String text1,String text2,String text3,String text4,String text5,String text6,String text7,String text8){
        row1col2.setText(text1);
        row2col2.setText(text2);
        row3col2.setText(text3);
        row4col2.setText(text4);
        row5col2.setText(text5);
        row6col2.setText(text6);
        row7col2.setText(text7);
        row8col2.setText(text8);
    }

    private void setScrollRow2(){
        row1col2.setMovementMethod(new ScrollingMovementMethod());
        row2col2.setMovementMethod(new ScrollingMovementMethod());
        row3col2.setMovementMethod(new ScrollingMovementMethod());
        row4col2.setMovementMethod(new ScrollingMovementMethod());
        row5col2.setMovementMethod(new ScrollingMovementMethod());
        row6col2.setMovementMethod(new ScrollingMovementMethod());
        row7col2.setMovementMethod(new ScrollingMovementMethod());
        row8col2.setMovementMethod(new ScrollingMovementMethod());

    }

    private void initRow1() {
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


    @Override
    public void onClickItem(String keyword) {

    }
}
