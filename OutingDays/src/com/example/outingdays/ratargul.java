package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ratargul extends Activity{
	ListView lv;
	String[] data={"Ratargul :","Where to stay:","How to go:"};
	String[] des={"Ratargul is the only freshwater swamp forest in Bangladesh. Despite its existence over a vast stretch of swampland in the not too distant past, the swamp forest now occupies an area of only two square kilometres. A dense forest comprising mostly native hijol and koroch trees, Ratargul offers a sanctuary for different species of birds, monkeys, snakes and other reptiles. atargul is in close proximity of three rivers. Flowing respectively from the south and the east, the Chenger Khal and the Kafna meet near Ratargul and head north towards Guainghat under the nomenclature Guain. Once upon a time, the swamp forest occupied the banks of all these rivers. The water of these rivers makes its way into the forest and leaves it marooned under 15 to 20 feet water in the rainy season. With the bottom half of the dense forest covered under water and the top half visible with its multitudes of shades falling on crystal-clear water underneath, Ratargul makes for a sight that can soothe even the most uninterested of eyes.The best time to visit Ratargul Swamp Forest is early in the morning or early in the evening in the rainy season. That’s when one would be enthralled by the existence of the local fauna including different species of birds and monkeys. As the water recedes with the departure of the rainy season it becomes muddy. And in winter it is possible to roam about the forest on foot.","1. Hotel Star Pacific, start from BDT 4,640 per night	      2. Ramer Dighirpar, Mirzajangal, Sylhet +88 0821 727640-1            3. Nirvana Inn, start from BDT 3,500 per night          4. Hotel Supreme, start from BDT 1,700 per night          5. Hotel Fortune Garden,Bongobir Road, Naiorpul, Sylhet    +88 0821 715590","Though Ratargul is situated in Guainghat Upazilla, it is not too far away from Sylhet city. Driving on the Airport Road , one reaches Dhupagul point on the Sylhet-Companigonj Highway, from where s/he should take the Dhupagul-Horipur Road and drive a short distance to Motorghat, from where visitors can enter the swamp forest on small boats. Rather than stopping at Motorghat, tourists can also move a little further ahead and reach Ramnagar Bazaar. A right turn from the Bazaar leads to the Ratargul village, where tourists can hire a boat to visit the forest. The simplicity and hospitability of the villagers are sure to fascinate an average tourist. On the way back, it is a good idea to travel through Horipur on the Sylhet-Jaflong Highway rather than going back to Dhupagul.From Ratarghul Village local boats may charge Taka 1000-1500 for a ride inside the forest."};
	Integer[] img={R.drawable.ratargul,R.drawable.hotel,R.drawable.bus};
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

