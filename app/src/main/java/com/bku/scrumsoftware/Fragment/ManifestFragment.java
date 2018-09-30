package com.bku.scrumsoftware.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bku.scrumsoftware.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Welcome on 9/22/2018.
 */

public class ManifestFragment extends Fragment{

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    @BindView(R.id.welcomeTxt)
    TextView welcomeTxt;
    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.introduceTxt)
    TextView introduceTxt;
    @BindView(R.id.introduceTxt1)
    TextView introduceTxt1;
    @BindView(R.id.introduceTxt2)
    TextView introduceTxt2;
    @BindView(R.id.introduceTxt3)
    TextView introduceTxt3;



    public static ManifestFragment newInstance(String param1, String param2) {
        ManifestFragment fragment = new ManifestFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /*  if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        String Text1="<b>"+getString(R.string.introduce1_first)+" "+"</b>"+getString(R.string.introduce1_end);
        introduceTxt.setText(Html.fromHtml(Text1));
        String Text2="<b>"+getString(R.string.introduce2_first)+"</b>"+" "+getString(R.string.introduce2_end);
        introduceTxt1.setText(Html.fromHtml(Text2));
        String Text3="<b>"+getString(R.string.introduce3_first)+"</b>"+" "+getString(R.string.introduce3_end);
        introduceTxt2.setText(Html.fromHtml(Text3));
        String Text4="<b>"+getString(R.string.introduce4_first)+"</b>"+" "+getString(R.string.introduce4_end);
        introduceTxt3.setText(Html.fromHtml(Text4));
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_manifest, container, false);
        ButterKnife.bind(this,view);
        return view;

    }







}
