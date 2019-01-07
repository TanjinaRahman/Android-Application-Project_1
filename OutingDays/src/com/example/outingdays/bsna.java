package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class bsna extends Activity{
	ListView lv;
	String[] data={"Bisnakandi :","Where to stay:","How to go:"};
	String[] des={"Bisnakandi is a village situated in Rustompur Union under Guainghat Upazilla. This is where many layers of the Khasi mountain meet at a single point from both sides. Flowing from above is a high fall. Adding to its charm are dark clouds hugging the mountain in the rainy season. And flowing underneath towards Bholaganj is a branch of the Piyain. Along the stream flowing from high up in the mountain come huge boulders that are deposited and mined in Bisnakandi. Much like Jaflong, Bisnakandi is mostly a quarry. Winter is not a suitable time to visit Bisnakandi due to mechanised mining and stone-laden boats and lorries. The absence of such nuisance makes the rainy season the perfect time to visit the beautiful Bisnakandi that coalesces the charms of high mountains, sinuous rivers, graceful falls and dancing clouds.","1. Hotel Star Pacific, start from BDT 4,640 per night	      2. Ramer Dighirpar, Mirzajangal, Sylhet +88 0821 727640-1            3. Nirvana Inn, start from BDT 3,500 per night          4. Hotel Supreme, start from BDT 1,700 per night          5. Hotel Fortune Garden,Bongobir Road, Naiorpul, Sylhet    +88 0821 715590","There is more than one way to go to Bisnakandi. Tourists can use the Sylhet-Guainghat Road via the airport and take a left turn to reach Hadarpar from where a local boat may be hired to arrive at Bisnakandi. Visitors can go to Hadarpar by CNG-run auto-rickshaws, which are available for hire at Amberkhana Point in Sylhet city. An alternative would be to go to Pangthumai first, and then hire a boat near Borhill Fall and ride along the branch of the Piyan which flows west towards Bisnakandi. The boat ride, which takes a little over an hour, on the sinuous river with lush green mountains on both sides is an unforgettable experience."};
	Integer[] img={R.drawable.bsana,R.drawable.hotel,R.drawable.bus};
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

