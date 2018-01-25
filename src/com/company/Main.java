package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int pointMax = 30;
    public static int workerMax =50;
    public static int abilityMax =10;

    public static void main(String[] args) {
	// 2018.01.24
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String userYN = "Y";
        ArrayList workerList = new ArrayList();
        double taskPts = random.nextInt(pointMax)+1; //in place of user input
        Task project = new Task(taskPts); //create new Task object

        while (userYN.equalsIgnoreCase("Y")) {
            int empNum = random.nextInt(workerMax) + 1; //in place of user input
            double workerAbil = random.nextInt(abilityMax) + 1; //in place of user input
            Worker projWorker = new Worker(empNum, workerAbil); //create new Worker object
            //evaluation calculation & print statement to confirm evaluation
            workerList.add(projWorker);
            double taskHrs = (int) Math.ceil(taskPts / workerAbil);
            System.out.println("Your Task with " + project.points + " points, will take " + taskHrs
                    + " hours to complete with Worker " + projWorker.empNum + ", who has a abilty rating of " + projWorker.ability + ".");
            System.out.println("");
            System.out.println("Would you like to add a worker to the task? (Y/N)"); //user input
            userYN = sc.nextLine();
        }

        System.out.println("Have a nice day!");
    }

//    public static double test() {
//
//    }

}
