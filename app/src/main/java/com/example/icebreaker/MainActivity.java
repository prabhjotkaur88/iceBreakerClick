package com.example.icebreaker;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button ice;
  Random r;
  TextView hello;

    String[] questions = {"If you could go anywhere in the world, where would you go?",
            "If you were stranded on a desert island, what three things would you want to take with you?",
            "If you could eat only one food for the rest of your life, what would that be?",
            "If you won a million dollars, what is the first thing you would buy?",
            "If you could spend the day with one fictional character, who would it be?",
            "If you found a magic lantern and a genie gave you three wishes, what would you wish?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ice = (Button) findViewById(R.id.iceBreakerID);
        final TextView hello = (TextView) findViewById(R.id.textView);
         r = new Random();
        ice.setOnClickListener(new View.OnClickListener()
        {
        @Override
        public void onClick(View v)
        {
            hello.setText(questions[r.nextInt(questions.length)]);
        }
        });
    }}
