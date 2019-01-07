package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class jaf extends Activity{
	ListView lv;
	String[] data={"Jaflong :","Where to stay:","How to go:"};
	String[] des={"Jaflong is a wonderful and most attractive natural visiting place of Sylhet.It attracts the tourists with its spontaneous flow of cristal clear water through the valley of hills. It is situated besides the river Mari. You can see stone collection from the river and can enjoy boating in river Mari. Jaflong is totally a hilly area of real natural beauty so don’t miss it if you like hill trackinging. You can also see wild animal in the hilly forest. You can enjoy the lifestyle of Tribe Khashia in Jaflong also.Location : Gowainghat Upazila, Sylhet","1. Hotel Star Pacific, start from BDT 4,640 per night	      2. Ramer Dighirpar, Mirzajangal, Sylhet +88 0821 727640-1            3. Nirvana Inn, start from BDT 3,500 per night          4. Hotel Supreme, start from BDT 1,700 per night          5. Hotel Fortune Garden,Bongobir Road, Naiorpul, Sylhet    +88 0821 715590","It is about 60 Km away from Sylhet city so you need to have a road drive of 2 hours by Bus from Sylhet Natun Bridge Bus stand to Jaflong and have to get down at Mamar Dokan. Then by Rickshaw to the spot and then again have to take a boat to go to Zero Point the main spot of Jaflong."};
	Integer[] img={R.drawable.jaf,R.drawable.hotel,R.drawable.bus};
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
