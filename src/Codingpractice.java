import java.io.*;

public class Codingpractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter quiz 1:");
        int Q1 = Integer.parseInt(br.readLine());
        System.out.print("Enter quiz 2:");
        int Q2 = Integer.parseInt(br.readLine());
        System.out.print("Enter quiz 3:");
        int Q3 = Integer.parseInt(br.readLine());
        System.out.print("Enter quiz 4:");
        int Q4 = Integer.parseInt(br.readLine());
        System.out.print("Enter quiz 5:");
        int Q5 = Integer.parseInt(br.readLine());

        double TQ = ((Q1 + Q2 + Q3 + Q4 + Q5) / 5.0) * 0.30;

        System.out.println("Total Quiz "+ TQ);


        System.out.print("Enter HW:");
        int HW = Integer.parseInt(br.readLine());
        System.out.print("Enter BEH :");
        int BEH = Integer.parseInt(br.readLine());
        System.out.print("Enter ATT :");
        int ATT = Integer.parseInt(br.readLine());
        System.out.print("Enter REC:");
        int REC = Integer.parseInt(br.readLine());
        double CS = ((HW + BEH + ATT + REC)/ 4.0) * 0.15;
        System.out.print("Total Class Standing " + CS);

        System.out.print("Enter Lecture Exam");
        int LecExam = Integer.parseInt(br.readLine());
        double TLCEXAM = (LecExam)*0.50;

        //PRELIM EXAM
        double PrelimLecture = (TQ + CS + TLCEXAM);
        System.out.print("Total Exam is:" + PrelimLecture);

        //LABORATORY

        System.out.println("Machine Problems");

        System.out.print("Enter MP1");
        int MP1 = Integer.parseInt(br.readLine());
        System.out.print("Enter MP2");
        int MP2 = Integer.parseInt(br.readLine());
        System.out.print("Enter MP3");
        int MP3 = Integer.parseInt(br.readLine());
        System.out.print("Enter MP4");
        int MP4 = Integer.parseInt(br.readLine());
        double MP = ((MP1 + MP2 + MP3 + MP4)/ 4.0) * 0.50;
        System.out.println("Total Machine Problem: " + MP);

        //LAB CLASS STANDING
        System.out.print("Enter ACT: ");
        int ACT = Integer.parseInt(br.readLine());
        System.out.print("Enter SW: ");
        int SW = Integer.parseInt(br.readLine());
        System.out.print("Enter COMP: ");
        int COMP = Integer.parseInt(br.readLine());
        double LCS = ((ACT + SW + COMP)/ 3.0) * 0.10;
        System.out.println("Lab Class Standing: " + LCS);


        // Lab Major Exam
        System.out.print("Enter Laboratory Major Exam: ");
        int LabExam = Integer.parseInt(br.readLine());
        double TLABEXAM = LabExam * 0.40;
        System.out.println("Laboratory Exam: " + TLABEXAM);

        // Prelim Laboratory Grade
        double PrelimLab = MP + LCS + TLABEXAM;
        System.out.println("Prelim Laboratory Grade: " + PrelimLab);

        // Final Grade
        double PrelimGrade = (PrelimLecture * 0.40) + (PrelimLab * 0.60);
        System.out.println("\nFinal Prelim Grade: " + PrelimGrade);


        double equivalent;
        if (PrelimGrade >= 97) equivalent = 1.00;
        else if (PrelimGrade >= 94) equivalent = 1.25;
        else if (PrelimGrade >= 91) equivalent = 1.50;
        else if (PrelimGrade >= 88) equivalent = 1.75;
        else if (PrelimGrade >= 85) equivalent = 2.00;
        else if (PrelimGrade >= 82) equivalent = 2.25;
        else if (PrelimGrade >= 79) equivalent = 2.50;
        else if (PrelimGrade >= 76) equivalent = 2.75;
        else if (PrelimGrade >= 75) equivalent = 3.00;
        else equivalent = 5.00;

        String remarks = (PrelimGrade >= 75) ? "Passed" : "Failed";

        // Final Output
        System.out.println("===== RESULTS =====");
        System.out.println("Prelim Lecture Grade: " + PrelimLecture);
        System.out.println("Prelim Laboratory Grade: " + PrelimLab);
        System.out.println("Final Prelim Grade: " + PrelimGrade);
        System.out.println("Equivalent Grade: " + equivalent);
        System.out.println("Remarks: " + remarks);











    }
}

















