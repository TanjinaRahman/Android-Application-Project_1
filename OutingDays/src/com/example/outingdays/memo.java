package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class memo extends Activity{
	ListView lv;
	String[] data={"National Martyrs’ Memorial :","Where to stay:","How to go:"};
	String[] des={"National Martyrs’ Memorial is the national monument of Bangladesh, set up in the memory of the valour and the sacrifice of all those who gave their lives in the Bangladesh Liberation War of 1971, which brought independence and separated Bangladesh from Pakistan. The monument is located in Savar, about 35 km north-west of the capital, Dhaka.[1] It was designed by Syed Mainul Hossain.                                               General information :                                     Status	Complete                                           Type:	Public monument                         Location:	Savar, Bangladesh                                Construction started:	1978                                  Completed:1982                                                            Design and construction:                               Architect	Syed Mainul Hossain                            Address: Nabinagar Dhaka - Aricha Hwy, Savar 1344, Bangladesh                                Hours: Monday	9AM–6PM                             Tuesday	9AM–6PM                             Wednesday	9AM–6PM                              Thursday	9AM–6PM                            Friday	9AM–6PM                                                Saturday	9AM–6PM                                         Sunday	9AM–6PM","There are a lot of hotels in Dhaka city.You can stay at one of them.But be careful to select a hotel.","You can hire a CNG or taxi to go there.Local buses are available.You can ride on one of them.Then go to the Address: : Nabinagar Dhaka - Aricha Hwy, Savar 1344, Bangladesh"};
	Integer[] img={R.drawable.monu,R.drawable.hotel,R.drawable.bus};
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
