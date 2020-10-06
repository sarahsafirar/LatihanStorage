package org.example.latihanstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button binternal,beksternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binternal =(Button)findViewById(R.id.binternal);
        binternal.setOnClickListener(this);
        beksternal =(Button)findViewById(R.id.beksternal);
        beksternal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.binternal:
                Intent intent1 = new Intent(MainActivity.this,InternalActivity.class);
                startActivity(intent1);
                break;
            case R.id.beksternal:
                Intent intent2 = new Intent(MainActivity.this,InternalActivity.class);
                startActivity(intent2);
        }
    }
}