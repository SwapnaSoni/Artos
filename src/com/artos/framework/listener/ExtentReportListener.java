// Copyright <2018> <Artos>

// Permission is hereby granted, free of charge, to any person obtaining a copy of this software
// and associated documentation files (the "Software"), to deal in the Software without restriction,
// including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
// and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
// INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
// IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
// OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
package com.artos.framework.listener;

import com.artos.framework.Enums.TestStatus;
import com.artos.framework.TestObjectWrapper;
import com.artos.framework.Version;
import com.artos.framework.infra.LogWrapper;
import com.artos.framework.infra.TestContext;
import com.artos.interfaces.TestProgress;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportListener implements TestProgress {

	TestContext context;
	LogWrapper logger;
	ExtentReports extent = null;
	ExtentTest test;

	public ExtentReportListener(TestContext context) {
		this.context = context;
		this.logger = context.getLogger();
	}

	@Override
	public void testSuiteExecutionStarted(String description) {
		extent = logger.getExtent();
		extent.addSystemInfo("Artos Version", new Version().getBuildVersion());
	}

	@Override
	public void testSuiteExecutionFinished(String description) {
		extent.flush();
		extent.close();
	}

	@Override
	public void testExecutionStarted(TestObjectWrapper t) {
		test = extent.startTest(t.getTestClassObject().getName(), t.getTestPlanDescription());
		test.assignAuthor(t.getTestPlanPreparedBy());
	}

	@Override
	public void testExecutionFinished(TestObjectWrapper t) {
		extent.endTest(test);
		test = null;
	}

	@Override
	public void testExecutionSkipped(TestObjectWrapper t) {
		test.log(LogStatus.SKIP, "Skipped Test Case: " + t.getTestClassObject().getName());
	}

	@Override
	public void testExecutionLoopCount(int count) {
	}

	public void testStatusUpdate(TestStatus testStatus, String description) {
		if (null != test) {
			if (TestStatus.FAIL == testStatus) {
				test.log(LogStatus.FAIL, description);
			} else if (TestStatus.KTF == testStatus) {
				test.log(LogStatus.PASS, description);
			} else if (TestStatus.SKIP == testStatus) {
				test.log(LogStatus.SKIP, description);
			} else if (TestStatus.PASS == testStatus) {
				test.log(LogStatus.PASS, description);
			}
		}
	}

	@Override
	public void testResult(TestStatus testStatus, String description) {
		if (null != test) {
			if (TestStatus.FAIL == testStatus) {
				test.log(LogStatus.FAIL, description);
			} else if (TestStatus.KTF == testStatus) {
				test.log(LogStatus.PASS, description);
			} else if (TestStatus.SKIP == testStatus) {
				test.log(LogStatus.SKIP, description);
			} else if (TestStatus.PASS == testStatus) {
				test.log(LogStatus.PASS, description);
			}
		}
	}

	@Override
	public void beforeTestSuiteMethodStarted(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeTestSuiteMethodFinished(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterTestSuiteMethodStarted(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterTestSuiteMethodFinished(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeTestMethodStarted(TestObjectWrapper t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeTestMethodFinished(TestObjectWrapper t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterTestMethodStarted(TestObjectWrapper t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterTestMethodFinished(TestObjectWrapper t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void testSuiteException(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void testException(String description) {
		// TODO Auto-generated method stub

	}
}