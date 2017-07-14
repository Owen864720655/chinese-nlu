package fanglei.nlu.stopwordsremoval;

import java.util.List;

import fanglei.nlu.segmentation.JiebaSeg;

public class TestStopWordsRemoval
{

	public static void main(String[] args)
	{
		// String text = "前任拉甘送苏宁首败落后恒大6分争冠难了";
		String text = "我想充了值ֵ";

		JiebaSeg segmenter = JiebaSeg.getInstance();
		List<String> words = segmenter.segment(text);
		System.out.println(words);

		StopWordsRemoval stopWordsRemoval = StopWordsRemoval.getInstance();
		words = stopWordsRemoval.remove(words);
		System.out.println(words);
		text = String.join("", words);
		words = segmenter.segment(text);
		System.out.println(words);
	}
}
