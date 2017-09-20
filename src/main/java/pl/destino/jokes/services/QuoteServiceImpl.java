
package pl.destino.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *
 * @author Destino
 */
@Service
public class QuoteServiceImpl implements QuoteService{

    private final ChuckNorrisQuotes quotes;

    public QuoteServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }    
    
    
    @Override
    public String getQuote() {
       return quotes.getRandomQuote();
    }
    
}
