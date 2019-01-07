package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class gajni extends Activity{
ListView lv;
	
	String[] data={"Gajni Abokash :","Where to stay:","How to go:"};
	String[] des={". This hill in not high like Rangamati, Bandarban, but very nice to see, there are some site view tower to see around, unbelievable seen are waiting for you.","Living in Gajni area there are a governments rest house, District commissioner rest house LGED Banglo or local rest house & Hotel motel is there, room cost will be not more that BDT-800/=. There are some more hotels with Air-conditions service.","After that you have to take a Ricksha or Auto to go Sherpur local bus station. From Local bus service you have to go Ginayghati rent will be BDT 25 to 30. From Sherpur to Ginayghati distance 20KM. from Ginayghati to Gajni sport 08 KM per has to be go by Auto or Ricksha, cost will be BDT 30 to 50tk"};
	Integer[] img={R.drawable.gajni,R.drawable.hotel,R.drawable.bus};
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