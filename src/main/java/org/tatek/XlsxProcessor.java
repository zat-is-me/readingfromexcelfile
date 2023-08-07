package org.tatek;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tatek on 8/3/2023
 */
public class XlsxProcessor {

    public static final String path = "C://aDeveloper//DeveloperResources//RecruitingData.xlsx";

    static CandidateDetails candidateList = new CandidateDetails();

    public static void objectProcessor(){

        try {
            FileInputStream fis = new FileInputStream(new File(path));
            XSSFWorkbook book = new XSSFWorkbook(fis);
            XSSFSheet sheet = book.getSheetAt(0);

            int rowEnds = 999;

                for (int i = 1; i < rowEnds; i++) {
                    ArrayList<String> arrayList = new ArrayList<>();
                        for (int j = 0; j < 5; j++) {
                            Row row = sheet.getRow(i);
                            Cell cell = row.getCell(j);
                            arrayList.add(cell.toString());
                        }
                    candidatesExtraction(arrayList);
                }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void candidatesExtraction(List<String> data){

                CandidateDetails candidate = new CandidateDetails();
                candidate.setConsultantName(data.get(0));
                candidate.setPhoneNumber(data.get(1));
                candidate.setEmail(data.get(2));
                candidate.setSkills(data.get(3));
                candidate.setLocation(data.get(4));
                candidate.setEmploymentForm(null);
                candidateList.add(candidate);
    }
}
