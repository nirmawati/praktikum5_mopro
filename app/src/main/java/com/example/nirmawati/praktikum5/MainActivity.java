package com.example.nirmawati.praktikum5;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Nirmawati on 10/20/2017.
 */

public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle item selection
        switch (item.getItemId()){
            case R.id.opt1:
                Log.i("Status","Option one selected");
                return true;
            case R.id.opt2:
                Log.i("Status","Option two selected");
                return true;
            case R.id.opt3:
                Log.i("Status","Option three selected");
                return true;
            case R.id.sub1:
                Log.i("Status","SubOption one selected");
                return true;
            case R.id.sub2:
                Log.i("Status","SubOption one selected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


