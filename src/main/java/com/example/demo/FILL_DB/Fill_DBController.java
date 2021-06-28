package com.example.demo.FILL_DB;

import com.example.demo.model.Match;
import com.example.demo.model.Team;
import com.example.demo.repository.MatchRepository;
import com.example.demo.repository.TeamRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fillDB")
public class Fill_DBController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    @PostMapping("/team")
    public void addTeam(@RequestBody Team team) {
        teamRepository.save(team);
    }

    @PostMapping("/match")
    public void addMatch(@RequestBody Match match) {
        matchRepository.save(match);
    }
}
