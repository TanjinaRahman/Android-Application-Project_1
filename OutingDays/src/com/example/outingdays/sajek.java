package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class sajek extends Activity{
	ListView lv;
	String[] data={"Sajek Valley:","Where to stay:","How to go:"};
	String[] des={"This is a really beautiful place for those who love nature. Situated at 18000 feet above the sea level this valley boasts a spectacular view of hills, remote tribal villages and “clouds”. Sajek Valley is actually a border town which is separated from India by the river “Sajek”. On the way to Sajek, you will need to get permits from the Army Camps which should not be any problem.","There are two villages names Ruilui and Konglok which are worth visiting. Ruilui is the main tourist area in Sajek and there is a rest house if you want to spend the night. You can spend the night at one of the home’s of the locals too. There are many local bazaars, waterfalls, landmarks which you can enjoy too.","Though Sajek Valley is in Rangamati it is easier to go there from Dighinala, Khagrachhori.You can go to Sajek from Khagrachhori by local jeeps (also known as chander gari; 5000Tk) it can carry 15 persons. Or you can go by CNGs (3000Tk) or Motorcycle (1000Tk) form Dighinala."};
	Integer[] img={R.drawable.sajek1,R.drawable.hotel,R.drawable.bus};
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
