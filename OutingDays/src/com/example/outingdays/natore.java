package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class natore extends Activity{
ListView lv;
	
	String[] data={"Natore Rajbari :","Where to stay:","How to go:"};
	String[] des={"Locals have different names for this place. Some call it the Natore Rajbari, others call it the Rani Bhabani Palace. This place is also known as Pagla Raja's Palace and Natore Palace. Whatever you want to call it, this Rajbari is one of the most beautiful royal palaces in Bangladesh which used to be the residence and seat of the Rajshahi Raj family of zamindars.The Natore dynasty is regarded as one of the most powerful and unified empires of the 18th century in this region. In 1706, contrarily in 1710, Raja Ramjiban became the first king of the dynasty and he built his Rajbari at Natore on an area of 50.42 acres of land that is enclosed within two rings of moats as a part of the defensive system. He governed up to 1734 AD and died that very year. After his death, his adopted son Raja Ramkanto became the king and got married to Rani Bhabani in 1730. When Ramkanto died, Nawab Alibordi Khan handed over the responsibility of the zamindari to Rani Bhabani who expanded the empire further.The present palace of Natore is situated in the centre of the district on a total area of about 120 acres.","You can stay at Natore at night.You also can stay at Rajshahi.That's totally depends on you.","Buses are avaiable from Rajshahi.you can ride on one of them & you'll reach there within hour at Natore.Then you have to take arikshaw or auto rikshaw to reach there."};
	Integer[] img={R.drawable.natore,R.drawable.hotel,R.drawable.bus};
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
