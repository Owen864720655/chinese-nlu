package fanglei.nlu.preprocessor.controller.tokenization;

public interface ITokenizer
{
	public String[] segment(String sentence) throws Exception;
}
