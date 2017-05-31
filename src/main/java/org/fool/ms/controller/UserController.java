package org.fool.ms.controller;

import org.fool.ms.domain.User;
import org.fool.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public String list(Model model) {
        model.addAttribute("users", userService.findUsers());
        return "user/list";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute("user") User user, Model model) {
        return "user/add";
    }

    @PostMapping("/add")
    public String add(@Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user/add";
        }

        userService.insertUser(user);
        return "redirect:/user/users";
    }

    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "user/update";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable int id, @Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user/update";
        }

        userService.updateUser(user);

        return "redirect:/user/users";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/user/users";
    }

}
