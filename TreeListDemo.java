import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeListDemo {

	public static void main(String[] args) {
			
					
		TreeSet<ChemicalElements> ChEl = new TreeSet <ChemicalElements> ();
		System.out.println("TreeSet  has started ");
		
		System.out.println("Display details of 1st chemical element ");
		ChEl.add(new ChemicalElements (2,"Helium", "He",4.00260));
		
		System.out.println("Display details of 2nd chemical element ");
		ChEl.add(new ChemicalElements (5,"Nitrogen", "N",14.0067));
		
		System.out.println("Display details of 3rd chemical element ");
		ChEl.add(new ChemicalElements (11,"Sodium", "Na",22.98977));
		
		Iterator<ChemicalElements> iterator = ChEl.iterator();
		
		while(iterator.hasNext())
		{
			ChemicalElements ce = iterator.next();
			System.out.println("Chemical Elements  : " +ce );
		}
		
	}

}
class ChemicalElements implements Comparable<ChemicalElements>
{
	int AtomicNo;
	String AtomicName;
	String AtomicFormula;
	float AtomicWeight;
	public ChemicalElements(int atomicNo, String atomicName, String atomicFormula, double d) {
		super();
		AtomicNo = atomicNo;
		AtomicName = atomicName;
		AtomicFormula = atomicFormula;
		AtomicWeight = (float) d;
	}
	@Override
	public String toString() {
		return "ChemicalElements [AtomicNo=" + AtomicNo + ", AtomicName=" + AtomicName + ", AtomicFormula="
				+ AtomicFormula + ", AtomicWeight=" + AtomicWeight + "]";
	}
	@Override
	public int compareTo(ChemicalElements o) {
		System.out.println("Comparing  "+AtomicNo+" with "+ o.AtomicNo);
		return Integer.compare(AtomicNo, o.AtomicNo);
		
	}
	
	
	
	




}
