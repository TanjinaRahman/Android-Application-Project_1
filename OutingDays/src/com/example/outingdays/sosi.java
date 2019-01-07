package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class sosi extends Activity{
ListView lv;
	
	String[] data={"Birishiri :","Where to stay:","How to go:"};
	String[] des={"Shoshi Lodge is located at the center of Mymensingh city which is also known as the Residential Palace of  Moharaja Shoshi Kanto Acharya.This palace is very close to the river Brahmaputra which is being used as Women Teachers Training College from the year 1952.According to the history, most of the rulers from Zamindar family have adopted babies in different era and those adopted child ruled the area later. For example Gourikanta was adopted by Roghunondon. Son of Gourikanta was Shashikantaand his wife adopted Surjokanta as she was childless. Later, Surjokanto became the prominent Zamindar of Mymensingh district. People used to call him as Moharaja.Moharaja Surjokanto Acharya was the Zamindar in Mymensingh region for long 41 years. During the reign of his Zamindari he did so many work for social welfare and made a remarkable change in infrastructural development.He started to build an unique two storied building on an area of nine acre at the end of nineteenth century. Childless Zamindar Surjokanto named after this building in the name of his adopted son Shoshi Kanto Acharya. After completion of construction this building was extensively damaged by a destructive earth quake on the year 1897. Zamindar Surjokanto was immensely worried at this great loss.Later Zamindar Shoshi Kanto Acharya re-built this building with many additional features in the year 1905 and did more renovation work in 1911. This unique classical architecture and its surrounding will certainly attract a traveler to explore this place recurrently.his Zamindar House is located at the main town. It is near the Boro bazar area. It would be better to ask anyone for the location of Women Teachers Training college .You can easily go there using rickshaw or by walking. This old house is currently using as Women Teachers Training College.","1. Hotel Hera,Address: 36/B S. K. Moharaja Road.Phone: +8801711167880.Internet is absolutely free for the people staying at the hotel.                2. Hotel Amir International,Address:Palika Shopping Centre, 46 Station Rd Mymensingh.Phone: 01711167948               3. Hotel Mustafiz International,Address: 6/B Gangadas Guha Rd, Mymensingh.               4. Nirala Rest House,Address: 67 Chotto Bazar Mymensingh.","Take an auto rikshaw or riksha from mymensingh town & go there.It's very easy."};
	Integer[] img={R.drawable.sosi,R.drawable.hotel,R.drawable.bus};
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
