package spicejet;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import resources.base;

import java.io.IOException;

public class TestListener implements ITestListener {

    base screan = new base();

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult result ) {

        try {
            screan.getScreanshot(result.getName());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
