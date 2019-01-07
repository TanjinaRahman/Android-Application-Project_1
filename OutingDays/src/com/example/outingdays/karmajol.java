package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class karmajol extends Activity{
	ListView lv;
	String[] des={"Karamjal is one of the entry point of Sundarbad. It is most the nearest from Mongla port. If you are a bird watcher then it will be a nice for you. You can enjoy natural view of forest and see different kind of wild animals. Here you can see a Deer and Crocodile rearing station. This spot is best for one day tour.Climate Full monsoon is from June to September. The annual rainfall average between 65 inch and 70 inch. During ebb tide the forest becomes bare by 6-7 feet and at high tide (30 miles and hour) the entire territory of the forest floats on water.Must get permission from Harbaria Forest Office for 1 day tour. If you go for 2 days or more then get permission from the Divisional Forest Office, Circuit House Road, Khulna. Required entrance fees for visitors, vessel or boat payable at the relevant forest station/range office. For Bangladeshi people have to pay 50 BDT and Foreign tourist have to pay 700 BDT. Additional 100 taka will have to pay if you carry camera.","A three storey Rest House of Mongla Port Authority is available, where tourists can plan their stay, however prior booking is required. But it is also possible to stay in launch at night.There are also several private hotels and restaurants in Mongla town to stay and have food.","After get reach at Khulna you have to go Mongla port by bus or private vehicles and will take 2/3 hours. From Mongla you have to hire a small engine boat or launches to reach Karamjal, it will take only half an hour to reach."};
	String[] data={"Karamjal :","Where to stay:","How to go:"};
	
	Integer[] img={R.drawable.karmajol,R.drawable.hotel,R.drawable.bus};
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