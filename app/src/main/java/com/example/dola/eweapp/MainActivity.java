package com.example.dola.eweapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;

    private ActionBarDrawerToggle drawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set teh content of the activity to user the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Set a toolbar ro replace the ActionBar
        //toolbar = findViewById(R.id.toolbar);

        //setSupportActionBar(toolbar);


        // Find the drawer view
        //mDrawer = findViewById(R.id.drawer_layout);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentViewPageAdapter adapter = new SimpleFragmentViewPageAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //The action bar home/up action should open or close the drawer
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                }
        );
    }

    public void selectDrawerItem(MenuItem menuItem){
        // Create a new fragment and specify hte fragment to show based on nav item clicked
        Fragment fragment = null;

        switch (menuItem.getItemId()){
            case R.id.nav_numbers_fragment:
                fragment = new NumbersFragment();
                break;

            case R.id.nav_family_fragment:
                fragment = new FamilyFragment();
                break;

            case R.id.nav_colors_fragment:
                fragment = new FamilyFragment();
                break;

            case R.id.nav_phrases_fragment:
                fragment = new FamilyFragment();
                break;

            default:
                fragment = new NumbersFragment();
        }

        //Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();

        // Highlight the selected item has been done by NavigationView
        menuItem.setChecked(true);

        // Set action bar title
        setTitle(menuItem.getTitle());

        //Close the navigation drawer
        mDrawer.closeDrawers();

    }

    /*
    public void openNumberActivity(View v){

    }

    public void openFamilyActivity(View v){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openColorActivity(View v){
        Intent i = new Intent(this, ColorActivity.class);
        startActivity(i);
    }

    public void openPhrasesActivity(View v){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
    */
}
