/*******************************************************************************
 * Copyright (C) 2018-2019 Arpit Shah and Artos Contributors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.artos.framework.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.artos.framework.infra.BDDFeatureObjectWrapper;

public class TestSuite {

	private String suiteName = "SuiteName";
	private int loopCount = 1; // default 1
	private List<String> testGroupList = new ArrayList<>();
	
	private List<String> testBeforeUnitGroupList = new ArrayList<>();
	private List<String> testAfterUnitGroupList = new ArrayList<>();
	private List<String> testUnitGroupList = new ArrayList<>();
	private List<String> testFQCNList = new ArrayList<>();
	private Map<String, String> testSuiteParameters = new HashMap<>();
	private String threadName = "ThreadN";
	private String version = "1";
	private boolean enable = true;
	private boolean testScriptProvided = false;
	private List<BDDFeatureObjectWrapper> featureFiles = new ArrayList<>();

	// *****************************************************************
	// Getters and setters
	// *****************************************************************
	public List<String> getTestFQCNList() {
		return testFQCNList;
	}

	public void setTestFQCNList(List<String> testFQCNList) {
		this.testFQCNList = testFQCNList;
	}

	public Map<String, String> getTestSuiteParameters() {
		return testSuiteParameters;
	}

	public void setTestSuiteParameters(Map<String, String> testSuiteParameters) {
		this.testSuiteParameters = testSuiteParameters;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public String getSuiteName() {
		return suiteName;
	}

	public void setSuiteName(String suiteName) {
		this.suiteName = suiteName;
	}

	public int getLoopCount() {
		return loopCount;
	}

	public void setLoopCount(int loopCount) {
		this.loopCount = loopCount;
	}

	public List<String> getTestGroupList() {
		return testGroupList;
	}

	public void setTestGroupList(List<String> testGroupList) {
		this.testGroupList = testGroupList;
	}

	public List<String> getTestBeforeUnitGroupList() {
		return testBeforeUnitGroupList;
	}

	public void setTestBeforeUnitGroupList(List<String> testBeforeUnitGroupList) {
		this.testBeforeUnitGroupList = testBeforeUnitGroupList;
	}
	
	public List<String> getTestAfterUnitGroupList() {
		return testAfterUnitGroupList;
	}

	public void setTestAfterUnitGroupList(List<String> testAfterUnitGroupList) {
		this.testAfterUnitGroupList = testAfterUnitGroupList;
	}
	
	public List<String> getTestUnitGroupList() {
		return testUnitGroupList;
	}

	public void setTestUnitGroupList(List<String> testUnitGroupList) {
		this.testUnitGroupList = testUnitGroupList;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public boolean isTestScriptProvided() {
		return testScriptProvided;
	}

	public void setTestScriptProvided(boolean testScriptProvided) {
		this.testScriptProvided = testScriptProvided;
	}

	public List<BDDFeatureObjectWrapper> getFeatureFiles() {
		return featureFiles;
	}

	public void setFeatureFiles(List<BDDFeatureObjectWrapper> featureFiles) {
		this.featureFiles = featureFiles;
	}

}
