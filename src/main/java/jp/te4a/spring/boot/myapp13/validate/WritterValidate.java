package jp.te4a.spring.boot.myapp13.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class WritterValidate implements ConstraintValidator<WritterValid,String>{

    String ok;
    @Override
    public void initialize(WritterValid nv){
        ok = nv.ok(); 
    }
    @Override
    public boolean isValid(String in,ConstraintValidatorContext cxt){
        if( in == null ){
            return false;
        }
        return in.equals(ok);
    }
}