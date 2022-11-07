package lab10;

public class Hackathon {
    private static int MAX_NO_OF_PROJECTS = 6;
    private static int INDICATOR_COUNT;
    private static double[] INDICATOR_WEIGHTS;

    private int projectCount = 0;
    private Project[] projects = new Project[MAX_NO_OF_PROJECTS];

    public Hackathon(){
        projectCount = 0;
        projects = new Project[MAX_NO_OF_PROJECTS];
    }

    public int getMaxNoOfProjects(){
        return MAX_NO_OF_PROJECTS;
    }
    
    public int getIndicatorCount(){
        return INDICATOR_COUNT;
    }

    public double[] getIndicatorWeights(){
        return INDICATOR_WEIGHTS;
    }

    public void addProject(Project p){
        // Add project at first index of projects
        for (int i = projects.length-1; i > 0; i --){
            projects[i] = projects[i-1];
        }
        projects[0] = p;
        
        // // Add project at last index of projects
        // Project tempArray[] = new Project[projects.length + 1];
        // for (int i = 0; i < projects.length; i ++){
        //     tempArray[i] = projects[i];
        // }
        // tempArray[projects.length + 1] = p;
        // projects = tempArray;


        projectCount ++;
        p.setHackathon(this);
    }

    public String[][] makeDecision(){
        String[][] result = new String[5][3];
        int count = 0;
        for (int i = 0; i < MAX_NO_OF_PROJECTS; i ++){
            Project p = projects[i];
            // p.calcWeightAvg();
            // p.calcSegment();
            // p.calcCredibility();

            if (p.getCredibility() == "INVEST"){
                result[count][0] = p.getID();
                result[count][1] = p.getSupportedGoals() + ""; // Converting from double to string
                result[count][2] = p.getDuration() + "";
                count ++;
            }
        }
        result[3][0] = "----------------------------------------";
        result[3][1] = "";
        result[3][2] = "";
        result[4][0] = "MAX:";
        result[4][1] = "12";
        result[4][2] = "17";

        return result;
    }

    public String toString(int i){
        String result = "";
        String template1 = "%-15s%-15s%-15s%-15s%-15s%-15s%n";
        String template2 = "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n";


        // result += "********************************************************************************\n";
        if (i == 1){
            result += String.format(template1, "Project ID", "Indicator 1", "Indicator 2", "Indicator 3", "Indicator 4", "Indicator 5");
            for (Project p : projects){
                result += p.toString(1);
            }
        }
        else if (i == 0){
            result += String.format(template2, "Project ID", "Indicator 1", "Indicator 2", "Indicator 3", "Indicator 4", "Indicator 5", "Weighted Mean", "Segment", "Credibility");
            for (Project p : projects){
                result += p.toString(0);
            }
        }
        // result += "********************************************************************************\n";
        return result;

    }

    public static void main(String args[]){
        Hackathon hackathon = new Hackathon();

        String pName = "A6";
        double[] pScores =  {100, 1162, 17, 34, 6};
        hackathon.addProject(new Project(pName, pScores));

        pName = "A5";
        pScores = new double[] {20, 1020, 12, 11, 1};
        hackathon.addProject(new Project(pName, pScores));

        pName = "A4";
        pScores = new double[] {80, 1264, 4, 38, 7};
        hackathon.addProject(new Project(pName, pScores));

        pName = "A3";
        pScores = new double[] {100, 281, 13, 39, 9};
        hackathon.addProject(new Project(pName, pScores));

        pName = "A2";
        pScores = new double[] {20, 407, 13, 11, 1};
        hackathon.addProject(new Project(pName, pScores));

        pName = "A1";
        pScores = new double[] {100, 240, 15, 26, 12};
        hackathon.addProject(new Project(pName, pScores));



        // Initial table
        System.out.println("Initial Table");
        System.out.println("********************************************************************************");
        System.out.println(hackathon.toString(1));
        System.out.println("********************************************************************************");

        // Modified table
        for (Project p: hackathon.projects){
            p.calcModifiedScores();
        }
        System.out.println();
        System.out.println("Modified Table");
        System.out.println("********************************************************************************");
        System.out.println(hackathon.toString(1));
        System.out.println("********************************************************************************");

        // Final table
        for (Project p: hackathon.projects){
            p.calcWeightAvg();
            p.calcSegment();
            p.calcCredibility();
        }
        System.out.println();
        System.out.println("Final Table");
        System.out.println("************************************************************************************************************************");
        System.out.println(hackathon.toString(0));
        System.out.println("************************************************************************************************************************");

        // Make decision
        System.out.println();
        System.out.println("Investment Decision");
        System.out.println("**************************************");
        String[][] array = hackathon.makeDecision();


        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[0].length; j ++){
                System.out.printf("%-15s", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("**************************************");

    }
}
