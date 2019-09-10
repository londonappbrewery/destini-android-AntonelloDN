package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndexTop = 1;
    private int mStoryIndexBottom = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( (mStoryIndexTop == 1 && mStoryIndexBottom == 1) || (mStoryIndexTop == 1 && mStoryIndexBottom == 2) )
                {
                    mStory.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }
                else if ( (mStoryIndexTop == 2 && mStoryIndexBottom == 1) || (mStoryIndexTop == 2 && mStoryIndexBottom == 2) )
                {
                    mStory.setText(R.string.T6_End);
                    mButtonTop.setVisibility(Button.GONE);
                    mButtonBottom.setVisibility(Button.GONE);
                }
                mStoryIndexTop += 1;
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndexTop == 1 && mStoryIndexBottom == 1)
                {
                    mStory.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                }
                else if ( (mStoryIndexTop == 2 && mStoryIndexBottom == 1) || (mStoryIndexTop == 2 && mStoryIndexBottom == 2) )
                {
                    mStory.setText(R.string.T5_End);
                    mButtonTop.setVisibility(Button.GONE);
                    mButtonBottom.setVisibility(Button.GONE);
                }
                else if (mStoryIndexTop == 1 && mStoryIndexBottom == 2)
                {
                    mStory.setText(R.string.T4_End);
                    mButtonTop.setVisibility(Button.GONE);
                    mButtonBottom.setVisibility(Button.GONE);
                }
                mStoryIndexBottom += 1;
            }
        });

    }
}
