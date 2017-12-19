package com.example.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText textToCount;
    Button countButton;
    TextView countAnswer;
    WordCounter words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToCount = findViewById(R.id.Text_to_count);
        countAnswer = findViewById(R.id.count_answer_view);
        countButton = findViewById(R.id.count_word);
    }

    public void onCountButtonClicked(View button) {
        String text = textToCount.getText().toString();
        words = new WordCounter(text);
        String textToShow = "Total Word Count: " + words.wordCount();
        countAnswer.setText(textToShow);
    }
}
