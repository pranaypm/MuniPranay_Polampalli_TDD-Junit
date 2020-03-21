/**
 * 
 */
package Muni_Pranay_Polampalli.TDD_Junit;

/**
 * @author polampalli
 *
 */
public class Remove_A_from_String {

	public String Characters_removing(String string) {
		String final_string="";
		for(int i=0;i<string.length();i++)
		{
			if(i<2)
				if(string.charAt(i)!='A')
					final_string+=string.charAt(i);
		}
	return final_string+string.substring(2);
	}
}
