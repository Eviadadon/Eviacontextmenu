package com.example.eviacontextmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * this activity shows  20 numbers from series and gives you the option to see the place or the sum of the  num that you had chose
 */
public  class Main2Activity extends AppCompatActivity implements View.OnLongClickListener, OnItemLongClickListener {
    int first,efr,sid,ex,summ;
    String f,hef,or;
    ListView lv4;
    Integer [] twenty={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    TextView tv3;


    @Override

    /**
     * this act create the context menu
     */
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Operations");
        menu.add("place");
        menu.add("sum");

    }

    /**
     * this act set the  information on the textview element
     * @param item
     * @return
     */
    public boolean onContextItemSelected(MenuItem item) {
        String oper=item.getTitle().toString();
        if (oper.equals("sum")) {
            for (int i=0;i<=ex;i++){
                summ=twenty[i]+summ;
            }
            tv3.setText("sum is"+""+summ);
        }

        if (oper.equals("place")) {
            ex++;
            tv3.setText("index is"+""+ex);
        }

        return super.onContextItemSelected(item);}

    /**
     * this act fill the twenty list with numbers and set the listeners for the listview
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent di=getIntent();

        f = di.getStringExtra("n");
        hef = di.getStringExtra("nn");
        or = di.getStringExtra("nnn");

        first=Integer.parseInt(f);
        efr=Integer.parseInt(hef);
        sid=Integer.parseInt(or);

        lv4= findViewById(R.id.lv4);
        tv3=findViewById(R.id.textView2);

/**
 * i tried to make a loop that does the same action but didn't succeed , this action calculate the all 20 series elements
 */

        if ((sid==1)){
            twenty[0]= first;
            twenty[1]= first*efr;
            twenty[2]= twenty[1]*efr;
            twenty[3]= twenty[2]*efr;
            twenty[4]= twenty[3]*efr;
            twenty[5]= twenty[4]*efr;
            twenty[6]= twenty[5]*efr;
            twenty[7]= twenty[6]*efr;
            twenty[8]= twenty[7]*efr;
            twenty[9]= twenty[8]*efr;
            twenty[10]= twenty[9]*efr;
            twenty[11]= twenty[10]*efr;
            twenty[12]= twenty[11]*efr;
            twenty[13]= twenty[12]*efr;
            twenty[14]= twenty[13]*efr;
            twenty[15]= twenty[14]*efr;
            twenty[16]= twenty[15]*efr;
            twenty[17]= twenty[16]*efr;
            twenty[18]= twenty[17]*efr;
            twenty[19]= twenty[18]*efr;
            ArrayAdapter <Integer> adp = new ArrayAdapter<Integer>(this,R.layout.support_simple_spinner_dropdown_item,twenty);
            lv4.setAdapter(adp);
            lv4.setOnCreateContextMenuListener(this);
            lv4.setOnItemLongClickListener(this);
        }
        /**
         * twenty- 20 elements that i have to calculate according to the user's instructions
         */
        if ((sid==2)){
            twenty[0]= first;
            twenty[1]= first+efr;
            twenty[2]= twenty[1]+efr;
            twenty[3]= twenty[2]+efr;
            twenty[4]= twenty[3]+efr;
            twenty[5]= twenty[4]+efr;
            twenty[6]= twenty[5]+efr;
            twenty[7]= twenty[6]+efr;
            twenty[8]= twenty[7]+efr;
            twenty[9]= twenty[8]+efr;
            twenty[10]= twenty[9]+efr;
            twenty[11]= twenty[10]+efr;
            twenty[12]= twenty[11]+efr;
            twenty[13]= twenty[12]+efr;
            twenty[14]= twenty[13]+efr;
            twenty[15]= twenty[14]+efr;
            twenty[16]= twenty[15]+efr;
            twenty[17]= twenty[16]+efr;
            twenty[18]= twenty[17]+efr;
            twenty[19]= twenty[18]+efr;
            ArrayAdapter <Integer> adp = new ArrayAdapter<Integer>(this,R.layout.support_simple_spinner_dropdown_item,twenty);
            lv4.setAdapter(adp);
            lv4.setOnCreateContextMenuListener(this);
            lv4.setOnItemLongClickListener(this);
        }
        if ((sid !=1)|| (sid !=2)){
            Toast toast1;
            toast1 = Toast.makeText(this, "plz pick 1 or 2", Toast.LENGTH_SHORT);
            toast1.show();
        }
    }


    /**
     *  act  that send the user back to the first activity
     * @param view
     */
    public void goback(View view) {
        finish();
    }



    @Override
    /**
     *  long click listener  give us the information about the position of the num we have chose
     */
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        ex= position;
        return false;
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}
