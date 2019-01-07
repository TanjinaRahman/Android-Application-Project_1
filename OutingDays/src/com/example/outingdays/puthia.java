package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class puthia extends Activity{
ListView lv;
	
	String[] data={"The royal palace of Puthia :","Where to stay:","How to go:"};
	String[] des={"The royal palace of Puthia, a small town near Rajshahi district, is one of the most popular archaeological sites of Bangladesh. For its grandeur and rich history full of myths and legends, this palace of a Mughal era zamindar dynasty attracts a lot of tourists, history enthusiasts and researchers. However, besides the royal palace, the palace precinct holds some of the greatest historical and architectural resources of our country. This is the temple complex of Puthia which includes fourteen ancient Hindu temples of different architectural styles erected by the lords of this palace in different times of their rule over the north-western part of Bangladesh that spans more than three centuries.","You can stay at Rajshahi.There are many hotels like Hotel Nice,Hitel Chillis ad so on.","Buses are avaiable here.You can reach there within 40 minutes from Rajshahi."};
	Integer[] img={R.drawable.puthia,R.drawable.hotel,R.drawable.bus};
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
