
package ohtu.verkkokauppa;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Kirjanpito implements Kirjaapitava {
    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    
    /* (non-Javadoc)
	 * @see ohtu.verkkokauppa.Kirjaapitava#lisaaTapahtuma(java.lang.String)
	 */
    @Override
	public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    /* (non-Javadoc)
	 * @see ohtu.verkkokauppa.Kirjaapitava#getTapahtumat()
	 */
    @Override
	public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
