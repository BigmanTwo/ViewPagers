package com.example.asus.viewpagers;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private ViewPager mViewPager;
    private List<ImageView> mList;
    private int[] image={R.mipmap.beatiful,R.mipmap.login,R.mipmap.cat};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager= (ViewPager) findViewById(R.id.view_pager);
        mList=new ArrayList<>();
        for(int i=0;i<image.length;i++){
            ImageView imageView=new ImageView(this);
            imageView.setImageResource(image[i]);
            mList.add(imageView);
        }
        MyPagerAdapter adapter=new MyPagerAdapter(mList,this);
        mViewPager.setAdapter(adapter);
    }
}
