package com.example.lastattemptlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Stack<String> stack = new Stack<>();
        for (int i = 0; i < 1000; i++)
        {
               stack.push("Element " + i);
        }

    StackAdapter adapter = new StackAdapter(this, R.layout.list_item, stack);
    ListView listView = findViewById(R.id.listView);
listView.setAdapter(adapter);
}