package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class him extends Activity{
	ListView lv;
	String[] data={"Himchari:","Where to stay:","How to go:"};
	String[] des={"Six kilometers away from the Kolatoli Beach awaits the sight of Himchari’s beautiful waterfalls and hilltop overlooking the beach. You can spend your morning or afternoon in Himchari for a wonderful picnic, sunbathing, and nature tripping. From Cox’s Bazar Kalatali stand, this place is only a 15-minute ride by taxi or chandergari (a type of jeep). You can also rent a rickshaw or auto-rickshaw from Cox’s Bazar.If you are going to Inani Beach, you can tell your driver to drop you by as well to Himchari. Yes, they wouldn’t mind driving you to two spots on the same go. You can roam around Himchari for 30-60 minutes before heading to Inani Beach.","There are a lots of hotels near the beach like-           Hotel Kollol                                                      Sayeman Beach Resort,                               Long Beach Hotel,                                      Hotel The Cox Today", "Hire a auto riksha from the main beach area. It will cost around 450-600tk and they will take you to Inani, stop at Himchori too, and bring you back to your hotel."};
	Integer[] img={R.drawable.him1,R.drawable.hotel,R.drawable.bus};
	
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
