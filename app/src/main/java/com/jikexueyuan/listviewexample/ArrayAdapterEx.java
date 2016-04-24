package com.jikexueyuan.listviewexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

/**
 * Created by fanlin on 2016/4/23.
 */
public class ArrayAdapterEx extends Activity {

    private ListView listView;
    private ArrayAdapter<ExampleItem> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        adapter = new ArrayAdapter<ExampleItem>(this,android.R.layout.simple_list_item_1);
        adapter.add(new ExampleItem("ArrayAdapter示例") {
            @Override
            public void onAction() {
                startActivity(new Intent(ArrayAdapterEx.this,MainActivity.class));
            }
        });
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.getItem(position).onAction();
            }
        });
    }
}
