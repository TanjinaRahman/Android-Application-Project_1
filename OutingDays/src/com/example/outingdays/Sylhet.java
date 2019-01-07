package com.example.outingdays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Sylhet extends Activity{
	ListView lv;
	ArrayAdapter adapter;
	String[] data={" Bisnakandi"," Jaflong"," Lovachora"," Panthumai"," Ratargul"};
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
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
				Toast.makeText(Sylhet.this,"Cliked on "+text,Toast.LENGTH_LONG).show();
				switch(i){
				case 0:
					Intent intent=new Intent(Sylhet.this,bsna.class);
					startActivity(intent);
					break;
				case 1:
					Intent intent1=new Intent(Sylhet.this,jaf.class);
					startActivity(intent1);
					break;
				case 2:
					Intent intent2=new Intent(Sylhet.this,lova.class);
					startActivity(intent2);
					break;
				case 3:
					Intent intent3=new Intent(Sylhet.this,pan.class);
					startActivity(intent3);
					break;
				case 4:
					Intent intent4=new Intent(Sylhet.this,ratargul.class);
					startActivity(intent4);
					break;
}
				
			}
			
		});
	}

}