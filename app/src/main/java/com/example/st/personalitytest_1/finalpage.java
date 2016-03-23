package com.example.st.personalitytest_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;



public class finalpage extends ActionBarActivity {
    private TextView results;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalpage);
        Bundle bundle = getIntent().getExtras();

        int questionResult = bundle.getInt("answer");
        results = (TextView) findViewById(R.id.tv_results);
        {
            if (questionResult == 0) {
                results.setText("Your are A");
            }
            else if(questionResult == 1) {
                results.setText("You are B");
            }
            else if(questionResult ==2){
            results.setText("You are c");
            }

            else{
                results.setText("You are D");
            }

        }
    }

}
