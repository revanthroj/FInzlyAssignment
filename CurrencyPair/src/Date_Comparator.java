import java.util.Comparator;


public class Date_Comparator implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		return o1.getLastUpdatedTime().compareTo(o2.getLastUpdatedTime());
	}

}