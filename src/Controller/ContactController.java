package Controller;

import com.sun.istack.internal.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 19.1.2017.
 */
@Controller
public class ContactController {

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView showContactPage(){
        return new ModelAndView("Contact/Index");
    }

    @RequestMapping(value = "/submitContactForm", method = RequestMethod.POST)
    public ModelAndView submitContactForm(@RequestParam String personName,
                                          @RequestParam String personEmail,
                                          @RequestParam String personMessage){
        ModelAndView modelAndView = new ModelAndView("Contact/Success");
        modelAndView.addObject("name", personName);
        modelAndView.addObject("email", personEmail);
        modelAndView.addObject("message", personMessage);

        return modelAndView;
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ModelAndView sendGetRequest(@RequestParam(required = false, defaultValue = "No name") String personName,
                                       @RequestParam(required = false, defaultValue = "No Email") String personEmail,
                                       @RequestParam(required = false, defaultValue = "No Text") String personMessage
                                       ){
        ModelAndView modelAndView = new ModelAndView("Contact/Success");
        modelAndView.addObject("name", personName);
        modelAndView.addObject("email", personEmail);
        modelAndView.addObject("message", personMessage);

        return modelAndView;
    }

}
