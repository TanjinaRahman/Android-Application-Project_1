package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class nil extends Activity{
ListView lv;
	
	String[] data={"Nil Giri :","Where to stay:","How to go:"};
	String[] des={"About 3500 feet high, Nil Giri is one of the tallest peaks in Bandarban. If you’re off to see nature at its finest, then Nil Giri is the place to be. Whether you’re visiting on a cool day in winter or a cloudy afternoon, you will be amazed at the scenery on top of the mountain. You will be able to see river, small waterfalls, and tribal villages from up there.","The resort at Nilgiri (the only one at Nilgiri) is managed by the Bangladesh Army, so if you want to spend the night there you will have to contact the authority to make reservations.","Hire a Chander Gari (pet name for a truck/jeep) or a micro-bus from Bandarban town and head out to Nilgiri. The journey will surely take your breath away and it may very well be one of the most memorable journeys of your life. It may take 3 hours to reach Nilgiri."};
	Integer[] img={R.drawable.nil,R.drawable.hotel,R.drawable.bus};
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
