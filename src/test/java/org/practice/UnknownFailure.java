package org.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
//import org.testng.internal.annotations.IAnnotationTransformer;

public class UnknownFailure implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		if(retryAnalyzer == null) {
			annotation.setRetryAnalyzer(KnownFailure.class);
		}
	}

}
