package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class tajhat extends Activity{
ListView lv;
	
	String[] data={"Tajhat Palace :","Where to stay:","How to go:"};
	String[] des={"The flamboyant and delightfully maintained Tajhat Palace is arguably one of the finest rajbaris in Bangladesh. The palace was constructed in the 19th century by Manna Lal Ray, a Hindu trader who was forced to emigrate from Punjab and found his way to Rangpur. He eventually became a successful jeweller, acquired a lot of land, subsequently won the title of raja (landlord or ruler) and built this huge mansion. Local villagers believe there is treasure hidden in its walls.Structurally, the palace is similar to Dhaka’s Ahsan Manzil (Pink Palace), and has a frontage of about 80m. The main building is crowned by a ribbed conical dome, and features an imposing central staircase made of imported white marble. The balustrade originally featured marble sculptures of classical Roman figures, but these have long since disappeared. During the regime of General Ershad (1982–91), the mansion was used as the divisional High Court, but today it houses a small museum stuffed with old manuscripts and bits and bobs excavated from the archaeological sites of Paharpur and Mahasthangarh.","1. Hotel North View,Central Rd, Rangpur, Bangladesh.            2. Grand Dhaka Hotel,Chaul amod Road, Rangpur, Bangladesh.Phone: +880 521-5506               3. Rayan's Hotel,Lal Kuthi Road, Rangpur, Bangladesh.Phone: +880 1720-43770","A rickshaw from the town centre to the palace costs around Tk 70."};
	Integer[] img={R.drawable.tajhat,R.drawable.hotel,R.drawable.bus};
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
