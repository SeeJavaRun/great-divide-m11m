package io.github.seejavarun;

import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import java.io.IOException;

public class Main {

  public static void main(String...args) throws IOException {
    System.out.println("starting…");

    // build dependencies so GreatDivide class doesnt have to
    // bother with the construction details

    var atlaTranscripts = new AtlaTranscripts();

    var frequencyAnalyzer = new FrequencyAnalyzer();
    frequencyAnalyzer.setWordFrequenciesToReturn(10);
    frequencyAnalyzer.setMinWordLength(4);
    //    frequencyAnalyzer.setStopWords(loadStopWords());

    // GreatDivide class is doing to
    new GreatDivide(atlaTranscripts, frequencyAnalyzer).run();

  }

}
