package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class paharpur extends Activity{
ListView lv;
	
	String[] data={"Paharpur :","Where to stay:","How to go:"};
	String[] des={"Paharpur is a Buddhist temple was found under ground. The name of the Buddhist Temple is Sompur Bihar . Somapura Mahavihara in Paharpur, Badalgachhi Upazila, Naogaon District, Bangladesh (25°1’51.83″N, 88°58’37.15″E) is among the best known Buddhist viharas in the Indian Subcontinent and is one of the most important archeological sites in the country. It was designated a UNESCO World Heritage Site in 1985","1. Mollika Inn,Naogaon,Phone: +880 741-814414        2.Hotel AbokashBelal's House, Par Naogaon, Naogaon,Phone: +880 1711-58216                       3.Hotel Jamuna,R545,Naogaon","there are several Vehicles at Naogaon like Rickshaw, CNG, buses and auto rickshaws are available from there to go Paharpur."};
	Integer[] img={R.drawable.paharpur,R.drawable.hotel,R.drawable.bus};
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
