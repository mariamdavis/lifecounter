package edu.washington.mhd94.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity {
    private int p1Count = 20;
    private int p2Count = 20;
    private int p3Count = 20;
    private int p4Count = 20;



     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null) {
            p1Count = savedInstanceState.getInt("Player 1");
            p2Count = savedInstanceState.getInt("Player 2");
            p3Count = savedInstanceState.getInt("Player 3");
            p4Count = savedInstanceState.getInt("Player 4");

            final TextView text1 = (TextView) findViewById(R.id.p1count);
            text1.setText("Life Count = " + p1Count);
            losers(1);

            final TextView text2 = (TextView) findViewById(R.id.p2Count);
            text2.setText("Life Count = " + p2Count);
            losers(2);

            final TextView text3 = (TextView) findViewById(R.id.p3count);
            text3.setText("Life Count = " + p3Count);
            losers(3);

            final TextView text4 = (TextView) findViewById(R.id.p4count);
            text4.setText("Life Count = " + p4Count);
            losers(4);



        }

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Player 1", p1Count);
        savedInstanceState.putInt("Player 2", p2Count);
        savedInstanceState.putInt("Player 3", p3Count);
        savedInstanceState.putInt("Player 4", p4Count);
    }


    public void p1Controls(View v) {
        TextView text1 = (TextView) findViewById(R.id.p1count);
        if(v.getId() == R.id.p1Add) {
            p1Count++;
            text1.setText("Life Count = " + p1Count);
            losers(1);

        } else if(v.getId() == R.id.p1sub) {
            p1Count--;
            text1.setText("Life Count = " + p1Count);
            losers(1);

        } else if (v.getId () == R.id.p1sub5) {
            p1Count-=5;
            text1.setText("Life Count = " + p1Count);
            losers(1);

        } else if(v.getId () == R.id.p1Add5) {
            p1Count += 5;
            text1.setText("Life Count = " + p1Count);
            losers(1);
        }
     }

    public void p2Controls(View v) {
       TextView text2 = (TextView) findViewById(R.id.p2Count);
        if (v.getId() == R.id.p2add) {
            p2Count++;
            text2.setText("Life Count = " + p2Count);
            losers(2);

        } else if(v.getId() == R.id.p2sub) {
            p2Count--;
            text2.setText("Life Count = " + p2Count);
            losers(2);

        } else if (v.getId () == R.id.p2sub5) {
            p2Count-=5;
            text2.setText("Life Count = " + p2Count);
            losers(2);

        } else if(v.getId () == R.id.p2add5) {
            p2Count +=5;
            text2.setText("Life Count = " + p2Count);
            losers(2);
        }
    }

    public void p3Controls(View v) {
       TextView text3 = (TextView) findViewById(R.id.p3count);
        if (v.getId() == R.id.p3add) {
             p3Count++;
            text3.setText("Life Count = " + p3Count);
            losers(3);

        } else if(v.getId() == R.id.p3sub) {
            p3Count--;
            text3.setText("Life Count = " + p3Count);
            losers(3);

        } else if (v.getId () == R.id.p3sub5) {
           p3Count-=5;
            text3.setText("Life Count = " + p3Count);
            losers(3);

        } else if(v.getId () == R.id.p3add5) {
            p3Count +=5;
            text3.setText("Life Count = " + p3Count);
            losers(3);
        }
    }

    public void p4Controls(View v) {
        TextView text4 = (TextView) findViewById(R.id.p4count);
        if (v.getId() == R.id.p4add) {
            p4Count++;
            text4.setText("Life Count = " + p4Count);
            losers(4);

        } else if(v.getId() == R.id.p4sub) {
            p4Count--;
            text4.setText("Life Count = " + p4Count);
            losers(4);

        } else if (v.getId () == R.id.p4sub5) {
            p4Count-=5;
            text4.setText("Life Count = " + p4Count);
            losers(4);

        } else if(v.getId () == R.id.p4add5) {
            p4Count +=5;
            text4.setText("Life Count = " + p4Count);
            losers(4);

        }

    }

    public void losers(int player) {
        TextView loser = (TextView) findViewById(R.id.loses);
        if (player == 1 && p1Count <= 0) {
            loser.setText("Player 1 LOSES!");

        } if (player == 2 && p2Count <= 0) {
            loser.setText("Player 2 LOSES!");

        } if (player == 3 && p3Count <= 0) {
            loser.setText("Player 3 LOSES!");


        } if (player == 4 && p4Count <= 0) {
            loser.setText("Player 4 LOSES!");

        }

    }






}
