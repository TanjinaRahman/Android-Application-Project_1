package com.example.outingdays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class rang extends Activity{
	ListView lv;
	ArrayAdapter adapter;
	String[] data={"Kantajew Temple","Rangpur Zoo","Tajhat Palace"};
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.ctg);
			lv=(ListView)findViewById(R.id.listView1);
			ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
			lv.setAdapter(adapter);
			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View view, int i,
						long arg3) {
					String text=lv.getItemAtPosition(i).toString();
					Toast.makeText(rang.this,"Cliked on "+text,Toast.LENGTH_LONG).show();
					switch(i){
					case 0:
						Intent intent=new Intent(rang.this,kantatmp.class);
						startActivity(intent);
						break;
					case 1:
						Intent intent1=new Intent(rang.this,rangzo.class);
						startActivity(intent1);
						break;
					case 2:
						Intent intent2=new Intent(rang.this,tajhat.class);
						startActivity(intent2);
						break;
				
					}
					
				}
				
			});
		}

	}