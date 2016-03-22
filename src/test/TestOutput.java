/**  
 * @Title: TestOutput.java
 * @Prject: ansj_seg
 * @Package: test
 * @Description: TODO
 * @author: Evapandora  
 * @date: 2016年3月20日 下午10:16:09  
 */
package test;

import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.NlpAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * @ClassName: TestOutput
 * @Description: TODO
 * @author: Evapandora
 * @date: 2016年3月20日 下午10:16:09
 */
public class TestOutput {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		List<Term> parse = BaseAnalysis.parse("哈哈");
	    System.out.println(parse);
	    
	    List<Term> parse1 = ToAnalysis.parse("外卖");
	    System.out.println(parse1);
	    
	    List<Term> parse2 = NlpAnalysis.parse("哈哈");
	    System.out.println(parse2);
	    
	    

	}

}
