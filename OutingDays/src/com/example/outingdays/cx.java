package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class cx extends Activity{
	ListView lv;
	String[] data={"Cox’s Bazar sea beach :","Where to stay:","How to go:"};
	String[] des={"Cox’s Bazar sea beach, the world’s longest natural sandy sea beach with its incredible 120 km length. It is the most visited tourist destination in Bangladesh. Every year millions of foreigner and local people come here to enjoy their holidays. You will enjoy sunrise and sunset view very much in this beach because the sea changes color in those time. Warm shark free water is best for swimming and sunbathing. You will enjoy surfing, jogging, cycling in this beach too. It is always crowded by tourists. Near the beach you will find there are hundreds of shops selling souvenirs and beach accessories to the tourists.Here you will find many Buddhist Temples and tribes, colorful Pagodas and delightful sea-food which make Cox’s bazar so special.","1.Hotel Kollol, Laboni Beach Road, Motel Zone, Cox's Bazar,Cost: 1000Tk - 2500Tk                                   2. Music Eco Resort,Dokkhin Diyar Matha, Saint Martin, Cox's Bazar,Cost: 2500Tk - 5000Tk                                                            3. Ratnodeep Resort ,Saint Martin Island, Cox's Bazar,Cost: 1000Tk - 2500Tk ","You can come to Cox’s Bazar by bus or air. There are several bus service depart from Dhaka to Cox’s Bazar, bus fare is around BDT 650-900 non-A/C and BDT 1200-1600 A/C . The journey is near about 8-10 hours. As well as Bangladesh Biman , United Air , Regent Air,Novo Aair,Us Bangla has domestic flights for Dhaka to Cox’s Bazar."};
	Integer[] img={R.drawable.cx,R.drawable.hotel,R.drawable.bus};
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

