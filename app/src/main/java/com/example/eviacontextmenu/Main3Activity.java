package com.example.eviacontextmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This activity has the responsibility of credits
 */
public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    /**
     * this act return us to the first activity
     * @param view
     */
    public void back(View view) {
        finish();
    }
}
