package fr.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.entity.Cocktail;
import fr.formation.service.CocktailService;

@Controller
@RequestMapping("/cocktails")
public class CocktailController {

	@Autowired

	private CocktailService service;

	@RequestMapping("/add")
	public ModelAndView add() {
		final ModelAndView mav = new ModelAndView();
		// veut dre que la jsp portera ce nom cocktail
		mav.setViewName("addCocktails");
		return mav;

	}

	// @RequestMapping(value = "/add", method = RequestMethod.POST)
	// public String newCocktail(final HttpServletRequest request)
	//
	// {
	// final String name = request.getParameter("name");
	// final Integer state = Integer.parseInt(request.getParameter("state"));
	// this.service.create(new Cocktail(name, price, withalcohol));
	// return "redirect:/cocktails/add.html";
	//
	// }

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String newCocktail(@RequestParam final String name, @RequestParam final Double price,
			@RequestParam final Integer withalcohol)

	{

		this.service.create(new Cocktail(name, price, withalcohol));
		return "redirect:/cocktails/add.html";

	}

	@RequestMapping
	public ModelAndView list() {
		final ModelAndView mav = new ModelAndView();
		// veut dre que la jsp portera ce nom cocktail
		mav.setViewName("cocktails");
		mav.addObject("cocktails", this.service.getAll());
		return mav;

	}

}
