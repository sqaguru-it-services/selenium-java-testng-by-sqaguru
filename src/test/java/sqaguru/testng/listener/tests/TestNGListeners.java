package sqaguru.testng.listener.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

public class TestNGListeners implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		System.out.println("retrying test case details: " + testClass + " " + testMethod);
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		//IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}

	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		// TODO Auto-generated method stub
		//IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}

	public void transform(IDataProviderAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		//IAnnotationTransformer.super.transform(annotation, method);
	}

	public void transform(IFactoryAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		//IAnnotationTransformer.super.transform(annotation, method);
	}

	public void transform(IListenersAnnotation annotation, Class testClass) {
		// TODO Auto-generated method stub
		//IAnnotationTransformer.super.transform(annotation, testClass);
	}

}
