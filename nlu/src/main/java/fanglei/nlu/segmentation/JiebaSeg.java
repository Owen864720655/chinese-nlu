package fanglei.nlu.segmentation;

import java.util.List;

import com.huaban.analysis.jieba.JiebaSegmenter;

public class JiebaSeg {

	/**
	 * 
	 * @author Owen
	 *
	 */
	private static class SingletonHolder {
		private static final JiebaSeg INSTANCE = new JiebaSeg();
	}
	
	private JiebaSeg(){}
	
/**
 * 
 * @return
 */
	public static final JiebaSeg getInstance(){
		return SingletonHolder.INSTANCE;
	}
	
	private JiebaSegmenter segmenter = new JiebaSegmenter();
	
	public List<String> segment(String text)
	{
		return segmenter.sentenceProcess(text);
	}
	
}
