package com.example.outingdays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class mym extends Activity{
	ListView lv;
	ArrayAdapter adapter;
String[] data={"Birishiri","Shoshi Lodge","Dhanbari Nawab Manzil","Gajni Abokash"};
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
			Toast.makeText(mym.this,"Cliked on "+text,Toast.LENGTH_LONG).show();
			switch(i){
			case 0:
				Intent intent=new Intent(mym.this,biri.class);
				startActivity(intent);
				break;
			case 1:
				Intent intent1=new Intent(mym.this,sosi.class);
				startActivity(intent1);
				break;
			case 2:
				Intent intent2=new Intent(mym.this,dhon.class);
				startActivity(intent2);
				break;
			case 3:
				Intent intent3=new Intent(mym.this,gajni.class);
				startActivity(intent3);
				break;
			
			}
			
		}
		
	});
}

}

