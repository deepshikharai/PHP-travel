package D1;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;



public class Cmp1test {

	public static void main(String[] args) throws Exception {
		//Mvn_plugin sd=new Mvn_plugin();
		/*sd.setUp();
		sd.test();
		sd.tearDown();*/
		JUnitCore junit = new JUnitCore();
		  junit.addListener(new TextListener(System.out));
		  Result result = junit.run(Docker_p.class); // Replace "SampleTest" with the name of your class
		  if (result.getFailureCount() > 0) {
		    System.out.println("Test failed.");
		    System.exit(1);
		  } else {
		    System.out.println("Test finished successfully.");
		    System.exit(0);
		  }
	}
}
