package css.hcarlson1.buttonspinnersampleproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textViewDisplay;
    Button button_2;
    Button button_3;
    Spinner javaSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // ============================================
        textViewDisplay = (TextView) findViewById(R.id.textViewDisplay);
        button_2 = (Button) findViewById(R.id.button2);
        button_2.setOnClickListener(buttonClick2); //have to create onClickListener so the GUI button can find the button method for button_2
        // ============================================
        javaSpinner = (Spinner) findViewById(R.id.spinner2Java); //method 2 for spinner

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayList<String> items = new ArrayList<String>();
        items.add("Red");
        items.add("Green");
        items.add("Blue");
        items.add("Grey");
        items.add("Orange");
        items.add("Yellow");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        // Specify the layout to use when the list of choices appears
        itemsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        javaSpinner.setAdapter(itemsAdapter);

        // ============================================
        button_3 = (Button) findViewById(R.id.button3); //method 3. everything put into here
        button_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewDisplay.setText("Button Click 3 method called");
            }
        });
        // ============================================



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    //--------------------------------------
    public void onButtonClick1 (View view){ //method 1 for creating a button. using built in listener
        textViewDisplay.setText("Button Click 1 method called");

    }
    //--------------------------------------

    //--------------------------------------
    private View.OnClickListener buttonClick2 = new View.OnClickListener() { //method 2 for creating a button, creates a listener. have to create a button variable
        @Override
        public void onClick(View v) {
            textViewDisplay.setText("Button Click 2 method called");
        }
    };
    //---------------------------------------


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
}
