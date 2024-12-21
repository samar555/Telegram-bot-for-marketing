package app.netlify.sachin1008.service.impl;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import app.netlify.sachin1008.service.WebScraping;

@Service
public class WebScrapingImpl implements WebScraping {

	@Override
	public String scrapingWeb(String url) {
		String scrapData = "";
		try {

			Document document = Jsoup.connect(url).get();
			ArrayList<String> downServers = new ArrayList<>();
			for(int z=0;z<6;z++) {
				scrapData+="\n\n\n";
				Element figure = document.select("figure:has(table)").get(z);
				Element table = document.select("table").get(z);
				org.jsoup.select.Elements rows = table.select("tr");
				if (figure != null) {
					// Get the paragraph immediately above the figure
					Element previousElement = figure.previousElementSibling();
					if (previousElement != null && previousElement.tagName().equals("p")) {
						System.out.println("Paragraph above figure: " + previousElement.text());
						scrapData += previousElement.text() + "\n\n";
					} else {
						System.out.println("No paragraph found above the figure.");
					}
				} else {
					System.out.println("No figure containing a table found.");
				}
				for (int i = 1; i < rows.size(); i++) { // first row is the col names so skip it.
					Element row = rows.get(i);
					Elements cols = row.select("td");
					scrapData += cols.get(0).text() + " : " + cols.get(1).text() + " \n";
					System.out.println(cols.get(0));
					System.out.println(cols.get(1));
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return scrapData;
	}

}
