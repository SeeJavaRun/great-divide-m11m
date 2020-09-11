package io.github.seejavarun;

import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreatDivide {

  private final Logger log = LoggerFactory.getLogger(this.getClass());
  private final AtlaTranscripts atlaTranscripts;
  private final FrequencyAnalyzer frequencyAnalyzer;

  public GreatDivide(AtlaTranscripts atlaTranscripts, FrequencyAnalyzer frequencyAnalyzer) {
    this.atlaTranscripts=atlaTranscripts;
    this.frequencyAnalyzer = frequencyAnalyzer;
  }

  public void run() throws IOException {
    var content = atlaTranscripts.get(111);
    var wordFrequencies = frequencyAnalyzer.load(new ByteArrayInputStream(content.getBytes()));
    wordFrequencies
        .forEach(word -> log.info("{} x{}",word.getWord(), word.getFrequency()));
  }
}
