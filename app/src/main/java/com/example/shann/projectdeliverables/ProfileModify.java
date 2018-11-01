package com.example.shann.projectdeliverables;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ProfileModify extends AppCompatActivity{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        button = (Button) findViewById(R.id.SignUpB);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openActivity5();
            }
        });

    }

    public void openActivity5()
    {
        Intent intent = new Intent(this, ClockFunction.class);
        startActivity(intent);
    }



}



