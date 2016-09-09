package pack1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by vipuljain on 9/7/2016.
 */
public class TestListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("on test method " +  iTestResult.getMethod().getMethodName() + " start" );
    }


    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("on test method " +  iTestResult.getMethod().getMethodName() + " success" );

    }


    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("on test method " +  iTestResult.getMethod().getMethodName() + " failure" );

    }


    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("on test method " +  iTestResult.getMethod().getMethodName() + " skipped" );

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("test failed but within success %" + iTestResult.getMethod().getMethodName());


    }


    public void onStart(ITestContext iTestContext) {
        System.out.println("on start of test " + iTestContext.getName());


    }


    public void onFinish(ITestContext iTestContext) {
        System.out.println("on finish of test " + iTestContext.getName());

    }
}
