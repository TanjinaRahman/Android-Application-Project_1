package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class lova extends Activity{
	ListView lv;
	String[] data={"Lovachora :","Where to stay:","How to go:"};
	String[] des={"Lovachora is a bordering area from Kanaighat Upazilla in the eastern part of Sylhet district, which is somewhat fortified from northeast to northwest by the Meghalayan ranges. It is essentially a quarry where stones and boulders are mined, besides an age-old tea garden. Visit to Lovachora involves with a boat journey from Kanaighat Sodor. As the boat moves east, it will soon reach the confluence of three rivers. Flowing respectively from the south and north, the Borak and the Lova meet at one point, assume the name Surma and flow west towards Sylhet city.The shades of far-flung hills falling on the crystal clear streams of the Lova make for a heavenly sight. The Lovachora Tea Garden is spread over a wide area from the river bank to the slopes of the hills. Still preserved in the garden is a tea factory ravaged in the War of Liberation in 1971. Together with an antique cottage, it is a must-see for visitors. The hilltop cottage is popularly known as Fergusson Bungalow, named after the Fergusson family who set up the tea garden.What’s more, subject to the permission from the border patrol force BGB, tourists can go to the source of the Lova and see the hanging bridge which connects two hills on the other side of the border.","1. Hotel Star Pacific, start from BDT 4,640 per night	      2. Ramer Dighirpar, Mirzajangal, Sylhet +88 0821 727640-1            3. Nirvana Inn, start from BDT 3,500 per night          4. Hotel Supreme, start from BDT 1,700 per night          5. Hotel Fortune Garden,Bongobir Road, Naiorpul, Sylhet    +88 0821 715590 ","One has to go to Kanaighat Upazilla Sadar first to reach Lovachora. Different routes can be taken to go to Kanaighat from Sylhet. One option would be to use the Sylhet-Jaflong Highway and take a right turn at Dorbosth Bazaar. The one-and-a-half-hour drive itself is an attraction in its own right. On the left are rows of the Jainta hills. Upon reaching Kanaighat Upazilla Sadar, which is on the bank of the Surma, tourists can hire a boat to go to Lovachora.The boat ride from Kanaighat to Lovachora takes an hour and a half."};
	Integer[] img={R.drawable.lova,R.drawable.hotel,R.drawable.bus};
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

