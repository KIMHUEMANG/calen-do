package Jamong.calender.domain.planner.service;

import Jamong.calender.domain.planner.dto.PlannerDto;
import Jamong.calender.domain.planner.entity.Planner;
import Jamong.calender.domain.planner.repository.PlannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlannerService {

    private final PlannerRepository plannerRepository;

    public Integer writePlanner(PlannerDto plannerDto) {
        Planner planner = Planner.builder()
                .content(plannerDto.getContent())
                .member(plannerDto.getMember())
                .build();

        return planner.getPlanner_idx();
    }

    public List<Planner> findAllPlanner() {
        List<Planner> planners = plannerRepository.findAll();
        return planners;
    }
}