package es.task.switcher;

import android.content.Context;

import com.mobandme.ada.ObjectContext;
import com.mobandme.ada.ObjectSet;

import es.task.switcher.model.entities.Category;
import es.task.switcher.model.entities.Task;


public class ApplicationDataContext extends ObjectContext {

	public ObjectSet<Task> taskSet;
	public ObjectSet<Category> categorySet;
	
	public ApplicationDataContext(Context pContext) throws Exception {
		super(pContext);
		
		this.taskSet = new ObjectSet<Task>(Task.class, this);
		this.categorySet = new ObjectSet<Category>(Category.class, this);
	}
}
