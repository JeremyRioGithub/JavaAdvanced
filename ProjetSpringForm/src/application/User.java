package application;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {
	// methode renvoyant URL de view : index.jsp
	// WEB-INF/view/[notreview].jsp
	@RequestMapping("/") // au lancement de mon serveur: /
	public String getMain() {
		return "index"; // on met ce qu'on veut. En réalité, ce return est interpreté comme: WEB-INF/view/index.jsp
	}
	@RequestMapping("/userformresult2")
	public String getUserformresult2(HttpServletRequest request, Model model) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = nom+"."+prenom+"@gmail.com";
		String password = request.getParameter("password");
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(email);
		model.addAttribute("nom", nom);
		model.addAttribute("prenom", prenom);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "userformresult2";
	}
	
}
