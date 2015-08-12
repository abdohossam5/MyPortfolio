package com.ahoss_000.myportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void SpotifyStreamerClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"This will open my Spotify", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                toast.show();
    }

    public void FootballScoresClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"This will open my Football Scores APP", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
    }
    public void LibraryAppClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"This will open my Library App", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
    }
    public void BuildItBiggerClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"This will open my Build It Bigger App", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
    }
    public void XYZReaderClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"This will open my XYZ Reader App", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
    }

    public void CapstoneClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"This will open my Own App", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
    }
}
