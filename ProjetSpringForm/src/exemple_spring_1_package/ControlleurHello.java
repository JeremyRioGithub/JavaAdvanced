package exemple_spring_1_package;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlleurHello {
	// methode renvoyant URL de view : index.jsp
	// WEB-INF/view/[notreview].jsp
	@RequestMapping("/") // au lancement de mon serveur: /
	public String getMain() {
		return "index"; // on met ce qu'on veut. En réalité, ce return est interpreté comme: WEB-INF/view/index.jsp
	}
	@RequestMapping("/hello") // à l'appel de la page /hello (le contenu de href), renvoie /WEB-INF/view/hello.jsp
	public String getHello() {
		return "hello"; // ce return est interpreté comme: WEB-INF/view/hello.jsp
	}
	@RequestMapping("/index") //  à l'appel de la page /index (le contenu de href), renvoie /WEB-INF/view/index.jsp
	public String getIndex() {
		return "index"; // ce return est interpreté comme: WEB-INF/view/index.jsp
	}
	
	@RequestMapping("/userform")
	public String getUserform() {
		return "userform";
	}
	
	@RequestMapping("/userform2")
	public String getUserform2() {
		return "userform2";
	}
	
	@RequestMapping("/userresult")
	public String getUserresult() {
		return "userresult";
	}
	
	@RequestMapping("/userresult2")
	public String getUserresult2(HttpServletRequest request, Model model) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = nom+"."+prenom+"@gmail.com";
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(email);
		model.addAttribute("nom", nom);
		model.addAttribute("prenom", prenom);
		model.addAttribute("email", email);
		return "userresult2";
	}
	
	@RequestMapping("/userformresult") // servlet d'application. Recupere les données de la requete Http.
	public String getUserformresult() {
		return "userformresult";
	}
	
	@RequestMapping("/userformresult2")
	public String getUserformresult2(HttpServletRequest request, Model model) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = nom+"."+prenom+"@gmail.com";
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(email);
		model.addAttribute("nom", nom);
		model.addAttribute("prenom", prenom);
		model.addAttribute("email", email);
		return "userformresult2";
	}
	
}
