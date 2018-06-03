package hk.ust.mingzheliu.develop;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Set extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        Toolbar toolbar = findViewById(R.id.set_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button button = findViewById(R.id.am);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(Settings.ACTION_ADD_ACCOUNT);
                startActivity(intent);
                return true;
            }
        });

    }

    public void ama(View view)
    {
        Intent intent = new Intent(Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS);
        startActivity(intent);
    }
    public void mcs(View view)
    {
        Intent intent = new Intent(Settings.ACTION_MEMORY_CARD_SETTINGS);
        startActivity(intent);
    }
    public void am(View view)
    {
        Intent intent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivity(intent);
    }
}
