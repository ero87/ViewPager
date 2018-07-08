package com.example.student.viewpagerexample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Student on 7/7/2018.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private List<Girl> girls;

    public ViewPagerAdapter(Context context, List<Girl> girls) {
        this.context = context;
        this.girls = girls;
    }

    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = inflater.inflate(R.layout.girl_item, container, false);
        final ImageView girlimage = view.findViewById(R.id.girl_image);
        final TextView girlname = view.findViewById(R.id.girl_name);
        final Girl girl = girls.get(position);
        girlimage.setImageResource(girl.getImageUrl());
        girlname.setText(girl.getName());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
     //   super.destroyItem(container, position, object);
        container.removeView((View) object);
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
