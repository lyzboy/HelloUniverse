package absolute.beginners.hellouniverse;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    // create milkyWay Galaxy object
    static Galaxy milkyWay;
    static TextView nameData,solarData,habitData, colonyData, popData, fleetData, shipsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create the default galaxy using the create galaxy method
        createDefaultGalaxy();
        // method to create the textviews
        createUiTextViews();
        transferDataValues();
    }


    // instantiate main activity UI
    private void createUiTextViews() {
        nameData = (TextView)findViewById(R.id.name);
        solarData = (TextView)findViewById(R.id.solar);
        habitData = (TextView)findViewById(R.id.habit);
        colonyData = (TextView)findViewById(R.id.colony);
        popData = (TextView)findViewById(R.id.pop);
        fleetData = (TextView)findViewById(R.id.fleet);
        shipsData = (TextView)findViewById(R.id.ships);

    }

    private void createDefaultGalaxy() {

        milkyWay = new Galaxy("Milky Way", 511, 97);
        // set milkyWay object number of colonies in galaxy
        milkyWay.setGalaxyColonies(37579321);
        // set milky way object population
        milkyWay.setGalaxyPopulation(1967387132);
        // set milky way object fleets
        milkyWay.setGalaxyFleets(237);
        // set milky way object starships
        milkyWay.setGalaxyStarships(34769);
    }// end createDefaultGalaxy()

    private void transferDataValues() {
        nameData.setText(milkyWay.galaxyName);
        solarData.setText( String.valueOf(milkyWay.galaxySolarSystems));
        habitData.setText(String.valueOf(milkyWay.galaxyPlanets));
        colonyData.setText(String.valueOf(milkyWay.galaxyColonies));
        popData.setText(String.valueOf(milkyWay.galaxyLifeforms));
        fleetData.setText(String.valueOf(milkyWay.galaxyFleets));
        shipsData.setText(String.valueOf(milkyWay.galaxyStarships));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // update text after new text is entered in EditGalaxy activity
    static public void updateTextViews() {
        nameData.setText(milkyWay.galaxyName);
        solarData.setText( String.valueOf(milkyWay.galaxySolarSystems));
        habitData.setText(String.valueOf(milkyWay.galaxyPlanets));
        colonyData.setText(String.valueOf(milkyWay.galaxyColonies));
        popData.setText(String.valueOf(milkyWay.galaxyLifeforms));
        fleetData.setText(String.valueOf(milkyWay.galaxyFleets));
        shipsData.setText(String.valueOf(milkyWay.galaxyStarships));
    }// end updateTextViews()

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        // find index of menu item selected
        switch (item.getItemId())
        {
            // if menu item selected is edit galaxy
            case R.id.edit_galaxy:
                // create a new intent using the EditGalay.java file
                Intent editIntent = new Intent( this, EditGalaxy.class);
                // create a new activity using the new edit galaxy intent (editIntent)
                this.startActivity(editIntent);
                break;
            case R.id.action_settings:
                break;
            // return control to superclass
            default:
                return super.onOptionsItemSelected(item);
        }

        return false;
    }
}
