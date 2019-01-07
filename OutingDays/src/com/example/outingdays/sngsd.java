package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class sngsd extends Activity{
ListView lv;
	
	String[] data={"Jatiya Sangsad Bhaban :","Where to stay:","How to go:"};
	String[] des={"Jatiya Sangsad Bhaban or National Parliament House,  is the house of the Parliament of Bangladesh, located at Sher-e-Bangla Nagar in the Bangladeshi capital of Dhaka. Designed by architect Louis Kahn, the complex is one of the largest legislative complexes in the world, comprising 200 acres (800,000 m²) The building was featured prominently in the 2003 film My Architect, detailing the career and familial legacy of its architect, Louis Kahn. Robert McCarter, author of Louis I. Kahn, described the National Parliament of Bangladesh as one of the twentieth century's most significant buildings.                                                   Address: Manik Mia Ave, Dhaka, Bangladesh                                           Hours:  Monday	9AM–5PM                                                                Tuesday	9AM–5PM                                                  Wednesday	9AM–5PM                                               Thursday	9AM–5PM                                                 Friday	9AM–5PM                                            Saturday	9AM–5PM                                       Sunday	9AM–5PM                                           Phone: +880 2-9111999                               Architectural styles: Modern architecture, Brutalist architecture                        Architects: Louis Kahn, Muzharul Islam","There are a lot of hotels in Dhaka city.You can stay at one of them.But be careful to select a hotel.","You can hire a CNG or taxi to go there.Local buses are available.You can ride on one of them.Then go to the Address: Manik Mia Ave, Dhaka, Bangladesh.You also can contact on Phone: +880 2-9111999"};
	Integer[] img={R.drawable.sngsd,R.drawable.hotel,R.drawable.bus};
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
