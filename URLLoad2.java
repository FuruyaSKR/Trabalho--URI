import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class URLLoad2 {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("https://www.urionlinejudge.com.br/judge/pt/profile/4044").get();

		Elements elementosTag = doc.select(".pb-username");

		System.out.print("Nome: ");

		for (Element el : elementosTag)
			System.out.println(el.text());

		int i = 0;
		elementosTag = doc.select("li");
		for (Element el : elementosTag) {
			if (i >= 13 && i <= 22) {
				System.out.println(el.text());
			}
			i++;
		}
	}
}