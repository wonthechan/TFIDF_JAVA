package TFIDF;

import java.util.List;

public interface Tokenizer {
	List<String> getTokens(String document);
}
