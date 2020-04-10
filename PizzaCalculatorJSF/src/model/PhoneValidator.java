package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("phoneValidator")
public class PhoneValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		
		String regex ="^[789]\\d{9}$";
		Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(value.toString());
	    
	    if (!matcher.matches()) {
	      FacesMessage msg =
	              new FacesMessage(" Phone validation failed: ",
	              "Please provide phone in this format: start with 7,8,9 followed by 9 digit");
	      msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	    
	      throw new ValidatorException(msg);
	    }
	}

}
