package com.mycompany.main1;

class Printer {

    
    void printData(String text) {
    System.out.println("Text: " + text);
    }

      void printData(int number) {
      System.out.println("Number: " + number);
    }
}

public class main5 {
    public static void main(String[] args) {
        
        Printer printer = new Printer();

       
        printer.printData("Hello, Java!");
        printer.printData(100);
    }
}
