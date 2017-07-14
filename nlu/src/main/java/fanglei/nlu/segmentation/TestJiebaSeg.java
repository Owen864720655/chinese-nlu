package fanglei.nlu.segmentation;

public class TestJiebaSeg
{

	public static void main(String[] args)
	{
		String text = "前任拉甘送苏宁首败落后恒大6分争冠难了";
		JiebaSeg segmenter = JiebaSeg.getInstance();
		System.out.println(segmenter.segment(text));
	}
}
