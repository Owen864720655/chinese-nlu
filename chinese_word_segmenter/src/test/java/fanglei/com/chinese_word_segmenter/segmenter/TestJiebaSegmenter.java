package fanglei.com.chinese_word_segmenter.segmenter;

import java.util.List;

import fanglei.com.chinese_word_segmenter.segementer.JiebaSegment;

public class TestJiebaSegmenter {

	public static void main(String[] args)
	{
		String text = "前任拉甘送苏宁首败落后恒大6分争冠难了";
		List<String> result = new JiebaSegment().segment(text);
				System.out.println(result);
	}
}
