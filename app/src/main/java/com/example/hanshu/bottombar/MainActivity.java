package com.example.hanshu.bottombar;

import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

public class MainActivity extends AppCompatActivity {
    CoordinatorLayout coo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coo= (CoordinatorLayout) findViewById(R.id.container);
        BottomBar bar=BottomBar.attach(this,savedInstanceState);
        bar.setItemsFromMenu(R.menu.menus, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected( int menuItemId) {
                switch(menuItemId){
                    case R.id.item_R:
                        Snackbar.make(coo,"最近的消息",Snackbar.LENGTH_SHORT).show();break;
                    case R.id.item_L:
                        Snackbar.make(coo,"最近的位置",Snackbar.LENGTH_SHORT).show();break;
                    case R.id.item_f:
                        Snackbar.make(coo,"最近的爱好",Snackbar.LENGTH_SHORT).show();break;
                }

            }
        });
        //bar.setActiveTabColor();

    }
}
