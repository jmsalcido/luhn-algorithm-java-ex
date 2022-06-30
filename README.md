# Luhn Algorithm Test
Simple Maven project for testing the Luhn Algorithm.

This is aimed to be used as an interview exercise.

## Instructions to run
Run in your terminal:

```shell
git clone git@github.com:jmsalcido/luhn-algorithm-java-ex.git
cd luhn-algorithm-java-ex
mvn clean install
```

You should see:

```shell
[INFO]
[INFO] Results:
[INFO]
[ERROR] Failures:
[ERROR]   LuhnAlgorithmTest.test__check:29 expected and actual value should be the same ==> expected: <true> but was: <false>
[ERROR]   LuhnAlgorithmTest.test__check:29 expected and actual value should be the same ==> expected: <true> but was: <false>
[INFO]
[ERROR] Tests run: 3, Failures: 2, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.203 s
[INFO] Finished at: 2022-06-30T11:29:30-07:00
[INFO] ------------------------------------------------------------------------
```

Add your code into `dev/test/LuhnAlgorithm.java` and run `mvn clean install` for running your tests.

We should see an output like this one at the end:
```shell
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.299 s
[INFO] Finished at: 2022-06-30T11:31:51-07:00
[INFO] ------------------------------------------------------------------------
```

Or if you want, create a branch and send a PR, tests will run automatically for you.