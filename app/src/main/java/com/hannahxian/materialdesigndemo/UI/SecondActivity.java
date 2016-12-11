package com.hannahxian.materialdesigndemo.UI;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hannahxian.materialdesigndemo.R;
import com.hannahxian.materialdesigndemo.adapters.MyRecycleViewAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SecondActivity extends Activity {

    @Bind(R.id.recycle)
    RecyclerView recycle;

    private RecyclerView.LayoutManager layoutManager;
    private MyRecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        initRecycleView();

    }
    private void initRecycleView(){
        layoutManager = new LinearLayoutManager(this);
        recycle.setLayoutManager(layoutManager);
        adapter = new MyRecycleViewAdapter(this);
        String[] strs = new String[10];
        for(int i=0;i<10;i++){
            strs[i] = "description "+i;
        }
        adapter.setSts(strs);
        recycle.setAdapter(adapter);
    }
}
