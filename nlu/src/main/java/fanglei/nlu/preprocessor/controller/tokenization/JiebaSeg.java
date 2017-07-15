package fanglei.nlu.preprocessor.controller.tokenization;

import com.huaban.analysis.jieba.JiebaSegmenter;

public class JiebaSeg implements ITokenizer
{

	/**
	 * 
	 * @author Owen
	 *
	 */
	private static class SingletonHolder
	{
		private static final JiebaSeg INSTANCE = new JiebaSeg();
	}

	private JiebaSeg()
	{
	}

	/**
	 * 
	 * @return
	 */
	public static final JiebaSeg getInstance()
	{
		return SingletonHolder.INSTANCE;
	}

	private JiebaSegmenter segmenter = new JiebaSegmenter();

	public String[] segment(String text)
	{
		return (String[]) segmenter.sentenceProcess(text).toArray();
	}

}
