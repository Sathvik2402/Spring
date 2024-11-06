package com.nt.validator;

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.entity.Form;


@Component
public class FieldsValidator implements Validator{
@Override
public boolean supports(Class<?> clazz) {
	// TODO Auto-generated method stub
	return clazz.isAssignableFrom(Form.class);

}
@Override
	public void validate(Object target, Errors errors) {
	//type casting
	Form form=(Form)target;
	//server side form validation
	if(form.getZcode()==null || form.getZcode().length()==0 || form.getZcode().equalsIgnoreCase("")) {
		errors.rejectValue("zcode", "zcode.check");
//	if(errors.hasErrors())
//		errors.rejectValue("zcode", "zcode.check");
	}
	
}
}
