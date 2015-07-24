package absolute.beginners.hellouniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




/**
 * Created by Joshua on 7/15/2015.
 */
public class EditGalaxy extends ActionBarActivity {

    Button colonyButton, popButton, fleetButton, shipsButton;
    EditText colonyEdit, popEdit, fleetEdit, shipsEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        instantiateUi();

        colonyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the static object 'milkyWay's colony count, in the main activity, to the
                //user entered value in the edit galaxy activity
                MainActivity.milkyWay.galaxyColonies = Long.parseLong(colonyEdit.getText().toString());

                //toast used to show that data has been changed
                Toast.makeText(EditGalaxy.this, "Colony data changed to " + MainActivity.milkyWay.galaxyColonies, Toast.LENGTH_LONG).show();
                //update the main activities text views to match new data
                MainActivity.updateTextViews();
            }
        });
        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the static object 'milkyWay's colony count, in the main activity, to the
                //user entered value in the edit galaxy activity
                MainActivity.milkyWay.galaxyLifeforms = Double.parseDouble(popEdit.getText().toString());
                //toast used to show that data has been changed
                Toast.makeText(EditGalaxy.this, "Lifeforms data changed to " + MainActivity.milkyWay.galaxyLifeforms, Toast.LENGTH_LONG).show();
                //update the main activities text views to match new data
                MainActivity.updateTextViews();

            }
        });
        fleetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the static object 'milkyWay's colony count, in the main activity, to the
                //user entered value in the edit galaxy activity
                MainActivity.milkyWay.galaxyFleets = Integer.parseInt(fleetEdit.getText().toString());
                //toast used to show that data has been changed
                Toast.makeText(EditGalaxy.this, "Fleet data changed to " + MainActivity.milkyWay.galaxyFleets, Toast.LENGTH_LONG).show();
                //update the main activities text views to match new data
                MainActivity.updateTextViews();
            }
        });
        shipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the static object 'milkyWay's colony count, in the main activity, to the
                //user entered value in the edit galaxy activity
                MainActivity.milkyWay.galaxyStarships = Integer.parseInt(shipsEdit.getText().toString());
                //toast used to show that data has been changed
                Toast.makeText(EditGalaxy.this, "Ships data changed to " + MainActivity.milkyWay.galaxyStarships, Toast.LENGTH_LONG).show();
                //update the main activities text views to match new data
                MainActivity.updateTextViews();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.edit_menu, menu);
        return true;
    }

    // instantiate the UI of edit galaxy
    private void instantiateUi() {
        colonyButton = (Button)findViewById(R.id.submit_colony);
        popButton = (Button)findViewById(R.id.submit_pop);
        fleetButton = (Button)findViewById(R.id.submit_fleet);
        shipsButton = (Button)findViewById(R.id.submit_ships);
        colonyEdit = (EditText)findViewById(R.id.edit_colony);
        popEdit = (EditText)findViewById(R.id.edit_pop);
        fleetEdit = (EditText)findViewById(R.id.edit_fleet);
        shipsEdit = (EditText)findViewById(R.id.edit_ships);
    }


}
