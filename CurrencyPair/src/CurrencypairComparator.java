import java.util.Comparator;


public class CurrencypairComparator implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		return o1.getCurrencyPairs().compareToIgnoreCase(o2.getCurrencyPairs());
	}

}