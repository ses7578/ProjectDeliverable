package com.example.shann.projectdeliverables;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity
{
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        button = (Button) findViewById(R.id.SignUpB);
        button2 = (Button) findViewById(R.id.BackBSignUp);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openActivity3();
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openActivity4();
            }
        });


    }

    public void openActivity3()
    {
        Intent intent = new Intent(this, RandomTesting.class);
        startActivity(intent);
    }

    public void openActivity4()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
