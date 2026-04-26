package com.javapepe;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
public class PepeController {  
@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    }     

/*

@Controller
public class BrainController {

	@RequestMapping(value = "/Brain2", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}

	@RequestMapping(value = "/Brain", method = RequestMethod.GET)
	public ModelAndView doOPeration() {
		return new ModelAndView("nombrejsp", "command", "getAttribute()");
	}

	@RequestMapping("/welcome.jsp")
	public ModelAndView hello() {
		System.out.println("Entro por aqui ....");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from LUK **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping("/Alta")
	public ModelAndView hello2() {
		System.out.println("Entro por aqui .... 15");
		String message15 = "Genial";
		return new ModelAndView("salida15", "message15", message15);
	}



    /*

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		UserVO userForm = new UserVO();
		model.put("userForm", userForm);

		return "userForm";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("userForm") UserVO user, ModelMap model) {
		// Otra manera de añadir al modelo
		model.addAttribute("name", user.getName());
		System.out.println("En add...");

		// model.addAttribute("age", employee.getAge());
		// model.addAttribute("empId", employee.getEmpId());
		// model.addAttribute("salary", employee.getSalary());
		return "userDetail";
	}

	@RequestMapping(value = "/delUser", method = RequestMethod.POST)
	public String delEmployee(@ModelAttribute("userForm") UserVO user, ModelMap model) {
		model.addAttribute("name", user.getName());
		System.out.println("En del...");
		// model.addAttribute("age", employee.getAge());
		// model.addAttribute("empId", employee.getEmpId());
		// model.addAttribute("salary", employee.getSalary());
		return "deleteOk";
	}

	@RequestMapping(value = "/modUser", method = RequestMethod.POST)
	public String modEmployee(@ModelAttribute("userForm") UserVO user, ModelMap model) {
		model.addAttribute("name", user.getName());
		System.out.println("En mod...");
		// model.addAttribute("age", employee.getAge());
		// model.addAttribute("empId", employee.getEmpId());
		// model.addAttribute("salary", employee.getSalary());
		return "userDetail";
	}

	// <input type="button"
	// onClick="window.location='<c:url value="/byId/${id}/"/>'"
	// name="serverLogsPage" value="View all logs"/
	@RequestMapping(value = "byId/{id}.do", method = RequestMethod.GET)
	public String showLogs(ModelMap model, @PathVariable String id) {
		System.out.println("--->" + id);
		return "userDetail";
	}

	@RequestMapping(value = "/byId", method = RequestMethod.GET)
	public String byId(ModelMap model, @RequestParam String id, @RequestParam int pos) {
		System.out.println("--->" + id);
		System.out.println("--->" + pos);

		Validation val = (ValidationImpl) Context.getContext().getBean("validation");
		String result = val.getCode(id);
		System.out.println("--->" + result);

		return "userDetail";
	}

	@RequestMapping(value = "/byToXml", method = RequestMethod.GET)
	public String byToXml(HttpServletRequest request, HttpServletResponse response, @RequestParam String id)
			throws ServletException, IOException {

		Validation val = (ValidationImpl) Context.getContext().getBean("validation");

		EmployeeVO emp = new EmployeeVO();
		emp.setFirstName(val.getCode(id));

		request.setAttribute("bean", emp);

		return "xml/userXml";

	}

	@RequestMapping(value = "/byToSerial", method = RequestMethod.GET)
	public String byToSerial(HttpServletRequest request, HttpServletResponse response, @RequestParam String id)
			throws ServletException, IOException {

		Validation val = (ValidationImpl) Context.getContext().getBean("validation");

		EmployeeVO emp = new EmployeeVO();
		emp.setID("15");
		emp.setFirstName(val.getCode(id));

		request.setAttribute("bean", emp);

		return "serial/userSerial";

	}

    */
}  