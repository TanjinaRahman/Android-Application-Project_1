package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class pan extends Activity{
	ListView lv;
	String[] data={"Panthumai :","Where to stay:","How to go:"};
	String[] des={"Panthumai – a village from West Jaflong Union under Guainghat Upazilla – is another tourism hub in Sylhet. The village, which is very near to the east Khasia hill of the Meghalaya ranges, boasts of an eye-catching fall popularly known as Borhill Fall. Though the main fall is geographically located in the Indian territory, people can enjoy its enormous splendour head-on. Flowing from the Borhill Fall is a branch of the river Piyain that heads west and leads to Bisnakandi, another major tourist spot. In addition to the splendid fall, the Guainghat-Pangthumai Road itself is a sight for the sore eye. As one heads east, the enormous mountain ranges appear to come closer and turn from blue to green gradually. And the clouds and the falls playing hide and seek are sure to fill one with awe. The best possible time to visit Pangthumai is between April and mid-October. ","1. Hotel Star Pacific, start from BDT 4,640 per night	      2. Ramer Dighirpar, Mirzajangal, Sylhet +88 0821 727640-1            3. Nirvana Inn, start from BDT 3,500 per night          4. Hotel Supreme, start from BDT 1,700 per night          5. Hotel Fortune Garden,Bongobir Road, Naiorpul, Sylhet    +88 0821 715590","To visit Panthumai, one should go to Guainghat Upazilla Sadar. From Sylhet city s/he is to take the Sylhet-Tamabil Highway and travel about 42 km to reach Sarighat, where s/he has to take a left turn and travel about 16 km to reach Guainghat Point, where the road diverges. The right road leads to Upazilla Sadar while the left to Sylhet Airport. Just a kilometre of journey on the left road takes one to Guainghat College. A further 12-km journey on the eastward narrow alley beside the College leads one to the Pagthumai village. On the way to the village is a marketplace popularly known as Maturtol Bazaar. After reaching at Pangthumai village one should step out of the vehicle and walk on the left for a short while, and s/he would be in for a big surprise. A breathtaking waterfall is all set to welcome him/her with its dazzling beauty.Tourists can visit Lalakhal and Pangthumai on the same day if they want, due to the proximity of these places. Starting early on, they can travel to Lalakhal by car or bus and then take a boat to the Zero Point, roam about Lalakhal Tea Garden, and finally have lunch at the River Queen restaurant before setting off to Pangthumai. The drive should take no more than an hour and a half, leaving one with the entire afternoon to spend in the fall before embarking on a two-hour drive to return to the city.To visit Lalakhal and Pangthumai a microbus can be rented for 5500-7500 BDT depending on its size and make, although it will cost a bit more at weekends."};
	Integer[] img={R.drawable.panthumai,R.drawable.hotel,R.drawable.bus};
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

