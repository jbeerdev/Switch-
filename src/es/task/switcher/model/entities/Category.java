package es.task.switcher.model.entities;

import com.mobandme.ada.Entity;
import com.mobandme.ada.annotations.Table;
import com.mobandme.ada.annotations.TableField;

@Table(name = "Category")
public class Category extends Entity{

	@TableField(name = "name", datatype = DATATYPE_STRING, maxLength = 100)
	public String name  = "";
	
}
