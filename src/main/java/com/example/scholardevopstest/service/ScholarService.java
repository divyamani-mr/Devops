package com.example.scholardevopstest.service;

import com.example.scholardevopstest.dtos.ScholarRequest;
import com.example.scholardevopstest.entities.Academics;
import com.example.scholardevopstest.entities.CurrentPracticalPhase;
import com.example.scholardevopstest.entities.Scholar;
import com.example.scholardevopstest.entities.VTManger;
import com.example.scholardevopstest.repositories.ScholarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ScholarService {
    private final ScholarRepository scholarRepository;
    @Autowired
    public ScholarService(ScholarRepository scholarRepository) {
        this.scholarRepository = scholarRepository;
    }
    public void create(ScholarRequest scholarRequest)
    {
        Scholar scholar = new Scholar();
//        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.map(scholarRequest,Scholar.class);

        scholar.setInumber(scholarRequest.getInumber());
        scholar.setName(scholarRequest.getName());

        Academics academics = new Academics();
        academics.setCgpa(scholarRequest.getCgpa());
        academics.setStream(scholarRequest.getStream());
        academics.setBatch(scholarRequest.getBatch());
        scholar.setAcademics(academics);

        CurrentPracticalPhase currentPracticalPhase = new CurrentPracticalPhase();
        currentPracticalPhase.setPracticalPhase(scholarRequest.getPracticalPhase());
        currentPracticalPhase.setTeamName(scholarRequest.getTeamName());
        currentPracticalPhase.setLob(scholarRequest.getLob());
        currentPracticalPhase.setManagerName(scholarRequest.getManagerName());
        currentPracticalPhase.setManagerInumber(scholarRequest.getManagerInumber());
        currentPracticalPhase.setTechStack(scholarRequest.getTechStack());

        scholar.setCurrentPracticalPhase(currentPracticalPhase);

        VTManger vtManger = new VTManger();
        vtManger.setVtName(scholarRequest.getVtName());
        vtManger.setVtInumber(scholarRequest.getVtInumber());

        scholar.setVtManger(vtManger);
        scholar.setVtproject(scholarRequest.getVtproject());
       scholarRepository.save(scholar);
    }

    public List<Scholar> findAllScholars()
    {
        List<Scholar> scholars = new ArrayList<>();
        scholarRepository.findAll().forEach(scholars::add);
        return scholars;
    }

    public void deleteScholar(String id) {
            scholarRepository.deleteById(id);
    }

    public Optional<Scholar> findScholarById(String id) {
        return scholarRepository.findById(id);
    }

}
