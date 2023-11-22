package org.uni;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class Runnerclass {

	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(Aclass.class, Sample.class, Bclass.class);

		System.out.println("Total test case run count:" + rc.getRunCount());
		System.out.println("Total test case run time:" + rc.getRunTime());
		System.out.println("Total test case failed count:" + rc.getFailureCount());
		System.out.println("Ignores test cases count:" + rc.getIgnoreCount());

		List<Failure> f = rc.getFailures();

		for (Failure fails : f) {

			System.out.println(fails);
		}

	}

}
