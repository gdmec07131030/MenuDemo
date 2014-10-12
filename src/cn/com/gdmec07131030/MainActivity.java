package cn.com.gdmec07131030;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
    	switch(item.getItemId()){
    	case R.id.item1:tv.setText("你选中了introduce！");break;
    	case R.id.item2:tv.setText("你选中了about us！");break;
    	case R.id.item3:tv.setText("你选中了help！");break;
    	case R.id.action_settings:tv.setText("你选中了刘智毅！");break;
    	}
		return super.onMenuItemSelected(featureId, item);
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
