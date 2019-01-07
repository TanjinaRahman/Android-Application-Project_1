package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class nafa extends Activity{
	ListView lv;
	String[] data={"Nafakhum Waterfalls :","Where to stay:","How to go:"};
	String[] des={"In terms of amount of water falling, it is the largest waterfall of Bangladesh. It is connected with Sangu River in a place called Remakri of Thanchi Upazilla.  This place was discovered by the tourists very recently.Once at Thanchi, you will need to register your name at the local army camp and hire a mandatory travel guide. A guide will cost 600Tk for the first day and 500Tk more for each additional day ","You can have your lunch at Remakri (upstream) and prepare to spend the night at this place. Some locals will let you stay at their place for just 80-100Tk – which will be a great experience for sure.","To reach Nafakhum, after coming to Bandarban you will need to go to Thanchi (79 Km from Bandarban) first by bus. It can take around 4 hours.After all the preparations are made, you will need to hire an engine boat (4000-5000Tk) which will cover the Thanchi-Remakri-Thanchi route via Sangu river. It will take 4 hours to reach Remakri (upstream) and 2 hours to get back from Remakri (downstream).In the morning, ar around 5 am start your 2 hour hiking towards Nafakhum. I know that it takes a while to reach Nafakhum, but it is worth it. And the journey is spectacular in its own self."};
	
	Integer[] img={R.drawable.nafa,R.drawable.hotel,R.drawable.bus};
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
