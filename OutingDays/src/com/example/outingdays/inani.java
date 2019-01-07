package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class inani extends Activity{
	ListView lv;
	String[] data={"Inani Beach:","Where to stay:","How to go:"};
	String[] des={"If you want a quiet moment away from heaps of tourists in the town proper, a one hour trip to the nearby Inani Beach should be a nice treat. Be relaxed with the sight of corals spread among pristine sand and the sound of the breeze calling out from the sea.","There are a lots of hotels near the beach like-           Hotel Kollol                                                      Sayeman Beach Resort,                               Long Beach Hotel,                                      Hotel The Cox Today","Inani Beach is 32 km away from Cox’s Bazar, getting there can take 30 minutes to one hour of travel. You can hire a taxi or CNG (small CNG run vehicles for 3-4 persons) from Cox’s Bazar to take you directly to the beach. You will surely enjoy this private ride as the scenery along the way is very wonderful.However, if you’re up to saving some money, you can ride a bus to Teknaf wherein you should get off at Court Bazar, a small village 2 km before Ukhia. From there, you can take a rickshaw or tempo west to the beach."};
	Integer[] img={R.drawable.inanii,R.drawable.hotel,R.drawable.bus};
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
