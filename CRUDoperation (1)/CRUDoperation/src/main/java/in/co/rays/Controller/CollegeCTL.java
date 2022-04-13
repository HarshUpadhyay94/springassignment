package in.co.rays.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import in.co.rays.DAO.CollegeDao;
import in.co.rays.DTO.CollegeDTO;

@Controller
public class CollegeCTL {

	@Autowired
	private CollegeDao collegeDao;

	@RequestMapping(value = "/")
	public String home(@ModelAttribute("dto") CollegeDTO dto, Model m) {
		List<CollegeDTO> list = collegeDao.getAllCollege(dto);
		m.addAttribute("listData", list);
		System.out.println(1231212);
		System.out.println(list);
		return "index";
	}

	@RequestMapping(value = "/add-college")
	public String addCollege(Model m) {
		m.addAttribute("title", "Add College");
		return "add_college";
	}

	// handle form
	@RequestMapping(value = "/handle-AddCollege", method = RequestMethod.POST)
	public String handleAddCollege(@ModelAttribute CollegeDTO college, HttpServletRequest request) {
		System.out.println(college);

		collegeDao.addCollege(college);
		/*
		 * RedirectView redirectView = new RedirectView();
		 * redirectView.setUrl(request.getContextPath()+ "/"); return redirectView;
		 */

		return "CollegeView";
	}

	/*
	 * @RequestMapping(value = "/handle-UpdateCollege", method = RequestMethod.POST)
	 * public String handleUpdateCollege(Model m) {
	 * 
	 * 
	 * return "CollegeView"; }
	 */

}
