package com.example.outingdays;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom extends ArrayAdapter<String>{
private String[] data;
private String[] des;
private Integer[] img;
private Activity context;
	public custom(Activity context, String[] data,Integer[] img,String[] des) {
		super(context,R.layout.item,data);

this.context=context;
this.data=data;
this.img=img;
this.des=des;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
	View r=convertView;
	ViewHolder viewHolder=null;
	if(r==null){
		LayoutInflater layoutInflater=context.getLayoutInflater();
		r=layoutInflater.inflate(R.layout.item, null,true);
		viewHolder=new ViewHolder(r);
		r.setTag(viewHolder);
	}
	else{
		viewHolder=(ViewHolder)r.getTag();
	}
	viewHolder.tv1.setText(data[position]);
	viewHolder.tv2.setText(des[position]);
	viewHolder.im.setImageResource(img[position]);
	
		return r;
	}
	class ViewHolder{
		TextView tv1;
		TextView tv2;
		ImageView im;
		ViewHolder(View v){
			tv1=(TextView)v.findViewById(R.id.textView1);
			tv2=(TextView)v.findViewById(R.id.textView2);
			im=(ImageView)v.findViewById(R.id.imageView1);
			
		}
	}

}
