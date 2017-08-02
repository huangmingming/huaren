package com.hr.huarenlib.activity;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initVariables();
		initView(savedInstanceState);
		loadData();
	}
	
	//初始化变量
	protected abstract void  initVariables();
	//初始视图
	protected abstract void  initView(Bundle saveInstanceState);
	//加载数据
	protected abstract void loadData();
}
