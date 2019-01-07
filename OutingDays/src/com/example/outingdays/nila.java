package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class nila extends Activity{
	ListView lv;
	
	String[] data={"Nilachal :","Where to stay:","How to go:"};
	String[] des={"Situated at only 5 kms away, this 2000ft high pit-stop is one of the most easily accessible tourist spots of Bandarban. Just hire a autoriksha or a jeep to go there. Best time to visit is in rainy season or in winter. From the top you will be able to enjoy a bird’s-eye view of the Bandarban town.","There is no accommodation facility or restaurants at the top. So you will need to make arrangements accordingly.","Nil Giri is in Bandarban.Just hire a autoriksha or a jeep to go there.You have to hire it from Bandarban"};
	Integer[] img={R.drawable.nila,R.drawable.hotel,R.drawable.bus};
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ctg);
		lv=(ListView)findViewById(R.id.listView1);
		custom cus=new custom(this,data,img,des);
		lv.setAdapter(cus);
	}

}
