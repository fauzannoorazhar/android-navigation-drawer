package com.example.fauzan.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //displaySelectedScreen(R.id.nav_fragment_satu);
    }

    /**
     * @param menuItem
     * @return
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Log.i("Menu Item ","" + menuItem);
        Log.i("Id Menu Item ","" + menuItem.getItemId());
        Log.i("Id Nav ", "" + R.id.nav_fragment_dua);

        int id = menuItem.getItemId();

        switch (id) {
            case R.id.nav_fragment_satu:
                SatuFragment satuFragment = new SatuFragment();
                satuFragment.setArguments(getIntent().getExtras());
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, satuFragment).commit();
                getSupportFragmentManager().popBackStack();
                break;
            case R.id.nav_fragment_dua:
                DuaFragment duaFragment = new DuaFragment();
                duaFragment.setArguments(getIntent().getExtras());
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, duaFragment).commit();
                getSupportFragmentManager().popBackStack();
                break;
        }

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);

        //make this method blank
        return true;
    }

    /**
     * Jika menu terbuka lalu klik tombol kembali
     * maka menu tertutup
     */
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /**
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // Do something for setting menu
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*private void displaySelectedScreen(int itemId) {
        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (itemId) {
            case R.id.nav_fragment_satu:
                fragment = new SatuFragment();
                break;
            case R.id.nav_fragment_dua:
                fragment = new DuaFragment();
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = manager.beginTransaction();
            fragmentTransaction.replace(R.id.content_frame, fragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }*/
}
