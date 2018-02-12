package org.launchcode.controllers;

import org.launchcode.models.Conference;
import org.launchcode.models.data.ConferenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ConferenceController {
    @Autowired
    private ConferenceDao conferenceDao;

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("title", "All Conferences");
        model.addAttribute("conferences", conferenceDao.findAll());
        return "index";
    }

    @RequestMapping(value = "add")
    public String addConference(Model model){
        model.addAttribute("title", "Add a Conference");
        model.addAttribute(new Conference());
        return "add-conference";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String addConference(@ModelAttribute @Valid Conference conference, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add a Conference");
            return "add-conference";
        } else {
            conferenceDao.save(conference);
            model.addAttribute("title", "All Conferences");
            return "redirect:";
        }
    }

    @RequestMapping(value="conference/{id}")
    public String viewConference(Model model, @PathVariable int id){
        model.addAttribute("conference", conferenceDao.findOne(id));
        model.addAttribute("title", conferenceDao.findOne(id).conferenceName);
        return "conference";
    }

}
