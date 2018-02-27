package com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.process.TestIncorrectInputProcessor;
import com.process.TestInputReaderProcessot;
import com.process.TestOutputProcessor;

@RunWith(Suite.class)
@SuiteClasses({ TestIncorrectInputProcessor.class, TestInputReaderProcessot.class, TestOutputProcessor.class })
public class AllTestSuite {

}
