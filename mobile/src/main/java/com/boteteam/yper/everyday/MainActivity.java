package com.boteteam.yper.everyday;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.boteteam.yper.everyday.Adapter.MainAdapter;
import com.boteteam.yper.everyday.Module.EverDayModel;
import com.boteteam.yper.everyday.Utils.MDBTool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<EverDayModel> everDayModelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.everDayList);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        EverDayModel everDayModel=new EverDayModel(new Date());

        everDayModel.setGjxq("test");
        everDayModel.setJhjc("test");
        everDayModel.setRyqk("heloo");

        everDayModelList.add(everDayModel);
        everDayModelList.add(everDayModel);
        everDayModelList.add(everDayModel);
        everDayModelList.add(everDayModel);


        MainAdapter mainAdapter=new MainAdapter(everDayModelList);
        recyclerView.setAdapter(mainAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        MDBTool mdbTool=new MDBTool();
                        EverDayModel everDayModel=new EverDayModel(new Date());

                        everDayModel.setGjxq("test");
                        everDayModel.setJhjc("test");
                        everDayModel.setRyqk("heloo");

                        mdbTool.writeDay(everDayModel);
                    }
                }).start();
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
