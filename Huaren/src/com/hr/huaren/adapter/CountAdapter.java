package com.hr.huaren.adapter;

import java.util.ArrayList;

import com.hr.huaren.entity.Person;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;




public class CountAdapter  extends BaseAdapter {
	
	private Context mContext;
	private ArrayList<Person> mList;
	private LayoutInflater mInflater;
	
   protected class ViewHolder{
		TextView mTvName;
		TextView mTvSex;
	}

	public CountAdapter(Context context,ArrayList<Person> list) {
		super();
		// TODO Auto-generated constructor stub
		this.mContext=context;
		this.mList=list;
		mInflater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
