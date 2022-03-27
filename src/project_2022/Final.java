/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2022;

/**
 *
 * @author jackiestewart
 */
public class Final {
    private String venue, year, replay, winner, runnerUp,winningScore, referee, 
            topScorer,topScorer2, attendance;
    public Final(){
    
    }//end of default constructor

    public Final(String venue, String year, String replay, String winner, String runnerUp, String winningScore, String referee, String topScorer, String topScorer2, String attendance) {
        this.venue = venue;
        this.year = year;
        this.replay = replay;
        this.winner = winner;
        this.runnerUp = runnerUp;
        this.winningScore = winningScore;
        this.referee = referee;
        this.topScorer = topScorer;
        this.topScorer2 = topScorer2;
        this.attendance = attendance;
    }//end of constructor
    
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\nAll Ireland Football Final Details - "); //added line break
        sb.append("Venue : "+ venue);
        sb.append(",\n");
         sb.append("Year : "+ year);
        sb.append(",\n");
         sb.append("Replay : "+ replay);
        sb.append(",\n");
        sb.append("Winner : "+ winner);
        sb.append(",\n");  
         sb.append("RunnerUP : "+ runnerUp);
        sb.append(",\n");
         sb.append("WinningScore : "+ winningScore);
        sb.append(",\n");
         sb.append("Referee : "+ referee);
        sb.append(",\n");
         sb.append("TopScorer-TeamA : "+ topScorer);
        sb.append(",\n");
         sb.append("TopScorer-TeamB : "+ topScorer2);
        sb.append(",\n");
        sb.append("Attendance : "+ attendance);
        sb.append(",\n");
       
        return sb.toString();
    }//end of toString method

    
    //create getter and setter methods for each variable listed
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
     
    public String getReplay() {
        return replay;
    }
    public void setReplay(String replay) {
        this.replay = replay;
    }

    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
    
    public String getRunnerUp() {
        return runnerUp;
    }
    public void setRunnerUp(String runnerUp) {
        this.runnerUp = runnerUp;
    }
    
    public String getWinningScore() {
        return winningScore;
    }
    public void setWinningScore(String winningScore) {
        this.winningScore = winningScore;
    }

    public String getReferee() {
        return referee;
    }
    public void setReferee(String referee) {
        this.referee = referee;
    }
 
    public String getTopScorer() {
        return topScorer;
    }
    public void setTopScorer(String topScorer) {
        this.topScorer = topScorer;
    }

    public String getTopScorer2() {
        return this.topScorer2;
    }
    public void setTopScorer2(String topScorer2) {
        this.topScorer2 = topScorer2;
    }
    
    public String getAttendance() {
        return attendance;
    }
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }         
}//end of public class Final
