package tests;

import static specifications.Specification.installSpec;
import static specifications.Specification.requestSpec;
import static specifications.Specification.responseSpec;

import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeTest
	public void setUp() {
        installSpec(requestSpec(), responseSpec());
	}
}
