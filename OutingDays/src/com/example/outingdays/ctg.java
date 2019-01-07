package com.example.outingdays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

public class ctg extends Activity{
ListView lv;
ArrayAdapter adapter;
String[] data={"Cox’s Bazar sea beach","Inani Beach","Himchari","Saint Martin","Sajek Valley","Nafakhum Waterfalls","Nilachal","Golden Temple","Nil Giri","Alu Tila Cave"};
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
				Toast.makeText(ctg.this,"Cliked on "+text,Toast.LENGTH_LONG).show();
				switch(i){
				case 0:
					Intent intent=new Intent(ctg.this,cx.class);
					startActivity(intent);
					break;
				case 1:
					Intent intent1=new Intent(ctg.this,inani.class);
					startActivity(intent1);
					break;
				case 2:
					Intent intent2=new Intent(ctg.this,him.class);
					startActivity(intent2);
					break;
				case 3:
					Intent intent3=new Intent(ctg.this,saint.class);
					startActivity(intent3);
					break;
				case 4:
					Intent intent4=new Intent(ctg.this,sajek.class);
					startActivity(intent4);
					break;
				case 5:
					Intent intent5=new Intent(ctg.this,nafa.class);
					startActivity(intent5);
					break;
				case 6:
					Intent intent6=new Intent(ctg.this,nila.class);
					startActivity(intent6);
					break;
				case 7:
					Intent intent7=new Intent(ctg.this,gold.class);
					startActivity(intent7);
					break;
				case 8:
					Intent intent8=new Intent(ctg.this,nil.class);
					startActivity(intent8);
					break;
				case 9:
					Intent intent9=new Intent(ctg.this,alu.class);
					startActivity(intent9);
					break;
				
				}
				
			}
			
		});
	}

}
