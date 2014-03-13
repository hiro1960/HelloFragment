package com.example.hellofragment;

import android.app.Activity;
//import android.app.ActionBar;
//import android.app.Fragment;
import android.os.Bundle;
//import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
import android.widget.Toast;
//import android.os.Build;

public class Main extends Activity {

    private static final int MENU_FRAGMENT_0_0 = Menu.FIRST + 0;
    private static final int MENU_FRAGMENT_0_1 = Menu.FIRST + 1;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_FRAGMENT_0_0, 0, "Main_0")
            .setIcon(android.R.drawable.ic_menu_help)
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(0, MENU_FRAGMENT_0_1, 0, "Main_1")
            .setIcon(android.R.drawable.ic_menu_compass)
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean result = true;
        switch (item.getItemId()){
        case MENU_FRAGMENT_0_0:
            Toast.makeText(this, "MENU_FRAGMENT_0_0 ���I�����ꂽ�B", Toast.LENGTH_LONG).show();
            break;
        case MENU_FRAGMENT_0_1:
            Toast.makeText(this, "MENU_FRAGMENT_0_1 ���I�����ꂽ�B", Toast.LENGTH_LONG).show();
            break;
        default:
            result = super.onOptionsItemSelected(item);
            break;
        }
        return result;
    }
}