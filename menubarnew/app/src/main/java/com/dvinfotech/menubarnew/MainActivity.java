package com.dvinfotech.menubarnew;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textview);
    }

    // Overriding onCreateoptionMenu() to make Option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflating menu by overriding inflate() method of MenuInflater class.
        //Inflating here means parsing layout XML to views.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    //Overriding onOptionsItemSelected to perform event on menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Toast.makeText(this, "You chose : " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
        switch (menuItem.getItemId()) {
            case R.id.search:
                t1.setText("Search");
                return true;
            case R.id.filter:
                t1.setText("Filter");
                return true;
            case R.id.wishlist:
                t1.setText("WidhList");
                return true;
            case R.id.MyCart:
                t1.setText("MyCart");
                return true;
            case R.id.My_account:
                t1.setText("Dhruv's Account");
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
