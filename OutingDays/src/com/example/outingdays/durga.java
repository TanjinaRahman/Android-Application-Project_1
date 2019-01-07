package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class durga extends Activity{
ListView lv;
	
	String[] data={"Durga Sagar :","Where to stay:","How to go:"};
	String[] des={"Durga Sagar, known locally as Madhabpasha Dighi, is the biggest pond in southern Bangladesh. It has a total area of about 2500 hectares. The lake is about 11 kilometres (6.8 mi) away from Barisal city. Rani Durgabati, mother of Raja Joy Narayan, had the pond excavated in 1780. There is a small island in the middle of the lake.","1. Hotel Ali International, Sadar Road, Barisal                                                                    2. Hotel Ababil, East Bogura Road, Barisal                                                   3. Hotel Athena Internationa,  Katpotty Road, Barisal                                                     4. Paradise Hotel, Hospital Road, Barisal                                                        5. YMCA Hotel Iswar Bose Road, P.O. Box: 36, Barisal                                                          6. Hotel Nupor Barisal Sadar","It is located at Madhabpasa village of Babuganj Upazila, about 11 kilometres (6.8 mi) away from Barisal town. Tourists can go there by road, including by bus, from Barisal City."};
	Integer[] img={R.drawable.durga,R.drawable.hotel,R.drawable.bus};
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