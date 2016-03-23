package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class question2 extends ActionBarActivity {
    private Button btn2_t;
    private Button btn2_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Bundle bundle = getIntent().getExtras();
        int numberOfTrue = bundle.getInt("answer");
        btn2_t = (Button) findViewById(R.id.btn2_true);
        btn2_f = (Button) findViewById(R.id.btn2_false);

        btn2_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                int numberOfTrue = bundle.getInt("answer");
                Intent intent = new Intent (question2.this, finalpage.class);
                numberOfTrue=numberOfTrue + 1;
                intent.putExtra("answer", numberOfTrue);
                startActivity(intent);
            }

        });
        btn2_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                int numberOfTrue = bundle.getInt("answer");
                int numberOfFalse=0;
                Intent intent = new Intent (question2.this, finalpage.class);
                numberOfFalse = numberOfTrue;
                intent.putExtra("answer", numberOfFalse);
                startActivity(intent);
            }
        });




    }

}
