package es.task.switcher.model.entities;

import com.mobandme.ada.Entity;
import com.mobandme.ada.annotations.Table;
import com.mobandme.ada.annotations.TableField;

@Table(name = "Task")
public class Task extends Entity{

	@TableField(name = "name", datatype = DATATYPE_STRING)
	public String Name = "";

	@TableField(name = "category", datatype = DATATYPE_ENTITY)
	public Category Category = null;
	
}
