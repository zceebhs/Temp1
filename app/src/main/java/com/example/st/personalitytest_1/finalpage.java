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

        Bundle intent = getIntent().getExtras();
        int[] numberOfAnswer = intent.getIntArray("answer6");
        results = (TextView) findViewById(R.id.tv_results);

        if (numberOfAnswer[1] == 0 ) {
            results.setText("You are very extroverted");
        }
        else if (numberOfAnswer[1] >= 1 && numberOfAnswer[1] <2) {
            results.setText("You are 80% extroverted ");
        }
        else if(numberOfAnswer[1] >= 2 && numberOfAnswer[1] <3) {
            results.setText("You are 60% extroverted");
        }
        else if(numberOfAnswer[1] >=3 && numberOfAnswer[1] <4) {
            results.setText("You are 60% introverted");
        }
        else if(numberOfAnswer[1] >= 4 && numberOfAnswer[1] <5) {
            results.setText("You are 80 introverted");
        }
        else if(numberOfAnswer[1] >= 5 && numberOfAnswer[1] <6) {
            results.setText("You are close to 100% introvert");
        }
        else if(numberOfAnswer[1] >= 6 && numberOfAnswer[1] <7) {
            results.setText("You are totally introverted");
        }


    }
    public void onClick(View view)
    {
        finish();
    }



}
public class SortCoins
{
    public static void main (String[] args,numberOfAnswer[])
    {


        for (int i = 0; i < numberOfAnswers.length; i++)
        System.out.println(numberOfAnswer[i]);
        SelectionSort.sort(numberOfAnswer);
        System.out.println("LIST OF Yes and No:");
        for (int i = 0; i < numberOfAnswer.length; i++)
        System.out.println(numberOfAnswer[i]);
    }
}
public class SelectionSort

{
    public static void sort(Comparable[] a)
    {
        for (int index = 0; index < 6 ­ 1; index++)
        swap(index,indexOfSmallestFrom(index, a), a);
    }
    private static int indexOfSmallestFrom(int startIndex, Comparable[] a)
    {
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < a.length; index++)
        if (a[index].compareTo(a[indexOfMin]) < 0)
            indexOfMin = index;
        return indexOfMin;
    }
    private static void swap(int i, int j, Comparable[] a)
    {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
