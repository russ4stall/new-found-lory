# New Found Lory

This is a simple service that returns nfl scores for a specified week of a specified season in JSON. Scores are scraped 
from the NFL.com website. A future version of this service will implement a cache.

###Usage: 

**{hostname}/scores/{year}/{weekNumber}**

Returns the scores for every game from week number {weekNumber} in the {year} season. 

###Example:

**myserver.com/scores/2014/1**

Returns the scores for every game from week number 1 in the 2014 season.

This returns the following:
        
        [{"date":"Thu, Sep 4","homeTeam":"Seahawks","awayTeam":"Packers","homeTeamScore":"36","awayTeamScore":"16"},
        {"date":"Sun, Sep 7","homeTeam":"Texans","awayTeam":"Redskins","homeTeamScore":"17","awayTeamScore":"6"},
        {"date":"Sun, Sep 7","homeTeam":"Chiefs","awayTeam":"Titans","homeTeamScore":"10","awayTeamScore":"26"},
        {"date":"Sun, Sep 7","homeTeam":"Dolphins","awayTeam":"Patriots","homeTeamScore":"33","awayTeamScore":"20"},
        {"date":"Sun, Sep 7","homeTeam":"Jets","awayTeam":"Raiders","homeTeamScore":"19","awayTeamScore":"14"},
        {"date":"Sun, Sep 7","homeTeam":"Eagles","awayTeam":"Jaguars","homeTeamScore":"34","awayTeamScore":"17"},
        {"date":"Sun, Sep 7","homeTeam":"Steelers","awayTeam":"Browns","homeTeamScore":"30","awayTeamScore":"27"},
        {"date":"Sun, Sep 7","homeTeam":"Rams","awayTeam":"Vikings","homeTeamScore":"6","awayTeamScore":"34"},
        {"date":"Sun, Sep 7","homeTeam":"Bears","awayTeam":"Bills","homeTeamScore":"20","awayTeamScore":"23"},
        {"date":"Sun, Sep 7","homeTeam":"Ravens","awayTeam":"Bengals","homeTeamScore":"16","awayTeamScore":"23"},
        {"date":"Sun, Sep 7","homeTeam":"Falcons","awayTeam":"Saints","homeTeamScore":"37","awayTeamScore":"34"},
        {"date":"Sun, Sep 7","homeTeam":"Buccaneers","awayTeam":"Panthers","homeTeamScore":"14","awayTeamScore":"20"},
        {"date":"Sun, Sep 7","homeTeam":"Cowboys","awayTeam":"49ers","homeTeamScore":"17","awayTeamScore":"28"},
        {"date":"Sun, Sep 7","homeTeam":"Broncos","awayTeam":"Colts","homeTeamScore":"31","awayTeamScore":"24"},
        {"date":"Mon, Sep 8","homeTeam":"Lions","awayTeam":"Giants","homeTeamScore":"35","awayTeamScore":"14"},
        {"date":"Mon, Sep 8","homeTeam":"Cardinals","awayTeam":"Chargers","homeTeamScore":"18","awayTeamScore":"17"}]


##Purpose
This was built to test and experiment with the Dropwizard framework. 

