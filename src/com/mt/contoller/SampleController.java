package com.mt.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SampleController {
	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	@ResponseBody
	String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException {
		JSONObject js = new JSONObject();
		js.put("Name", "Mithun Reddy");
		js.put("Calling Name", "Munna");
		js.put("DOB", "08-Nov-2011");
		js.put("Hobbies", "Drawing, Dancing");
		js.put("Places he like", "His native place");

		return js.toString();

	}
}
