package com.bku.scrumsoftware.Activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bku.scrumsoftware.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


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
    @BindView(R.id.nextBtn)
    Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        iniText();

    }

    @OnClick(R.id.nextBtn)
    public void nextBtn(){
        Intent intent=new Intent(MainActivity.this,MainScreenActivity.class);
        startActivity(intent);
        finish();
    }

    private void iniText(){
        String Text1="<b>"+getString(R.string.introduce1_first)+"</b>"+" "+getString(R.string.introduce1_end);
        introduceTxt.setText(Html.fromHtml(Text1));
        String Text2="<b>"+getString(R.string.introduce2_first)+"</b>"+" "+getString(R.string.introduce2_end);
        introduceTxt1.setText(Html.fromHtml(Text2));
        String Text3="<b>"+getString(R.string.introduce3_first)+"</b>"+" "+getString(R.string.introduce3_end);
        introduceTxt2.setText(Html.fromHtml(Text3));
        String Text4="<b>"+getString(R.string.introduce4_first)+"</b>"+" "+getString(R.string.introduce4_end);
        introduceTxt3.setText(Html.fromHtml(Text4));
        nextButton.setText(getString(R.string.next_btn));
        welcomeTxt.setVisibility(View.VISIBLE);
        imgLogo.setVisibility(View.VISIBLE);
        introduceTxt.setVisibility(View.VISIBLE);
        introduceTxt1.setVisibility(View.VISIBLE);
        introduceTxt2.setVisibility(View.VISIBLE);
        introduceTxt3.setVisibility(View.VISIBLE);
        nextButton.setVisibility(View.VISIBLE);
    }

}
