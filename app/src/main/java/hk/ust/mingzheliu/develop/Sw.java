package hk.ust.mingzheliu.develop;

import android.nfc.Tag;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Sw extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sw);
        Toolbar toolbar = findViewById(R.id.sw_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ToggleButton toggleButton = findViewById(R.id.tb);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                TextView tv = findViewById(R.id.tv1);
                if(isChecked)
                {
                    tv.setVisibility(View.VISIBLE);
                }
                else
                {
                    tv.setVisibility(View.GONE);
                }
            }
        });

        Switch sw = findViewById(R.id.sw);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                TextView tv = findViewById(R.id.tv2);
                if(isChecked)
                {
                    tv.setVisibility(View.VISIBLE);
                }
                else
                {
                    tv.setVisibility(View.GONE);
                }
            }
        });
    }
}
