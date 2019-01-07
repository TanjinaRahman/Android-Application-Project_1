package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class biri extends Activity{
ListView lv;
	
	String[] data={"Birishiri :","Where to stay:","How to go:"};
	String[] des={"The hill of china clay, a pond of clear blue water in the middle of it, the hill of Garo where the 'Garo'( a tribal community of bangladesh) lives, the zero point (border of india-bangladesh), old templesand Jaminder houses. Shomesshori river, Kongso river, Border, Guccho gram (garo polli), china mati mine, Tevaga biplob monument (Tunka bidroho), susong moharaj’s palace, catholic church, grave yrd. garo pahar.","YMCA is the betr place. but there are some guest house as well.","From Dhaka u can go upto Jaira Bazar direct bus (Zinnat poribohon is betr). or can go to netrokona -shayam ganj then by bike upto Jaria bajar. then by boat Shukna kori, then u can go to birishiri by bike, by tempoo or rikshaw or bus."};
	Integer[] img={R.drawable.birisiri,R.drawable.hotel,R.drawable.bus};
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
