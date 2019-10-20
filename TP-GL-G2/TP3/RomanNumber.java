package roman;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
public interface Comparable<T>

public final class RomanNumber extends Number {

  public static final long serialVersionUID = 1L;

  // Table des symboles
  private static final LinkedHashMap<String, Integer> SYMBOLS = new LinkedHashMap<>();
  static {
    SYMBOLS.put("M",  1000);
    SYMBOLS.put("CM", 900);
    SYMBOLS.put("D",  500);
    SYMBOLS.put("CD", 400);
    SYMBOLS.put("C",  100);
    SYMBOLS.put("XC", 90);
    SYMBOLS.put("L",  50);
    SYMBOLS.put("XL", 40);
    SYMBOLS.put("X",  10);
    SYMBOLS.put("IX", 9);
    SYMBOLS.put("V",  5);
    SYMBOLS.put("IV", 4);
    SYMBOLS.put("I", 1);
  }

  // Expression reguliere de validation
  private static final Pattern VALIDATION_RE = Pattern.compile(
      "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

  private final int value;

  public RomanNumber(String romanValue) {
    this.value = fromRoman(romanValue);
  }

  public RomanNumber(int value) {
    this.value = value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public double doubleValue() {
    // TODO un nombre romain valide représente un seul nombre
//décimal

		if (double.parseDouble(this.value))
		{
			throw new IllegalArgumentException();
		}	
	
    return 0;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public float floatValue() {
    // TODO

		if (float.parseFloat(this.value))
		{
			throw new IllegalArgumentException();
		}
    return 0;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public int intValue() {
    // TODO seuls les nombre entre 1 et 3 999 peuvent être représentés
	//Le 0 n’existe pas
	//Les nombres négatifs ne peuvent pas être représentés.
	

	
		if ((this.value <1)||(this.value>3999))
		{
			throw new IllegalArgumentException();
		}	
	
	
		
	
	return 0;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public long longValue() {
    // TODO
 	
		if (long.parseLong(this.value))
		{
			throw new IllegalArgumentException();
		}	
	
    return 0;
  }

  @Override
  public String toString() {
    return toRoman(this.value);
  }

  public static RomanNumber valueOf(String roman) {
    return new RomanNumber(roman);
  }

  public static RomanNumber valueOf(int value) {
    return new RomanNumber(value);
  }

  private static int fromRoman(String romanValue) {
    // TODO
	int result = 0;
	int index =0;
	int i,rv;
	for (i = 0 ; i < romanValue.length() ; i++)
	{
		while(romanValue.substring(index,index + key.length() ).equals(key))
		{
			result = result + SYMBOLS.value;
			index  = index  + key.length();
		}
	
    return result;
  }

  private static String toRoman(int value) {
    // TODO

	String resultat="";
	
	for (int i=0;i<SYMBOLS.length;i++)
	{

		while (value>=(SYMBOLS.value))do
		{
			resultat=resultat+SYMBOLS.value;
			value=value-SYMBOLS.value;
	
		} 
	}

    
	Matcher = VALIDATION_RE.matcher("resultat");
    return m.find();
	
	}
}
	int compareTo(T r){
	
		if(n.compareTo(r)==0)
		{
			return 0;
		}
		
	}
}





