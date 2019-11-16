package com.example.eviacontextmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * this activity collect 3 numbers from the user, the first number is the kind of sidra, second first place and third is the number for the hefresh or kefel
 */
public class MainActivity extends AppCompatActivity {
    EditText first, hefresh,ed;
    String ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.editText1);
        hefresh = findViewById(R.id.editText2);
        ed = findViewById(R.id.editText3);
    }


    /**
     * this act send the 3 numbers to the second activity or send toast if the user didnt picked one of the numbers
     * @param view
     */
    public void goto20(View view) {
        ed1= first.getText().toString();

        ed2= hefresh.getText().toString();

        ed3= ed.getText().toString();


        if (ed1.equals("")||(ed2.equals(""))||(ed3.equals(""))) {
            Toast toast;
            toast = Toast.makeText(this, "please pick", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Intent gi = new Intent(this, Main2Activity.class);
            gi.putExtra("n", ed1);
            gi.putExtra("nn", ed2);
            gi.putExtra("nnn", ed3);
            startActivity(gi);
        }

    }

    /**
     * has the act of sending to credits activity
     * @param view
     */
    public void gotocredits(View view) {
        Intent si=new Intent(this,Main3Activity.class);
        startActivity(si);
    }
}
