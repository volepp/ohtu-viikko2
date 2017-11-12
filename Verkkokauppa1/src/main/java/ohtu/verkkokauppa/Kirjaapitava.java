package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Kirjaapitava {

	void lisaaTapahtuma(String tapahtuma);

	ArrayList<String> getTapahtumat();

}