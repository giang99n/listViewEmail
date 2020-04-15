package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<email> emails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emails = new ArrayList<>();
        emails.add(new email("Name 1","12:55 AM","abc",R.drawable.ic_star0, "#5E97F6"));
        emails.add(new email("Name 2","8:55 AM","abc",R.drawable.ic_star0,"#FF8867"));
        emails.add(new email("Name 3","9:55 AM","abc",R.drawable.ic_star0,"#9BCA64"));
        emails.add(new email("B Name 1","11:45 AM","abc",R.drawable.ic_star0,"#94A5AD"));
        emails.add(new email("B Name 2","12:15 AM","abc",R.drawable.ic_star0,"#5E97F6"));
        emails.add(new email("B Name 3","10:35 AM","abc",R.drawable.ic_star0,"#B1D482"));
        emails.add(new email("CName 1","12:55 AM","abc",R.drawable.ic_star0,"#FF8867"));
        emails.add(new email("CName 2","21:55 AM","abc",R.drawable.ic_star0,"#9BCA64"));
        emails.add(new email("CName 3","2:55 AM","abc",R.drawable.ic_star0,"#9BCA64"));
        emails.add(new email("CName 4","12:25 AM","abc",R.drawable.ic_star0,"#9BCA64"));
        emails.add(new email("CName 8","12:15 AM","abc",R.drawable.ic_star0,"#5E97F6"));

        emailAdapter adapter = new emailAdapter(emails);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
