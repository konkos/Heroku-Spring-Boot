package com.example.demo.FILL_DB;

import com.example.demo.model.Match;
import com.example.demo.model.Team;
import com.example.demo.repository.MatchRepository;
import com.example.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fillDB")
public class Fill_DBController {

    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private MatchRepository matchRepository;

    @PostMapping("/team")
    public void addTeam(@RequestBody Team team) {
        teamRepository.save(team);
    }

    @PostMapping("/match")
    public void addMatch(@RequestBody Match match) {
        matchRepository.save(match);
    }

    @DeleteMapping
    public void deleteTeam(@RequestParam Long id) {
        teamRepository.deleteById(id);
    }

    @DeleteMapping
    public void deleteMatch(@RequestParam Long id) {
        matchRepository.deleteById(id);
    }
}
