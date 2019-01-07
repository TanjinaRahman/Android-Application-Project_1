package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class sundarban extends Activity{
	ListView lv;
	String[] des={"Sundarban is the world’s largest mangrove forest. It is famous for the Royal Bengal Tiger, there are about 400 Royal Bengal Tiger in this forest. You can also find beautiful spotted deer in this forest as well as crocodiles, varieties of birds , monkey and many other wild animals. Sundari tree a type of mangrove that is extensively found here. The main place of Sundarban is Harbaria, Katka, Kachikhali, Hiron point. The main attraction of Sundarbans are wildlife photography including photography of the famous Royal Bengal Tiger. Here you will enjoy wildlife viewing, nature study, meeting fishermen, wood-cutters and honey-collectors as well as peace and tranquility in the wilderness. Every year thousands of locals and foreigners come to Bangladesh to visit this unique mangrove forest and they enjoy its dazzling beauty very much.","A three storey Rest House of Mongla Port Authority is available, where tourists can plan their stay, however prior booking is required. But it is also possible to stay in launch at night.There are also several private hotels and restaurants in Mongla town to stay and have food.","Direct bus service is available between Dhaka and Khulna. It may takes 7-8 hours to reach Khulna. After get reach at Khulna you have to go Mongla, You can get to Mongla by bus within 3 hours. From Mongla you have to hire a small engine boat or launches to get Sundarbans. It take 2-3 hours to get “Harbaria Ecotourism Center”. Usually it takes 6 to 10 hours journey by launch from Mongla to Hiron Point or Katka."};
	String[] data={"Sundarbans :","Where to stay:","How to go:"};

	Integer[] img={R.drawable.ti,R.drawable.hotel,R.drawable.bus};
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