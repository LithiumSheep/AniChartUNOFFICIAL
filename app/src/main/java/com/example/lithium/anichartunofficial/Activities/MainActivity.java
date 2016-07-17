package com.example.lithium.anichartunofficial.Activities;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import com.example.lithium.anichartunofficial.Fragments.AboutFragment;
import com.example.lithium.anichartunofficial.Fragments.AiringFragment;
import com.example.lithium.anichartunofficial.Fragments.SeasonFragment;
import com.example.lithium.anichartunofficial.Fragments.SettingsFragment;
import com.example.lithium.anichartunofficial.R;
import com.example.lithium.anichartunofficial.Utils.LoggerUtil;
import com.example.lithium.anichartunofficial.Utils.SeasonYearUtil;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {
    private static final String LOG = MainActivity.class.getSimpleName();

    private Context mContext = this;
    private Drawer mDrawer = null;
    private Toolbar mToolbar;
    private FragmentManager mFragMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mFragMan = getSupportFragmentManager();
        getFragment(new AiringFragment());

        initialTasks();
        LoggerUtil.debug(LOG, "Finished loading MainActivity");
    }

    private void initialTasks() {
        //setupDrawer();
    }

    private void setupDrawer() {
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withName(R.string.season_airing);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withName(R.string.season_winter);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withName(R.string.season_spring);
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withName(R.string.season_summer);
        PrimaryDrawerItem item5 = new PrimaryDrawerItem().withName(R.string.season_fall);

        AccountHeader header = new AccountHeaderBuilder().withActivity(this)
                .withHeaderBackground(R.color.primary)
                //.withHeaderBackground(R.mipmap.ic_logo_anichart)
                .build();

        mDrawer = new DrawerBuilder().withActivity(this)
                .withToolbar(mToolbar)
                .withAccountHeader(header)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        item3,
                        item4,
                        item5,
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName(R.string.settings),
                        new SecondaryDrawerItem().withName(R.string.about)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        mDrawer.closeDrawer();
                        switch (position) {
                            case 1:
                                mToolbar.setTitle("AniChart");
                                getFragment(new AiringFragment());
                                break;
                            case 3:
                                mToolbar.setTitle("Winter");
                                getFragment(new SeasonFragment());
                                break;
                            case 4:
                                mToolbar.setTitle("Spring");
                                getFragment(new SeasonFragment());
                                break;
                            case 5:
                                mToolbar.setTitle("Summer");
                                getFragment(new SeasonFragment());
                                break;
                            case 6:
                                mToolbar.setTitle("Fall");
                                getFragment(new SeasonFragment());
                                break;
                            case 8:
                                mToolbar.setTitle("Settings");

                                break;
                            case 9:
                                mToolbar.setTitle("About");
                                getFragment(new AboutFragment());
                                break;
                        }
                        return true;
                    }
                })
                .build();
    }

    private void getFragment(Fragment fragment) {
        FragmentTransaction transaction = mFragMan.beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if (mDrawer != null && mDrawer.isDrawerOpen()) {
            mDrawer.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }
}
