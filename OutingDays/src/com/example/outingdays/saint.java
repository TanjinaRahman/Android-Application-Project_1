package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class saint extends Activity{
	ListView lv;
	String[] data={"Saint Martin :","Where to stay:","How to go:"};
	String[] des={"Saint Martin is a small but very beautiful coral Island of Bangladesh. The Island is a very quiet, neat and clean place. Every corners of this Island has different look and are very attractive. Here you will find live and dead coral, lots of coconut trees that’s why its local name is Narikel Jinjira. Overnight staying in St. Martins Island is really an exotic feeling where you will feel and listen the sound of Sea. If you are lucky then you can spend the exotic moonlit night at St. Martins Island. The beauty of Full moon in St. Martins Island cannot be expressed, if you are not there at that time. Chera-dwip is a beautiful part of this Island, you can go there by boat. You can walk around the Island in a day. You can enjoy BBQ dinner with fresh marine fish or lobsters here.","1.Hotel Kollol, Laboni Beach Road, Motel Zone, Cox's Bazar,Cost: 1000Tk - 2500Tk                                   2. Music Eco Resort,Dokkhin Diyar Matha, Saint Martin, Cox's Bazar,Cost: 2500Tk - 5000Tk                                                            3. Ratnodeep Resort ,Saint Martin Island, Cox's Bazar,Cost: 1000Tk - 2500Tk ","You can get Saint Martin’s Island by many way. You can come to Teknaf by bus. There are several bus service depart from Dhaka to Teknaf, bus fare is around BDT 850-950 non-A/C and BDT 1500-2200 A/C as of January, 2014. Maximum bus starts at night and the journey is near about 11-12 hours. From Teknaf, mid-level ships run daily and take around 2-3 hours named Kutubdia, Keari Sindbad, Sundarban Service. The fare starts from BDT 450 to BDT 2500 as of January, 2014. All the ships and cruises starts journey from Teknaf to Saint Martin around 9AM – 9.30AM and return journey starts from Saint Martin to around 3PM – 3.30PM. During the off-season (May-September) these ships are not provide services because of bad weather. The peak-season is October-April. Distance from Dhaka to the island is 510 km."};
	Integer[] img={R.drawable.saint,R.drawable.hotel,R.drawable.bus};
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
