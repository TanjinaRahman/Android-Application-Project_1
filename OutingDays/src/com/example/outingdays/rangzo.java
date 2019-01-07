package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class rangzo extends Activity{
ListView lv;
	
	String[] data={"Rangpur Zoo :","Where to stay:","How to go:"};
	String[] des={"Recreation Park and Rangpur Zoo or Rangpur Zoo is a Zoo located in Rangpur in Bangladesh. This is the largest zoo in the North Bengal. With an area of 20.27 acre of lush green trees and grasses, the zoo is located east side of Hanuman-tola road beside police-line, not far from Rangpur District Administration Office. Rangpur central zoo is one of the main amusement and recreation spot of Rangpur city.","1. Hotel North View,Central Rd, Rangpur, Bangladesh.            2. Grand Dhaka Hotel,Chaul amod Road, Rangpur, Bangladesh.Phone: +880 521-5506               3. Rayan's Hotel,Lal Kuthi Road, Rangpur, Bangladesh.Phone: +880 1720-43770","There are available bus 24 hours a day. It is easy to go Rangpur from Dhaka. The distance between Dhaka to Rangpur is 346.3 km and arrival time minimum 8 hours. These bus are available from Dhaka to Rangpur, click here. After reaching Rangpur take rickshaw or local transport to reach the place."};
	Integer[] img={R.drawable.rangzo,R.drawable.hotel,R.drawable.bus};
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
