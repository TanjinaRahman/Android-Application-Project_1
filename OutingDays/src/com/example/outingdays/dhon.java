package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class dhon extends Activity{
ListView lv;
	
	String[] data={"Dhanbari Nawab Manzil :","Where to stay:","How to go:"};
	String[] des={"Dhanbari Nawab Manzil is locally known as Nawab Bari. This is now owned by the descendants of Nawab Ali Chowdhury. They have been taking a good care of this palace and also built several cottages inside the premise for the tourists for staying. This is the only heritage resort from our Bangladesh. This is also known as Dhanbari Royal Resort. Inside the premise is very much neat and clean, adequate amount of stuffs and guards are around there to take care of everything.Most of the Zamindar mansions from Bangladesh were owned by the Hindu Zamindar. After the division of the country during 1947, and also later 1971, most of those powerful owners were coerced to leave the country, or cringed away to avoid the secular vandalism. Which results their mammoth mansions left unprotected. Later government has taken control of few of those buildings and used as their official purpose (which are still in a presentable state). But others are in total ruin by now a days for lack of care.But this Nawab Palace is totally different from those. As it was owned by the Muslim landlords, they didn’t have to leave the country or had nothing to fear. They were powerful during their ruling period. And yet still they are powerful on that region now a days. That’s why this palace is still in a very good condition and has been taken proper care to maintain its state.This palace was built by the Nawab Ali Chowdhury during 1919 to invite the British Lord Ronaldshay. He Came near Koyra  using the Steamer and had a reception with 30 elephants. [Reference: www.dctangail.gov.bd].One of the decedents from the Nawab Family named Nawab Hasan Ali Chowdhury was the Industrial Minister during the reign of East Pakistan. Also he was a member of the Parliament during 1978. Later, after his death, his daughter Saiyeda Asheka Akbar was the member of the Parliament during 1981. This information will give you an idea about their power and now you understand why the palace is still in a good condition.You’ll require to buy a ticket for 30 Taka to enter inside the palace premise. Each ticket is valid for 2 hours of visiting. The area is highly secured and the stuffs and guards around there are very much friendly. No unauthorized entries are entertained there. So no one will bother you while you are enjoying the surroundings.","There are some hotels in dhonbari.You can stay there.If you want,you can stay at Tangail or Jamalpur town also.","Best way to go there using the private vehicles. Cause the available bus service is not that much handy. The service of that Bus is very poor. Using your private vehicle it will require around 4-4.5 hours to reach there.If you want to use public transport, then Binimoy Bus Service is the option. This will start from Dhaka-Mohakhali Bus Terminal and stops exactly at the Dhanbari, beside the palace. Since this is a very much local service and has hundreds of stoppage, it will take around 6-7 hours to reach near there (or even more). For your information, that bus takes people standing inside, like the local bus of Dhaka."};
	Integer[] img={R.drawable.dhonabri,R.drawable.hotel,R.drawable.bus};
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