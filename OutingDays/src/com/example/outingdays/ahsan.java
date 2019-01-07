package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ahsan extends Activity{
ListView lv;
	
	String[] data={"Ahsan Manzil  :","Where to stay:","How to go:"};
	String[] des={"Ahsan Manzil was the official residential palace and seat of the Nawab of Dhaka. The building is situated at Kumartoli along the banks of the Buriganga River in Dhaka, Bangladesh. Construction was started in 1859 and was completed in 1872. It was constructed in the Indo-Saracenic Revival architecture. It has been designated as a national museum.1800s palace of the Nawabs of Dhaka featuring an iconic pink facade, a dome & period furnishings.                                 Address: 2/3 Islampur Rd, Dhaka, Bangladesh                         Phone:+880 1833-048402                               Hours:   Monday	10:30AM–6:30PM                                 Tuesday	10:30AM–6:30PM                            Wednesday	10:30AM–6:30PM                          Thursday	10:30AM–6:30PM                       Friday	3–7:30PM                                      Saturday	10:30AM–6:30PM                                        Sunday	10:30AM–6:30PM","There are a lot of hotels in Dhaka city.You can stay at one of them.But be careful to select a hotel.","You can hire a CNG or taxi to go there.Local buses are available.You can ride on one of them.Then go to the address: 2/3 Islampur Rd, Dhaka, Bangladesh.You also can contact on +880 1833-048402"};
	Integer[] img={R.drawable.ahsan,R.drawable.hotel,R.drawable.bus};
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
