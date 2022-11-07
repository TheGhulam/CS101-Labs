package lab10;

public class Project {
    private static int INITIAL = 0;
    private static int MODIFIED = 1;
    private static int FINAL = 2;

    private String ID;
    private double finalScore = 0;
    private String segment = "?";
    private String credibility = "?";
    private String sustainability = "?";
    private double[] rawScores;
    private double[] modifiedScores;
    private Hackathon hackathon;

    public Project(String i, double[] r){
        ID = i;
        rawScores = r;
        
        modifiedScores = new double[rawScores.length];
        for (int j = 0; j < rawScores.length; j ++){
            modifiedScores[j] = rawScores[j];
        }
    }

    public String getID(){
        return ID;
    }

    public String getCredibility(){
        return credibility;
    }

    public double getSupportedGoals(){
        return rawScores[4];
    }

    public double getDuration(){
        return rawScores[2];
    }

    public Hackathon getHackathon(){
        return hackathon;
    }

    public void setHackathon(Hackathon h){
        hackathon = h;
    }

    public void calcModifiedScores(){
        // Indicator 1
        modifiedScores[0] = rawScores[0];

        // Indicator 2
        double s = rawScores[1];
        if (0 < s && s <= 500){
            modifiedScores[1] = 20;
        }
        else if (500 < s && s <= 1000){
            modifiedScores[1] = 80;
        }
        else if (s > 1000){
            modifiedScores[1] = 100;
        }

        // Indicator 3
        s = rawScores[2];
        if (0 < s && s <= 6){
            modifiedScores[2] = 100;
        }
        else if (6 < s && s <= 12){
            modifiedScores[2] = 80;
        }
        else if (s > 12){
            modifiedScores[2] = 20;
        }

        // Indicator 4
        s = rawScores[3];
        if (0 <= s && s < 10){
            modifiedScores[3] = 20;
        }
        else if (10 <= s && s < 15){
            modifiedScores[3] = 80;
        }
        else if (s >= 15){
            modifiedScores[3] = 100;
        }

        // Indicator 5
        s = rawScores[4];
        if (0 < s && s <= 2){
            modifiedScores[4] = 1;
        }
        else if (2 < s && s <= 5){
            modifiedScores[4] = 20;
        }
        else if (5 < s && s <= 10){
            modifiedScores[4] = 80;
        }
        else if (s > 10){
            modifiedScores[4] = 100;
        }

    }

    public void calcWeightAvg(){
        finalScore += (modifiedScores[0]/100) * 10;
        finalScore += (modifiedScores[1]/100) * 20;
        finalScore += (modifiedScores[2]/100) * 30;
        finalScore += (modifiedScores[3]/100) * 35;
        finalScore += (modifiedScores[4]/100) * 5;
    }

    public void calcSegment(){
        if (finalScore == 100){
            segment = "A+";
        }
        else if (finalScore >= 90){
            segment = "A";
        }
        else if (finalScore >= 75){
            segment = "B";
        }
        else if (finalScore >= 60){
            segment = "C";
        }
        else if (finalScore >= 40){
            segment = "D";
        }
    }

    public void calcCredibility(){
        if (modifiedScores[4] == 1) credibility = "REMOVED";
        else if ((segment == "A+" ) && ((modifiedScores[4] >= 20))) credibility = "INVEST";
        else if ((segment == "A") && ((modifiedScores[4] >= 20))) credibility = "INVEST";
        else if ((segment == "B") && ((modifiedScores[4] >= 80))) credibility = "INVEST";
        else if ((segment == "C") && ((modifiedScores[4] == 100))) credibility = "INVEST";
        else if (segment == "D") credibility = "DO NOT INVEST";
    }

    public String toString(int i){
        String result = "";
        String template1 = "%-15s%-15.0f%-15.0f%-15.0f%-15.0f%-15.0f%n";
        String template2 = "%-15s%-15.0f%-15.0f%-15.0f%-15.0f%-15.0f%-15.2f%-15s%-15s%n";
        if (i == 1){
            result += String.format(template1, ID, modifiedScores[0] , modifiedScores[1] , modifiedScores[2] , modifiedScores[3], modifiedScores[4]);
        }
        else if (i == 0){
            result += String.format(template2, ID, modifiedScores[0] , modifiedScores[1] , modifiedScores[2] , modifiedScores[3], modifiedScores[4], finalScore, segment, credibility);
        }
        return result;
    }
}