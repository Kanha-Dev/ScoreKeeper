package andoid.example.scorekeeper;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int score_Team_A = 0;
    int score_Team_B = 0;
    int score_Team_A2 = 0;
    int score_Team_B2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void goalForTeamA(View v) {
        score_Team_A=score_Team_A+1;
        displayForTeamA(score_Team_A);
    }

    /**
     * Increase the foul score for Team A by 1 points.
     */
    public void foulForTeamA(View v) {
        score_Team_A2=score_Team_A2+1;
        displayForTeamA2(score_Team_A2);
    }


    /**
     * Increase the score for Team B by 1 points.
     */
    public void goalForTeamB(View v) {
        score_Team_B=score_Team_B+1;
        displayForTeamB(score_Team_B);
    }

    /**
     * Increase the foul score for Team B by 1 points.
     */
    public void foulForTeamB(View v) {
        score_Team_B2=score_Team_B2+1;
        displayForTeamB2(score_Team_B2);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Fouls for Team A.
     */
    public void displayForTeamA2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Fouls for Team B.
     */
    public void displayForTeamB2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for Both Teams to 0 points.
     */
    public void reset(View v) {
        score_Team_B=0;
        score_Team_A=0;
        score_Team_A2=0;
        score_Team_B2=0;
        displayForTeamB(score_Team_B);
        displayForTeamA(score_Team_A);
        displayForTeamA2(score_Team_A2);
        displayForTeamB2(score_Team_B2);
    }
}
