package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class gold extends Activity{
ListView lv;
	
	String[] data={"Golden Temple/Shorno Mondir :","Where to stay:","How to go:"};
	String[] des={"Situated about 3kms away from town, (also known as) Buddha Dhatu Jadi houses Bangladesh’s second largest Buddha. The beautiful golden stupa sits on top of the hill, giving visitors a good glance over Balaghata and a peaceful religious complex all in all. It attracts local and foreign visitors alike all year long.You need only a few hours to visit this beautiful site. The temple is open from 5PM to 7PM. Please note that shorts or three quarters pants are not allowed inside the temple.","There are many hotels in Bandarban.You can stay there.Hotels names are:                    1. Hill Side Resort, Milonchori, Bandarban,Cost: 2500Tk - 5000Tk                                           2. Venus Resort,Meghla, Bandarban, Cost: 2500Tk - 5000Tk                                                    3. Moyna Cottage,Hillside Resort, Milonchori, Bandarban, Cost: 1000Tk - 2500Tk                                                                  4. Hotel Hill View,Bus Stand, Bandarban Main Road, Cost: 1000Tk - 2500Tk                                               5. Hotel Sangu ,Don Bosco High School Road, Jadi Para, Bandarban,Cost: 500Tk - 1000Tk                                                            6. Green Peak Hotel,Meghla, Bandarban,Cost: 2500Tk - 5000Tk "," When Golden temple is very near of Bandarban town, you may go there by Auto rickshaw, Chander Gari (Public Jeep), car etc. It may take about 30 minutes to go."};
	Integer[] img={R.drawable.gold,R.drawable.hotel,R.drawable.bus};
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
