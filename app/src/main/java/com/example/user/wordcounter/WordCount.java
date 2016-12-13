package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by user on 13/12/2016.
 */
public class WordCount extends AppCompatActivity {

    EditText sentenceEditText;
    Button countButton;
    Count count;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("WordCount", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText)findViewById(R.id.sentence_text);
        countButton = (Button)findViewById(R.id.count_button);

    }
