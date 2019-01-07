package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class kantatmp extends Activity{
ListView lv;
	
	String[] data={"Kantajew Temple :","Where to stay:","How to go:"};
	String[] des={"Kantajew Temple is the most ornate and beautiful temple of Bangladesh. It is treated as one of the finest masterpieces of medieval architecture of Bengal made by red burn mud. Every inch of the temple surface is embellished with exquisite ‘Terracotta’ plaques, representing flora fauna, geometric motifs, mythological scenes and an astonishing array of contemporary social scenes and favorite pastimes. These artistic creation must attract the visitors. It is a Holy place, generally people come here to pray and see the ancient heritage architecture.","1. New Hotel.Station Rd, Dinajpur 5200, Bangladesh.Phone: +880 1774-622368           2. Hotel Mrigaya,Chalkbazar Rd, Dinajpur 5200, Bangladesh.Phone: +880 1756-63555             3. Concord Hotel,Station Rd, Dinajpur, Bangladesh.Phone: +880 1738-59346","Can hire microbus or auto rickshaw for family tour from Dinajpur town to Kantajew temple and it will take about 45 minutes."};
	Integer[] img={R.drawable.kantajew,R.drawable.hotel,R.drawable.bus};
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
