package org.example;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JRException, FileNotFoundException {
        List<EntiteLiee> entiteLieeList = new ArrayList<EntiteLiee>();


        EntiteLiee entiteLiee1 = new EntiteLiee();
        EntiteLiee entiteLiee2 = new EntiteLiee();
        EntiteLiee entiteLiee3 = new EntiteLiee();
        EntiteLiee entiteLiee4 = new EntiteLiee();
        EntiteLiee entiteLiee5 = new EntiteLiee();
        EntiteLiee entiteLiee6 = new EntiteLiee();

        //EntiteLiee1
        entiteLiee1.setNomEntite("entite1");
        entiteLiee1.setNbreActionnaire(5);
        entiteLiee1.setDateCreation("2022-05-01");
        entiteLiee1.setSegment("ABCD-D");
        entiteLiee1.setSecteurActivite("012345");
        entiteLiee1.setScd(0);
        entiteLiee1.setReseau(0);
        entiteLiee1.setAutres(0);
        entiteLiee1.setCoteRisque(0);
        entiteLiee1.setHistorique("True");

        //EntiteLiee2
        entiteLiee2.setNomEntite("entite2");
        entiteLiee2.setNbreActionnaire(2);
        entiteLiee2.setDateCreation("2020-11-01");
        entiteLiee2.setSegment("ABCD-D");
        entiteLiee2.setSecteurActivite("012345");
        entiteLiee2.setScd(0);
        entiteLiee2.setReseau(0);
        entiteLiee2.setAutres(0);
        entiteLiee2.setCoteRisque(0);
        entiteLiee2.setHistorique("True");


        //EntiteLiee2
        entiteLiee3.setNomEntite("entite3");
        entiteLiee3.setNbreActionnaire(1);
        entiteLiee3.setDateCreation("2020-11-01");
        entiteLiee3.setSegment("ABCD-D");
        entiteLiee3.setSecteurActivite("012345");
        entiteLiee3.setScd(0);
        entiteLiee3.setReseau(0);
        entiteLiee3.setAutres(0);
        entiteLiee3.setCoteRisque(0);
        entiteLiee3.setHistorique("True");

        //EntiteLiee2
        entiteLiee3.setNomEntite("entite3");
        entiteLiee3.setNbreActionnaire(9);
        entiteLiee3.setDateCreation("2019-11-01");
        entiteLiee3.setSegment("ABCD-D");
        entiteLiee3.setSecteurActivite("012345");
        entiteLiee3.setScd(10000000);
        entiteLiee3.setReseau(0);
        entiteLiee3.setAutres(0);
        entiteLiee3.setCoteRisque(0);
        entiteLiee3.setHistorique("True");

        entiteLiee4.setNomEntite("entite4");
        entiteLiee4.setNbreActionnaire(15);
        entiteLiee4.setDateCreation("2020-11-01");
        entiteLiee4.setSegment("ABCD-D");
        entiteLiee4.setSecteurActivite("012345");
        entiteLiee4.setScd(0);
        entiteLiee4.setReseau(0);
        entiteLiee4.setAutres(0);
        entiteLiee4.setCoteRisque(0);
        entiteLiee4.setHistorique("True");

        entiteLiee5.setNomEntite("entite5");
        entiteLiee5.setNbreActionnaire(7);
        entiteLiee5.setDateCreation("2020-11-01");
        entiteLiee5.setSegment("ABCD-D");
        entiteLiee5.setSecteurActivite("012345");
        entiteLiee5.setScd(0);
        entiteLiee5.setReseau(0);
        entiteLiee5.setAutres(0);
        entiteLiee5.setCoteRisque(0);
        entiteLiee5.setHistorique("True");

        entiteLiee6.setNomEntite("entite6");
        entiteLiee6.setNbreActionnaire(25);
        entiteLiee6.setDateCreation("2023-10-01");
        entiteLiee6.setSegment("ABCD-D");
        entiteLiee6.setSecteurActivite("012345");
        entiteLiee6.setScd(0);
        entiteLiee6.setReseau(0);
        entiteLiee6.setAutres(0);
        entiteLiee6.setCoteRisque(0);
        entiteLiee6.setHistorique("True");

        entiteLieeList.add(entiteLiee1);
        entiteLieeList.add(entiteLiee2);
        entiteLieeList.add(entiteLiee3);
        entiteLieeList.add(entiteLiee4);
        entiteLieeList.add(entiteLiee5);
        entiteLieeList.add(entiteLiee6);

        /*Path to put the pdf*/
        String outputFile = "D:\\UQAC\\COURS SPRING ANGULAR\\TestGenerationPdf\\TestGenerationPdf\\src\\main\\resources\\" + "EntiteLieeRapport.pdf";

        /* Convert List to JRBeanCollectionDataSource to send the data inside the jasper table */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(entiteLieeList);

        /* Map to hold Jasper report Parameters */
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("Tableau1BeanParam", itemsJRBean);

        //read jrxml file and creating jasperdesign object
        InputStream input = new FileInputStream(new File("D:\\UQAC\\COURS SPRING ANGULAR\\TestGenerationPdf\\TestGenerationPdf\\src\\main\\resources\\Entiteliee_report.jrxml"));

        JasperDesign jasperDesign = JRXmlLoader.load(input);

        /*compiling jrxml with help of JasperReport class*/
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        /* Using jasperReport object to generate PDF */
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        //JasperViewer.viewReport(jasperPrint);
       /* outputStream to create PDF */
        OutputStream outputStream = new FileOutputStream(new File(outputFile));


        /* Write content to PDF file */
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

        System.out.println("File Generated");
    }
}