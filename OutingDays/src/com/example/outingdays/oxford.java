package com.example.outingdays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class oxford extends Activity{
ListView lv;
	
	String[] data={"The Oxford Mission Church :","Where to stay:","How to go:"};
	String[] des={"The Oxford Mission Church, one of the most elegant looking churches in Bangladesh, is also a heritage structure of the country. This beautiful red brick church was established in 1903 from the sketch of Sister Edith. It was given a final shape by Father Strong. There are 13 ponds and Oxford Mission School on the compound. The structure is one of architectural brilliance, with many corridors. It has 40 archways that support the roof. A large cross on the main altar continues to impart the blessing of Jesus Christ. The church draws local and foreign visitors, including devoted Christians to pray kneeling before the altar.The Oxford Mission Church, one of the most attractive looking churches in Bangladesh, The Oxford Mission Church is also a heritage structure of the country. This beautiful red brick church was established in 1903.The Oxford Mission Church structured with many corridors. It has 40 archways that support the roof. A large cross on the main altar continues to impart the blessing of Jesus Christ.","1. Hotel Ali International, Sadar Road, Barisal                                                                    2. Hotel Ababil, East Bogura Road, Barisal                                                   3. Hotel Athena Internationa,  Katpotty Road, Barisal                                                     4. Paradise Hotel, Hospital Road, Barisal                                                        5. YMCA Hotel Iswar Bose Road, P.O. Box: 36, Barisal                                                          6. Hotel Nupor Barisal Sadar","This church situated in the town of Barisal beside Bogra Road south of Barisal connected both by air and road from Dhaka, Chittagong and Barisal. Flights are available from Chittagong and Dhaka on United Airways and Regent Airways. Flights tend to be daily during the high season (Oct - Apr) but generally drop back to 3-4 flights per week during the summer and Monsoon (May - Sept).The private bus companies have offices near Hotel Sea Queen on the main road, and also down in the Hotel Motel Zone."};
	Integer[] img={R.drawable.missionchuech,R.drawable.hotel,R.drawable.bus};
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