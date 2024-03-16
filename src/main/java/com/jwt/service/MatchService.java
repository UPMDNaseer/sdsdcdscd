package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jwt.response.MatchData;
import com.jwt.response.MatchResponse;

@Service
public class MatchService {

    @Autowired
    private RestTemplate restTemplate;

    public int getDrawnMatchesCount(int year) {
        // Implement logic to fetch matches for the given year
        // Make HTTP GET request to football matches API
        String url = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&page=1";
        MatchResponse matchResponse = restTemplate.getForObject(url, MatchResponse.class);

        // Process the matches and calculate the count of drawn matches
        int drawnMatchesCount = 0;
        for (MatchData matchData : matchResponse.getData()) {
            if (matchData.getTeam1goals() == matchData.getTeam2goals()) {
                drawnMatchesCount++;
            }
        }
        return drawnMatchesCount;
    }
}

