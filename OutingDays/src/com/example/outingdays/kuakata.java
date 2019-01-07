package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class kuakata extends Activity{
ListView lv;
	
	String[] data={"Kuakata :","Where to stay:","How to go:"};
	String[] des={"Kuakata (Sagar Kannya / Daughter of the Sea) sea beach is a white sandy beach. It is about 18 km long and 3.5km wide. It is one of the rarest places to see the full view of both sunrise and sunset from the same place or same position. This beach is surrounded by green trees and beside the beach there are many garden forest, like The Foyej Miyar Coconut Garden, Lembur Chor, Jhau bon, Gangamotir Chor etc. These gardens and forests are the most attracting part for the tourist. There are no quick sands in the beach. So you can frequently run, take bath, swim, and pick up cockle from the beach. There are two rivers, named Payra and Bishkhali are West of the beach and river named Agunmukha is East of the beach. It has also some wanderings sites like the Rakhain Polly, Shima Buddhu Bihar, Fatrar Chor,Rash Mela, Shutki Polli that are enjoyable for the tourist.","Hotels are available here.So,you can select one of them easily and stay there at night.","From Patuakhali you can reach Kuakata by bus or you can hire a motor cycle.You have to cross three ferry to reach the spot. Then you can hire a boat costing BDT 1000 to 1200 to visit all the sites of Kuakata."};
	Integer[] img={R.drawable.kuakata,R.drawable.hotel,R.drawable.bus};
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
