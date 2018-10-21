package com.example.shann.projectdeliverables;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openActivity2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openActivity3();
            }
        });
    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, AlarmLogin.class);
        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}
