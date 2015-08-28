package com.ahoss_000.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

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

    public void ButtonClick(View view){
        Toast toast = new Toast(getApplicationContext());
        switch (view.getId()){
            case R.id.Spotify_Streamer_btn:
                toast = Toast.makeText(getApplicationContext(),"This will open my Spotify", Toast.LENGTH_LONG);
                break;
            case R.id.Football_Scores:
                toast = Toast.makeText(getApplicationContext(),"This will open my Football Scores APP", Toast.LENGTH_LONG);
                break;
            case R.id.Library_App:
                toast = Toast.makeText(getApplicationContext(),"This will open my Library App", Toast.LENGTH_LONG);
                break;
            case R.id.Build_It_Bigger:
                toast = Toast.makeText(getApplicationContext(),"This will open my Build It Bigger App", Toast.LENGTH_LONG);
                break;
            case R.id.XYZ_Reader:
                toast = Toast.makeText(getApplicationContext(),"This will open my XYZ Reader App", Toast.LENGTH_LONG);
                break;
            case R.id.Capstone:
                toast = Toast.makeText(getApplicationContext(),"This will open my Own App", Toast.LENGTH_LONG);
                break;

        }
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
    }
}
