package com.example.learnhtml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Tie DrawerLayout events to the ActionBarToggle.
        drawerToggle = setupDrawerToggle();
        mDrawer.addDrawerListener(drawerToggle);

        // Attach listener to drawer menuitems and handle user selections.
        NavigationView nvDrawer = (NavigationView) findViewById(R.id.nvView);
        //View drawerHeader = nvDrawer.inflateHeaderView(R.layout.drawer_header);
        setupDrawerContent(nvDrawer);
    }

    private void setupDrawerContent(NavigationView nvDrawer) {
        nvDrawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectDrawerItem(item);
                return false;
            }
        });
    }

    private void selectDrawerItem(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                finish();
                break;
            case R.id.nav_editor:
                finish();
                break;
            case R.id.nav_quiz:
                finish();
                break;
            case R.id.nav_Introduction:
                finish();
                break;
            case R.id.nav_Editors:
                finish();
                break;
            case R.id.nav_Elements:
                finish();
                break;
            case R.id.nav_Attributes:
                finish();
                break;
            case R.id.nav_Comments:
                finish();
                break;
            case R.id.nav_Styles:
                finish();
                break;
            case R.id.nav_Colors:
                finish();
                break;
            case R.id.nav_Responsive:
                finish();
                break;
            case R.id.nav_centered:
                finish();
                break;
            case R.id.nav_BasicExample:
                finish();
                break;
            case R.id.nav_Headings:
                finish();
                break;
            case R.id.nav_Paragraphs:
                finish();
                break;
            case R.id.nav_Links:
                finish();
                break;
            case R.id.nav_LineBreak:
                finish();
                break;
            case R.id.nav_HorizontalRule:
                finish();
                break;
            case R.id.nav_TextFormatting:
                finish();
                break;
            case R.id.nav_BlockLevel:
                finish();
                break;
            case R.id.nav_Sections:
                finish();
                break;
            case R.id.nav_Images:
                finish();
                break;
            case R.id.nav_Tables:
                finish();
                break;
            case R.id.nav_Lists:
                finish();
                break;
            case R.id.nav_DescriptionLists:
                finish();
                break;
            case R.id.nav_Javascript:
                finish();
                break;
            case R.id.nav_Forms:
                finish();
                break;
            case R.id.nav_FormLabels:
                finish();
                break;
            case R.id.nav_InputTypes:
                finish();
                break;
            case R.id.nav_TextArea:
                finish();
                break;
            default:
        }
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.drawer_open, R.string.drawer_close);

    }
}