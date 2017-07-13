package fanglei.com.chinese_word_segmenter.segementer;

import java.util.List;

public interface ISegmenter {
	public List<String> segment(String text);
}
