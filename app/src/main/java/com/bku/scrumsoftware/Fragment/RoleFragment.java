package com.bku.scrumsoftware.Fragment;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bku.scrumsoftware.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RoleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RoleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    @BindView(R.id.btnSM)
    Button btnSM;
    @BindView(R.id.btnDT)
    Button btnDT;
    @BindView(R.id.btnPO)
    Button btnPO;
    @BindView(R.id.txtSM)
    TextView txtSM;
    @BindView(R.id.txtDT)
    TextView txtDT;
    @BindView(R.id.txtPO)
    TextView txtPO;

    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = false;

    public RoleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RoleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RoleFragment newInstance(String param1, String param2) {
        RoleFragment fragment = new RoleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_role, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        setIcons();
    }

    private void setIcons() {
        Drawable iconSM = getResources().getDrawable(R.drawable.ic_scrum_master);
        iconSM.setBounds(0, 0, 100, 100);
        btnSM.setCompoundDrawables(iconSM, null, null, null);

        Drawable iconDT = getResources().getDrawable(R.drawable.ic_dev_team);
        iconDT.setBounds(0, 0, 400, 400);
        btnSM.setCompoundDrawables(iconDT, null, null, null);

        Drawable iconPO = getResources().getDrawable(R.drawable.ic_product_owner);
        iconPO.setBounds(0, 0, 100, 100);
        btnSM.setCompoundDrawables(iconPO, null, null, null);
    }

    @OnClick(R.id.btnSM)
    public void onSMClick() {
        if (b1) {
            b1 = false;
            txtSM.setVisibility(View.GONE);
        } else {
            b1 = true;
            txtSM.setVisibility(View.VISIBLE);
        }
    }

    @OnClick(R.id.btnDT)
    public void onDTClick() {
        if (b1) {
            b1 = false;
            txtDT.setVisibility(View.GONE);
        } else {
            b1 = true;
            txtDT.setVisibility(View.VISIBLE);
        }
    }

    @OnClick(R.id.btnPO)
    public void onPOClick() {
        if (b1) {
            b1 = false;
            txtPO.setVisibility(View.GONE);
        } else {
            b1 = true;
            txtPO.setVisibility(View.VISIBLE);
        }
    }

}
