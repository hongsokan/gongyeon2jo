package com.gongyeon2jo.sample.controller;

import com.gongyeon2jo.sample.model.Sample;
import com.gongyeon2jo.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        modelAndView.setViewName("sample/list");
        return modelAndView;
    }

    @GetMapping("/{sampleId}")
    public ModelAndView getSample(@PathVariable("sampleId") int sampleId) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<Sample> sample = sampleService.getSample(sampleId);
        modelAndView.addObject("detail", sample.get());
        modelAndView.setViewName("sample/detail");
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView insertSample(Sample sample) {
        ModelAndView modelAndView = new ModelAndView();
        sampleService.insert(sample);
        modelAndView.setViewName("redirect:/sample");
        return modelAndView;
    }

}
