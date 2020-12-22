package com.dec14.utils;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {

    public static void main(String[] args) throws IOException {

        String path = "ShoppingList.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
        scanner.close();


        String pathVy = "vytrack_testusers.xlsx";
        File fileVy = new File(pathVy);
        Workbook workbook = WorkbookFactory.create(fileVy);

        int numOfSheets = workbook.getNumberOfSheets();

        for(Sheet each:workbook){
            System.out.println("Sheet: " + each.getSheetName());
            for(Row eachRow: each) {
                for (Cell eachCell : eachRow) {
                    System.out.printf("%-20s",eachCell);
                }
                System.out.println();
            }
        }
        System.out.println();
        Sheet sheet = workbook.getSheet("QA3-short");




    }



}
