package com.strila.aspectjtestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.txt_hello_world).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("From java", "onClick: " + ((TextView)v).getText());
            }
        });
    }
}
