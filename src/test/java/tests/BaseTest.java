package tests;

import org.testng.annotations.BeforeTest;

import specifications.Specification;

public class BaseTest {

	@BeforeTest
	public void setUp() {
        Specification spec = new Specification();
        spec.installSpec();
	}
}
