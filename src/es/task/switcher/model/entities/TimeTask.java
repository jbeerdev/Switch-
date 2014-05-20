package es.task.switcher.model.entities;

import java.util.Date;

import com.mobandme.ada.Entity;
import com.mobandme.ada.annotations.Table;
import com.mobandme.ada.annotations.TableField;

@Table(name = "TimeTask")
public class TimeTask extends Entity{

	@TableField(name = "time_spent", datatype = DATATYPE_LONG)
	public long timeSpent  = 0;
	
	@TableField(name = "date", datatype = DATATYPE_DATE_BINARY)
	public Date date  = new Date();
	
	@TableField(name = "task", datatype = DATATYPE_ENTITY)
	public Task task = null;
	
}
