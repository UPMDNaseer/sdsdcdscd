package com.jwt.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchResponse {

    private List<MatchData> data;

	public MatchData[] getData() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters
}

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchData {

    private String competition;
    private int year;
    private String team1;
    private String team2;
    private int team1goals;
    private int team2goals;
    
	public Object getTeam2goals() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTeam1goals() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters
}
