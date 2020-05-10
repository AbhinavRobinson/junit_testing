package junit_testing_package;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testaddnumber.class,testaddstrings.class})
public class AllTests {}
