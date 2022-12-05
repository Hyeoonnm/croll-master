package co.co.com;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Croll {

    public myChar getCharacter(myChar character) throws IOException {

        String URL = "https://lostark.game.onstove.com/Profile/Character/" + character.getName();
        Connection conn = Jsoup.connect(URL);
        Document document = conn.get();

        character.setName(document.select(".profile-character-info__name").text());
        character.setServer(document.select(".profile-character-info__server").text());
        character.setJob(document.select(".profile-character-info__img").attr("alt"));
        character.setInfoTitle(document.select(".game-info__title").text());
        character.setLevel(document.select(".level-info2__expedition").text());

        String title = document.select(".game-info__title").text();
        character.setInfoTitle(title.substring(2));

        return character;
    }

}

