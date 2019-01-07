package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class lal extends Activity{
ListView lv;
	
	String[] data={"Lalbagh Fort :","Where to stay:","How to go:"};
	String[] des={"Fort complex comprised of 3 buildings, including a mosque, containing paintings,antiques & weapons.Address: Lalbagh Rd, Dhaka, Bangladesh Close Days: Sunday and all other listed government holidays.Visiting Hours: Monday from 1.30pm-5pm; Tuesday-Saturday,9am-5pm during October-March; 10am-6pm during April-September; During Friday the place remain closed from 12.30pm-2.00pm due to prayer.Entry Fee: tk.10/ Bangladeshi Entrants and tk.50/ Foreign Entrants.Tel: 9673018","There are a lot of hotels in Dhaka city.ou can stay at one of them.But be careful to select hotel.","You can hire a CNG or taxi to go there.Local bues are available.You can ridw on one of them.Then go to Lalbagh Rd, Dhaka, Bangladesh"};
	Integer[] img={R.drawable.lal,R.drawable.hotel,R.drawable.bus};
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
