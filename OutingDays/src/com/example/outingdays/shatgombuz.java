package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class shatgombuz extends Activity{
	ListView lv;
	String[] des={"This is one of the most beautiful and largest archaeological and historical Mosque in Bangladesh. This is a Holy place. It was made by red burn mud.it was decorated beautifully with terracotta flowers and foliage. The archeological beauty of this Mosque enchants the tourist very much. Besides this Mosque an attractive archaeological museum is there where you can find that times archaeological and historical materials. Near to this mosque you can also visit the Shrine of Khan Jahan Ali. The UNESCO has been recognized this Mosque as a World Heritage Site in 1983. At present a picnic spot has been established near this heritage site at the historical Ghora Dighi.","You can stay at hotel in Bagerhat city at night.There are many hotels to stay.","You can reach Bagerhat from Khulna by Bus. Direct bus service is also available from Dhaka to Bagerhat. The journey takes 5 or 6 hours. It is 6km away from Bagerhat city. You can go there by Rickshaw. Shrine of Hazrat Khan Jahan Ali is only 3km away from Shat Gambuj Mosque"};
	String[] data={"Shat Gambuj Masjid :","Where to stay:","How to go:"};
	
	Integer[] img={R.drawable.satgomboz,R.drawable.hotel,R.drawable.bus};
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