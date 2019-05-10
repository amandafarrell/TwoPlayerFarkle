package www.amandafarrell.com.twoplayerfarkle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mPlayer1 = 0;
    int mPlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_donate:
                Intent intent = new Intent(MainActivity.this, DonateActivity.class);
                startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Player1
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player2
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(score));
    }

    //Score Functions

    public void scoreOne(View view) {
        mPlayer1 += 100;
        displayForPlayer1(mPlayer1);
    }

    public void scoreOneB(View view) {
        mPlayer2 += 100;
        displayForPlayer2(mPlayer2);
    }

    public void straight(View view) {
        mPlayer1 += 3000;
        displayForPlayer1(mPlayer1);
    }

    public void straightB(View view) {
        mPlayer2 += 3000;
        displayForPlayer2(mPlayer2);
    }

    public void scoreFive(View view) {
        mPlayer1 += 50;
        displayForPlayer1(mPlayer1);
    }

    public void scoreFiveB(View view) {
        mPlayer2 += 50;
        displayForPlayer2(mPlayer2);
    }

    public void triplePair(View view) {
        mPlayer1 += 1500;
        displayForPlayer1(mPlayer1);
    }

    public void triplePairB(View view) {
        mPlayer2 += 1500;
        displayForPlayer2(mPlayer2);
    }

    public void tripleOne(View view) {
        mPlayer1 += 1000;
        displayForPlayer1(mPlayer1);
    }

    public void tripleOneB(View view) {
        mPlayer2 += 1000;
        displayForPlayer2(mPlayer2);
    }

    public void tripleTwo(View view) {
        mPlayer1 += 200;
        displayForPlayer1(mPlayer1);
    }

    public void tripleTwoB(View view) {
        mPlayer2 += 200;
        displayForPlayer2(mPlayer2);
    }

    public void tripleThree(View view) {
        mPlayer1 += 300;
        displayForPlayer1(mPlayer1);
    }

    public void tripleThreeB(View view) {
        mPlayer2 += 300;
        displayForPlayer2(mPlayer2);
    }

    public void tripleFour(View view) {
        mPlayer1 += 400;
        displayForPlayer1(mPlayer1);
    }

    public void tripleFourB(View view) {
        mPlayer2 += 400;
        displayForPlayer2(mPlayer2);
    }

    public void tripleFive(View view) {
        mPlayer1 += 500;
        displayForPlayer1(mPlayer1);
    }

    public void tripleFiveB(View view) {
        mPlayer2 += 500;
        displayForPlayer2(mPlayer2);
    }

    public void tripleSix(View view) {
        mPlayer1 += 600;
        displayForPlayer1(mPlayer1);
    }

    public void tripleSixB(View view) {
        mPlayer2 += 600;
        displayForPlayer2(mPlayer2);
    }

    public void reset(View view) {
        mPlayer1 = 0;
        mPlayer2 = 0;
        displayForPlayer1(mPlayer1);
        displayForPlayer2(mPlayer2);
    }
}
