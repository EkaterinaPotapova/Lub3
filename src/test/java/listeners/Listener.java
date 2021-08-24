package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Listener for Tests.
 */
public class Listener implements ITestListener {

    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("----------FINISH ALL----------------");
    }

    @Override
    public void onStart(ITestContext arg0) {
        System.out.println("----------Start ALL----------------");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
    }

    @Override
    public void onTestFailure(ITestResult res) {
        System.out.println(res.getMethod().getMethodName() + " FAILURE !!! ");
    }

    @Override
    public void onTestSkipped(ITestResult res) {
        System.out.println(res.getMethod().getMethodName() + " SKIPPED !!! ");
    }

    @Override
    public void onTestStart(ITestResult res) {
        System.out.println("Start test " + res.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult res) {
        System.out.println(res.getMethod().getMethodName() + " PASSED !!!  ");
    }
}
