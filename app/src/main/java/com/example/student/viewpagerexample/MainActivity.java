package com.example.student.viewpagerexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_Pager);
        final  ViewPagerAdapter adapter = new ViewPagerAdapter(this, getList());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);

    }

    private List <Girl> getList(){
        final  List<Girl> list = new ArrayList<>();
        list.add(new Girl("Lima", R.drawable.lima) );
        list.add(new Girl("Joli", R.drawable.jolie) );
        list.add(new Girl("Beluchi", R.drawable.beluchi) );

        return list;

    }

}
