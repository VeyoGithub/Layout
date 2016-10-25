package com.layout.veyo.layout;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import winterwell.jtwitter.Twitter;


public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    private static final String TAG = "MainActivity";
    EditText editText;
    Button updateButton;
    Twitter twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        updateButton = (Button) findViewById(R.id.buttonUpdate);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
