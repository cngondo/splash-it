package splash.example.com.splashit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        * Note here that we are not loading anyview but we are simply taking advantage
        * of the cold start time in android by just loading the theme. The cold start provides
        * with just the enough time to load the splash screen.
        * */
        /*
        * Start the activity and clear it from the back stack using flags
        * */
        startActivity(new Intent(SplashActivity.this, MainActivity.class)
        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
        //Make sure that you kill this activity after switching over to the main activity
        finish();
    }
}
