package com.javarush.task.task28.task2810.view;

import com.javarush.task.task28.task2810.Controller;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.io.*;
import java.util.List;
import org.jsoup.Jsoup;
 import org.jsoup.nodes.Document;
 import org.jsoup.nodes.Element;

/**
 * Created by chumak on 18.08.17.
 */
public class HtmlView implements View {
    private Controller controller;
    private final String filePath;
    {
        filePath = "./src/" + this.getClass().getPackage().getName().replace('.', '/') + "/vacancies.html";
        }
        private String getUpdatedFileContent(List<Vacancy> list) {

            Document doc = null;
            try {
                doc = getDocument();
                Element templateOriginal = doc.getElementsByClass("template").first();
                Element copyTemplate = templateOriginal.clone();
                copyTemplate.removeAttr("style");
                copyTemplate.removeClass("template");
                doc.select("tr[class=vacancy]").remove().not("tr[class=vacancy template");
                for (Vacancy vacancy : list) {
                    Element localClone = copyTemplate.clone();
                    localClone.getElementsByClass("city").first().text(vacancy.getCity());
                    localClone.getElementsByClass("companyName").first().text(vacancy.getCompanyName());
                    localClone.getElementsByClass("salary").first().text(vacancy.getSalary());
                    Element link =localClone.getElementsByTag("a").first();
                    link.text(vacancy.getTitle());
                    link.attr("href", vacancy.getUrl());
                    templateOriginal.before(localClone.outerHtml());
                    }
                } catch (IOException e) {
                e.printStackTrace();
                return "Some exception occurred";
                }
            return doc.html();
       }
        private void updateFile(String s) {
            try {
                FileWriter fileWriter = new FileWriter(new File(filePath));
                fileWriter.write(s);
                fileWriter.close();
                } catch (IOException e) {
                e.printStackTrace();
                }
        }
    @Override
    public void update(List<Vacancy> vacancies) {
        try {
            updateFile(getUpdatedFileContent(vacancies));
            } catch (Exception e) {
            e.printStackTrace();
            }
    }


    @Override
    public void setController(Controller controller) {
    this.controller=controller;
    }
    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }
    protected Document getDocument()  throws IOException {
        return Jsoup.parse(new File(filePath), "UTF-8");
    }
}
