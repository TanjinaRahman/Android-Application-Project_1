package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class mahasthan extends Activity{
ListView lv;
	
	String[] data={"Mahasthangarh :","Where to stay:","How to go:"};
	String[] des={"It is called the “oldest known city” of Bangladesh. Each of its bricks represents the history of ancient and medieval Bengal.After a four-hour journey from Dhaka, we reached Bogra at 11:00am earlier this month. The city is not as tranquil and sleepy as Dinajpur. Busy rickshaws, human haulers and four-stroke taxis will remind you of bustling Dhaka. We hired a three-wheeler loc named Tomtom to go to our destination -- Mahasthangarh.In its golden years, Mahasthangarh was once known as Pundravardhana. From the archeological artifacts it is confirmed that the site was one of the most important cities of Mauryan, Gupta, Pala and later Hindu period.The word Mahasthangarh stands for excellent sanctity and fort. Near about 1.5km long citadel walls that fortified heart of the ancient city contains several mounds and structural vestiges. Of these a few of notable structures inside the fort are: Jiat Kunda (well which, according to legends, has life giving power), Mankalir Dhap (place consecrated to Mankali), Parasuramer Basgriha (palace of a king named Parasuram), Bairagir Bhita (palace of a female anchorite), and Khodar Pathar Bhita (place of stone bestowed by God).","Hotels are available here to stay.Such as Hotel Akbaria,Phone: 01716-179982                                           Hotel Naaz Garden,Phone: 88-051- 62468, 66655","You can go to Mohasthanagar from Bogra town, 10 km away.You can hire a rikshaw or auto rikshaw to go there. Don’t forget to visit Mohasthangar museum while visiting Mohasthangar. Mohasthan Buddhist Stambho is another attraction for the tourists; it is locally called as Behula’s Basar."};
	Integer[] img={R.drawable.maha,R.drawable.hotel,R.drawable.bus};
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
