package com.e.scoreboard;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private TextView mTextView1;
    int count=0;

    int count1=0;
    public void increment(View view)
    {
        count++;
        mTextView.setText(Integer.toString(count));
    }
    public void reset(View view)
    {
        count=0;
        mTextView.setText(Integer.toString(count));
    }
    public void increment1(View view)
    {
        count1++;
        mTextView1.setText(Integer.toString(count1));
    }
    public void reset1(View view)
    {
        count1=0;
        mTextView1.setText(Integer.toString(count1));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        mTextView1 = (TextView) findViewById(R.id.text1);
        // Enables Always-on
        setAmbientEnabled();
    }

}
