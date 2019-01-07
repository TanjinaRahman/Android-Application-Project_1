package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class guthia extends Activity{
ListView lv;
	
	String[] data={"Guthia Mosque :","Where to stay:","How to go:"};
	String[] des={"The Baitul Aman Jame Masjid Complex, commonly known as Guthia Mosque of Barisal, is a mosque complex of Bangladesh having a land area of 14 acres, comparing to the 8.30 acres land area of the national mosque Baitul Mukarram of the country. The Baitul Aman Jame Masjid Complex consists of a Mosque, a huge Eidgah, a graveyard, three lakes, Madrasa and an orphanage. Established on December 16, 2003, Guthia Mosque is also a tourist spot in Bangladesh.Construction of the mosque complex began in December 16, 2003 under the supervision of SAS Foundation. The complex is a private initiative by Sharfuddin Ahmed, a local politician, and a businessman. The mosque took four years and one month to be completed. The complex was designed by a group of Bangladeshi architect[ The cost of the construction in those times was 200 million BDT. The complex was inaugurated on October 20, 2006, with three great lakes, a mosque, an orphanage, a madrasa, an Eidgah and 58 meters high minaret constructed of white marble.The mosque complex stands on 14 acres. The mosque itself consists of 20 domes. The three lakes surrounding the mosque are situated so that they reflect the whole mosque from different angles. Gardens are placed around the lakes and the mosque. A number of calligraphies of Ayatul Kursi are found around the mosque and the inner part of dome of the mosque also has the Ayatul Kursi carved on it. The inner wall of the mosque has the Surat ar-Rahman written on it. The inner part of the mosque has a capacity of 1,400 people, while the outer has a capacity of 5,000 people. Several thousand people can pray in the Eidgah adjacent to the mosque at a time. The 58 meters high minaret of the mosque is the tallest in the country. A graveyard stands on the south-eastern part of the complex.","Some of the hotels available in Barisal district are as follows:-1. Hotel Paradise Two International.Cell: +88-01717-072686, +88-01724-853590             2. Hotel Grand Plaza.Cell: +88-01711-357318, +88-01917-458088          3. Hotel Athena International.Phone: +88-0431-65109, +88-0431-65233.            4. Hotel Haq International.Cell: +88-01718-587698","The mosque is a bit far from the Barisal town. It is exactly beside the road of Barisal-Swarupkathi. Also, it is a famous place. Everyone knows about this place. It will be better if you take any vehicle for round trip with you. You’ll find some bus for Guthia Mosque from the Dhaka bus stoppage near the town."};
	Integer[] img={R.drawable.guthia,R.drawable.hotel,R.drawable.bus};
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