package com.trainning.sarita.basicproject.multiThreading;
// extends Thread... It helps to strat task 1 and task 2 run in parallel way
class Task1 extends Thread {
    public void run() { //SIGNATURE should always match and it is format should be used everytime.
        System.out.println("Task1 started");
        for (int i = 101; i <= 199; i++)
            System.out.print(i + " ");
        System.out.print("\nTask1 Done");

    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.println(" \ntask 2 started");
        for (int i = 201; i < 299; i++)
            System.out.print(i + " ");
        System.out.print("\n Task2 Done");
    }
}



public class ThreadBasic {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        // task1.run will excuted program regular way whereas task1.start will run thread parallel.
        task1.start();

        System.out.println(" task 2 started");

        Task2 task2 = new Task2();
        Thread Task2thread = new Thread(task2);
        Task2thread.start();


        /* Task1
        for(int i = 101; i<199;i++)
        System.out.print(i+" ");
        System.out.print("\n Task1 Done");

        // Task2
        System.out.println(" task 2 started");
        for(int i = 201; i<299;i++)
            System.out.print(i+" ");
        System.out.print("\n Task2 Done");
          */

        // Task3
        System.out.println(" task 3 started");
        for(int i = 301; i<399;i++)
            System.out.print(i+" ");
        System.out.print("\n Task3 Done");
    }
}

/*
    Task3 Kicked Off157
        Task2 Started158 201 159 301 160 202 161 302 162 203 163 164 303 165 304 204
        Task1 Done260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 27
        Task2 Done344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 36
        Task3 Done
        Main Done
        */
//• NEW- when thread is not executed
//158 201 159 301 160
//• RUNNABLE; 159
//• RUNNING;301 is running
//• BLOCKED/WAITING; call external interface.
//• TERMINATED/DEAD; when thread is completed