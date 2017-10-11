package com.example.omar.social;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFB(View view) {

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            Toast.makeText(this, "app not downloaded install it", Toast.LENGTH_LONG).show();
            Intent in = getPackageManager().getLaunchIntentForPackage("com.appstoretop.mobilemarket");
        startActivity(in);
        }
    }

    public void opentwitter(View view) {


        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            Toast.makeText(this, "app not downloaded install it", Toast.LENGTH_LONG).show();
            Intent in = getPackageManager().getLaunchIntentForPackage("com.appstoretop.mobilemarket");
            startActivity(in);
        }
    }

    public void openwhats(View view) {


        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            Toast.makeText(this, "app not downloaded install it", Toast.LENGTH_LONG).show();
            Intent in = getPackageManager().getLaunchIntentForPackage("com.appstoretop.mobilemarket");
            startActivity(in);
        }
    }

    public void openinst(View view) {

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            Toast.makeText(this, "app not downloaded install it", Toast.LENGTH_LONG).show();
            Intent in = getPackageManager().getLaunchIntentForPackage("com.appstoretop.mobilemarket");
            startActivity(in);
        }
    }

    public void openask(View view) {


        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.askfm");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            Toast.makeText(this, "app not downloaded install it", Toast.LENGTH_LONG).show();
            Intent in = getPackageManager().getLaunchIntentForPackage("com.appstoretop.mobilemarket");

            startActivity(in);
        }

    }
}
