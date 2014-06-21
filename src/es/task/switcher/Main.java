package es.task.switcher;


import android.app.Activity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class Main extends Activity implements OnMenuItemClickListener {
    /** Called when the activity is first created. */
   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	
	public void showPopup(View v) {
	    PopupMenu popup = new PopupMenu(this, v);
	    MenuInflater inflater = popup.getMenuInflater();
	    popup.setOnMenuItemClickListener(this);

	    inflater.inflate(R.menu.main_menu, popup.getMenu());
	    popup.show();
	}
	


	@Override
	public boolean onMenuItemClick(MenuItem item) {
		  switch (item.getItemId()) {
	        case R.id.menu_archive:
	            
	            return true;
	        case R.id.menu_delete:
	           
	            return true;
	        default:
	            return false;
	    }
	}
}