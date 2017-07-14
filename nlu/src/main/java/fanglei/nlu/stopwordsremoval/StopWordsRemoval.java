package fanglei.nlu.stopwordsremoval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StopWordsRemoval
{
	// public static final String STOP_WORD_TABLE = "." + File.separator + "src"
	// + File.separator + "main" + File.separator + "resources"
	// + File.separator + "models" + File.separator + "stopwords.txt";
	public static final String STOP_WORD_TABLE = "." + File.separator + "src"
			+ File.separator + "main" + File.separator + "resources"
			+ File.separator + "models" + File.separator + "stopwords"
			+ File.separator + "stopword.dic";

	private static Set<String> stopWords = new HashSet<String>();

	public static void readStopWords(String path) throws IOException
	{
		stopWords.clear();
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String stopWord = null;
		while ((stopWord = br.readLine()) != null)
		{
			System.out.println(stopWord);
			stopWords.add(stopWord);
		}
		fr.close();
		br.close();
	}

	private StopWordsRemoval()
	{
		try
		{
			readStopWords(STOP_WORD_TABLE);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static final StopWordsRemoval INSTANCE = new StopWordsRemoval();

	public static StopWordsRemoval getInstance()
	{
		return INSTANCE;
	}

	public List<String> remove(List<String> words)
	{
		List<String> result = new ArrayList<String>();

		for (String word : words)
		{
			if (!stopWords.contains(word))
			{
				result.add(word);
			}
		}
		return result;
	}
}
