package com.gongyeon2jo.sample.repository;

import com.gongyeon2jo.sample.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SampleRepository extends JpaRepository<Sample, String> {

    List<Sample> findAll();

    Optional<Sample> findBySampleId(int s);

    Sample save(Sample sample);

    void deleteBySampleId(int sampleId);

}
