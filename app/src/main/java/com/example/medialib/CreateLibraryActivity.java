package com.example.medialib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CreateLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_library);
        System.out.println("Welcome to this new activity." +
                "Please create now your new library");
    }
}
