package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class question3 extends ActionBarActivity {
    private Button btn3_t;
    private Button btn3_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Bundle bundle = getIntent().getExtras();
        int numberOfTrue = bundle.getInt("answer");
        btn3_t = (Button) findViewById(R.id.btn3_true);
        btn3_f = (Button) findViewById(R.id.btn3_false);

        btn3_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                int numberOfTrue = bundle.getInt("answer");
                Intent intent = new Intent(question3.this, finalpage.class);
                numberOfTrue = numberOfTrue + 1;
                intent.putExtra("answer", numberOfTrue);
                startActivity(intent);
            }

        });
        btn3_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                int numberOfTrue = bundle.getInt("answer");
                int numberOfFalse = 0;
                Intent intent = new Intent(question3.this, finalpage.class);
                numberOfFalse = numberOfTrue;
                intent.putExtra("answer", numberOfFalse);
                startActivity(intent);
            }
        });




    }

}
