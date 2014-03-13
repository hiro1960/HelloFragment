package com.example.hellofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MyFragment1 extends Fragment {

    private static final int MENU_FRAGMENT_1_0 = Menu.FIRST + 100;
    private static final int MENU_FRAGMENT_1_1 = Menu.FIRST + 101;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.setHasOptionsMenu(true);
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1_main, container, false);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, android.view.MenuInflater inflater) {
        menu.add(0, MENU_FRAGMENT_1_0, 0, "Fragment1_0")
            .setIcon(android.R.drawable.ic_menu_call)
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        menu.add(0, MENU_FRAGMENT_1_1, 0, "Fragment1_1")
            .setIcon(android.R.drawable.ic_menu_gallery)
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean result = true;
        switch (item.getItemId()){
        case MENU_FRAGMENT_1_0:
            Toast.makeText(getActivity(), "MENU_FRAGMENT_1_0 が選択された。", Toast.LENGTH_LONG).show();
            break;
        case MENU_FRAGMENT_1_1:
            Toast.makeText(getActivity(), "MENU_FRAGMENT_1_1 が選択された。", Toast.LENGTH_LONG).show();
            break;
        default:
            result = super.onOptionsItemSelected(item);
            break;
        }
        return result;
    }
}
