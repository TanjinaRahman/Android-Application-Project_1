package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class alu extends Activity{
	ListView lv;
	String[] data={"Alu Tila Cave :","Where to stay:","How to go:"};
	String[] des={"No Khagrachhari trip is compete without a visit to this long and mysterious cave. Stretched 100 meters out, adventure-lovers and thrill-seekers will enjoy a trek down Khagrachhari’s most well known tourist spot. A mystery is said to be waiting for people who can endure meters of walking on slippery stones in the dark. The cave is safe and entry fee only costs BDT 5 ($0.07).Though the cave will only take less than 30 minutes for you to explore, it can be the journey that will take most of your time.","1. Chengi Hotel,Khagrachari,                           Cost: Less than 500Tk                                   2. Chawdhuri Boarding                             Khagrachari,Cost: Less than 500Tk                                     3. Hotel Lobiot/Lobyot                                   Khagrachari,Cost: Less than 500Tk                                   4. Hotel ecochari inn                                 Khagrapur, East gate of cantanment, khagrachari,                                                 Cost: 1000Tk - 2500Tk                                   5. Hotel Soilo Subarna                                   Near Municipality, Khagrachari,                              Cost: 500Tk - 1000Tk                                  6.Ziran Hotel                                                        Bazar Road, Khagrachari,                           Cost: Less than 500Tk ","From Khagracchari, you can ride a local bus or micro bus going to Alu Tila. Just make sure to leave in the afternoon as it will be impossible to find a ride back home at night."};
	Integer[] img={R.drawable.alutila,R.drawable.hotel,R.drawable.bus};
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
