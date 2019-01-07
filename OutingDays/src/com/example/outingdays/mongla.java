package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class mongla extends Activity{
	ListView lv;
String[] data={"Mongla :","Where to stay:","How to go:"};
String[] des={"Mongla is the main sea port in the Bagerhat District of south-western Bangladesh.he name Mongla originated from Mongla River presently known as Mongla Nulla. Mongla River originated from Pashur and Rampal is situated beside Pashur. The anchorage was shifted to Mongla in 1954 as the place could accommodate sea-going vessels with greater draughts. During the Pakistan period, the administration of the port was under a port director, whose main office was at Khulna.It was formerly located at Chalna, about 11 miles (18 km) upstream on the Pashur river but it is now located 48 km south of Khulna city, as established on 11 December 1954. The Port is surrounded as well as well protected by the Sundarban mangrove forest.The port is situated at the confluence of the Pashur River and the Mongla River. It lies about 62 miles (100 km) north of the Bay of Bengal and is connected to the major inland river ports and to the rail terminal at Khulna.","A three storey Rest House of Mongla Port Authority is available, where tourists can plan their stay, however prior booking is required. But it is also possible to stay in launch at night.There are also several private hotels and restaurants in Mongla town to stay and have food.","After get reach at Khulna you have to go Mongla port by bus or private vehicles and will take 2/3 hours."};
	Integer[] img={R.drawable.mongla,R.drawable.hotel,R.drawable.bus};
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
	
