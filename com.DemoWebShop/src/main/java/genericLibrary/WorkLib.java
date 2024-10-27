
package genericLibrary;

import java.util.Random;

public class WorkLib {

	public static int getRandomNo() {
		Random r = new Random();
		return r.nextInt(1000);
	}

}
