package es.task.switcher;


import com.android.dataframework.DataFramework;

import android.app.Activity;
import android.os.Bundle;

public class DataFrameworkActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			DataFramework.getInstance().open(this, "es.task.switcher");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();
		DataFramework.getInstance().close();
	}



}
