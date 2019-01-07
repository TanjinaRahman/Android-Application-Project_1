package com.example.outingdays;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class div extends Activity{
ListView lv;
String[] data={"1. Dhaka","2. Chittagong","3. Sylhet","4. Khulna","5. Rajshahi","6. Rangpur","7. Barisal","8. Mymensingh"};
ArrayAdapter adapter;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.div);
		lv=(ListView)findViewById(R.id.listView1);
	ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
	lv.setAdapter(adapter);
	lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View view, int i,
				long arg3) {
			
			
			switch(i){
			case 0:
				Toast.makeText(div.this, "Cliked on Dhaka", Toast.LENGTH_SHORT).show();
				Intent intent=new Intent(div.this,dhaka.class);
				startActivity(intent);
				break;
			case 1:
				Toast.makeText(div.this, "Cliked on Chittagong", Toast.LENGTH_SHORT).show();
				Intent intent1=new Intent(div.this,ctg.class);
				startActivity(intent1);
				break;
			case 2:
				Toast.makeText(div.this, "Cliked on Sylhet", Toast.LENGTH_SHORT).show();
				Intent intent2=new Intent(div.this,Sylhet.class);
				startActivity(intent2);
				break;
			case 3:
				Toast.makeText(div.this, "Cliked on Khulna", Toast.LENGTH_SHORT).show();
				Intent intent3=new Intent(div.this,khulna.class);
				startActivity(intent3);
				break;
			case 4:
				Toast.makeText(div.this, "Cliked on Rajshahi", Toast.LENGTH_SHORT).show();
				Intent intent4=new Intent(div.this,raj.class);
				startActivity(intent4);
				break;
			case 5:
				Toast.makeText(div.this, "Cliked on Rangpur", Toast.LENGTH_SHORT).show();
				Intent intent5=new Intent(div.this,rang.class);
				startActivity(intent5);
				break;
			case 6:
				Toast.makeText(div.this, "Cliked on Barisal", Toast.LENGTH_SHORT).show();
				Intent intent6=new Intent(div.this,bari.class);
				startActivity(intent6);
				break;
			case 7:
				Toast.makeText(div.this, "Cliked on Mymensingh", Toast.LENGTH_SHORT).show();
				Intent intent7=new Intent(div.this,mym.class);
				startActivity(intent7);
				break;
			
			}
		}
		
	});
	}

}
