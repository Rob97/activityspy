package edu.washington.sseera.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "OnCreate Fired");
    }
    override fun onStart() {
        super.onStart();
        Log.i("MainActivity", "OnStart Fired");
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "OnResume Fired");
    }
    override fun onPause(){
        super.onPause()
        Log.i("MainActivity", "OnPause Fired");
    }

    override fun onStop(){
        super.onStop()
        Log.i("MainActivity", "OnStop Fired");
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.e("MainActivity", "We’re going down, Captain!");
    }

}
