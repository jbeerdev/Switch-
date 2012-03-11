package es.task.switcher.functionalTest;

import junit.framework.Assert;

import com.jayway.android.robotium.solo.Solo;

import es.task.switcher.Main;
import android.test.ActivityInstrumentationTestCase2;

public class MainScreenTest extends ActivityInstrumentationTestCase2<Main>{

	private Solo solo;

	public MainScreenTest() {
		super("es.task.switcher",Main.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testMenuIsRight() throws Exception {
		Assert.assertTrue(solo.searchText("Switch"));
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}


}
