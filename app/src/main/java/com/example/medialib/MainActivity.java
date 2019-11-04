package com.example.medialib;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.medialib.MESSAGE";

    private Button btn_CreateNewLibrary;
    private Button btn_ExitApplication;
    private MainActivity currentInstance = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_CreateNewLibrary = (Button) findViewById(R.id.btn_newLibrary);
        btn_ExitApplication = (Button) findViewById(R.id.btn_Exit);

        // Set listeners
        btn_CreateNewLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Creating new library!");

                //Intent intent = new Intent(this, CreateLibraryActivity.class);
                Intent intent = new Intent(getBaseContext(), CreateLibraryActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "Hello i am intent");
                startActivity(intent);
            }
        });


        btn_ExitApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        System.out.println("onCreate() called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("onRestart() called!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPause() called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy() called!");
    }

}
