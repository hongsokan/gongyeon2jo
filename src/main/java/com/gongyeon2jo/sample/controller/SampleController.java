package com.gongyeon2jo.sample.controller;

import com.gongyeon2jo.sample.model.Sample;
import com.gongyeon2jo.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/sample")
public class SampleController {

    final SampleService sampleService;

    @GetMapping("")
    public ModelAndView getSampleList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Sample> sampleList = sampleService.getSampleList();
        modelAndView.addObject("list", sampleList);
        modelAndView.setViewName("/sample");
        return modelAndView;
    }

    @GetMapping("/{sampleId}")
    public ModelAndView getSample(@PathVariable("sampleId") int sampleId) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<Sample> sample = sampleService.getSample(sampleId);
        modelAndView.addObject("detail", sample.get());
        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView insertSample(Sample sample) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
}
