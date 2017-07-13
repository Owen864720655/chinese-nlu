package fanglei.com.chinese_word_segmenter.segementer;

import java.util.List;

import com.huaban.analysis.jieba.JiebaSegmenter;

public class JiebaSegment implements ISegmenter{

	public List<String> segment(String text) {
		JiebaSegmenter segmenter = new JiebaSegmenter();
		return segmenter.sentenceProcess(text);
	}
	
	
}
