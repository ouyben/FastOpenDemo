package com.ouyben.fastopendemo;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class WelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel);
        AsTask asTask = new AsTask();
        asTask.execute();

    }

    class AsTask extends AsyncTask<Nullable, Nullable, Nullable> {

        @Override
        protected Nullable doInBackground(Nullable... nullables) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Nullable nullable) {
            super.onPostExecute(nullable);
            startActivity(new Intent(WelActivity.this, MainActivity.class));
            finish();
        }
    }
}
