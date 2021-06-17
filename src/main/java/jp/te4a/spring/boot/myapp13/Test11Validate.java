package jp.te4a.spring.boot.myapp13;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class Test11Validate implements ConstraintValidator<Test11Valid,String>{
	String param;
	@Override
	public void initialize(Test11Valid nv){ param =  nv.param(); }
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);
	}
}
