package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class museum extends Activity{
ListView lv;
	
	String[] data={"National Museum :","Where to stay:","How to go:"};
	String[] des={"National museum is the biggest museum in Bangladesh and one of the largest museums in South Asia. It has several departments like archaeology, classical, decorative and contemporary art, history, natural history, ethnography and world civilization of displays. It has a rich collection of paintings, old coins, metal images, world famous embroidered quilts (Nakshi kantha) and much more. You can also find valuable articles of the heroic liberation war here. The Museum is noted for its collection of Shilpacharya Zainul Abedin and works of other contemporary artists. The massive four storey building has not only a large exhibition halls, but also conservatory laboratory, library, three auditoriums, photographic gallery, temporary exhibition hall and an audio-visual division.Location : Shahbagh, Dhaka.","Threre are a lot of hotels in Dhaka city.You can stay there.But be careful to choose a hotel.","It is located at Shahbagh and from any part of Dhaka city visitor can reach here by local transport services."};
	Integer[] img={R.drawable.mu,R.drawable.hotel,R.drawable.bus};
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
