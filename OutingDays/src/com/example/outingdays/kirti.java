package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class kirti extends Activity{
ListView lv;
	
	String[] data={"Kirtipasha Palace :","Where to stay:","How to go:"};
	String[] des={"Kirtipasha Palace was named after King Kirty Narayana. Ramjibon sen founded the Kirtipasha palace. The jewels of the family are namely Rohini Roy and Tapon Roy. The contribution of Rohini Roy is Rohiniganj. There is a hospital in that area that is older than the Jhalakathi district hospital. There is also a family living near to the Shiva temple and Shiva’s statue.Kirtipasha Zamindar Bari is located at the village Kirtipasha of Jhalokathi district. This is probably a century old house. Now a days, it is abandoned and in a dilapidated condition. For most of the cases only the walls are standing, and the floors or ceilings are disappeared.The name of the village is after the Zamindar Kirtinarayan Pasha.And the founder of the Zamindar Bari was Ramjibon Sen. Only one of the building from this massive property was in good condition. Right now that one is a part of a girl’s school along with newly built buildings. The Zamindar Bari premise has a Shiva temple inside. And the remaining of a beautiful temple is also exists these days (only the columns and pillars).","The accommodation facilities in Jhalakathi are as follows: 1. Dhansiri Rest House: Kalibari Road, Jhalakathi-Phone no-0498-62212             2. Halima Boarding: MD Aziz Sadr road, Choumatha, Jhalakathi-Phone no-0498-62286              3. Arafat boarding: Phone no-0498-63589","It is very easy to access Kirtipasha Jomidar Bari from Jhalakathi  district town. You can take a battery driven vehicle (locally known as auto rickshaw) from the Fire Service Mor  that goes for the Kirtipasha  village. After that its a walking distance from there. You can ask to the locals if you need any help. GPS coordinate of the Kirtipasha Jomidar Bari is (22°40’54.18″N, 90°10’0.57″E).From Dhaka, there are several launches use to go to Jhalakathi and Barisal. You can use any of those to reach directly at Jhalakathi, or you can reach at Barisal  first, and then go to Jhalakathi  using local bus service. Launches for Barisal  are bigger and most luxurious from Bangladesh. And its only 30 minutes of road distance between Barisal and Jhalakathi."};
	Integer[] img={R.drawable.kirtii,R.drawable.hotel,R.drawable.bus};
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