package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

@Component
public class Viitegeneraattori implements Generaattori {
    
    private int seuraava;
    
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    /* (non-Javadoc)
	 * @see ohtu.verkkokauppa.Generaattori#uusi()
	 */
    @Override
	public int uusi(){
        return seuraava++;
    }
}
