package com.gongyeon2jo.sample.service;

import com.gongyeon2jo.sample.model.Sample;
import com.gongyeon2jo.sample.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SampleService {

    final private SampleRepository sampleRepository;

    public List<Sample> getSampleList() {
        return sampleRepository.findAll();
    }

    public Optional<Sample> getSample(int sampleId) {
        return sampleRepository.findBySampleId(sampleId);
    }

    public void insert(Sample sample) {
        sampleRepository.save(sample);
    }



    public void deleteBySampleId(int sampleId) {
        sampleRepository.deleteBySampleId(sampleId);
    }
}
