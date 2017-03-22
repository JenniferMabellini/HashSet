import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Impiegato> impiegati= new HashSet<Impiegato>();
		Impiegato i1= new Impiegato(27, "luca", "dnjdh");
		Impiegato i2= new Impiegato(29, "hghg", "dndhdhhdhd");
		Impiegato i3= new Impiegato(21, "lhdfhdh", "dnjdhìdhdhdhd");
		impiegati.add(i1);
		impiegati.add(i2);
		impiegati.add(i3);
		Iterator<Impiegato> it= impiegati.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		List <String> arrayList= new ArrayList<String>();
		List <String> linkedList= new LinkedList<String>();
		HashSet<String> set= new HashSet<String>();
		Long t1=System.nanoTime();
		for (int i=0; i<1000; i++){
			arrayList.add("tag"+i);
		} Long t2=System.nanoTime();
		System.out.println("il tempo: \n"+(t2-t1)/1e9);
		Long t1l=System.nanoTime();
		for (int i=0; i<1000; i++){
			linkedList.add("tag"+i);
		} Long t2l=System.nanoTime();
		System.out.println(t2l-t1l/1e9);
		Long t1s=System.nanoTime();
		for (int i=0; i<1000; i++){
			set.add("tag"+i);
		} Long t2s=System.nanoTime();
		System.out.println(t2s-t1s/1e9);
		
		 Long r1s=System.nanoTime();
		for (int i=0; i<1000; i++){
			arrayList.remove("tag"+i);
		} Long r2s=System.nanoTime();
		System.out.println("il tempo di rimozione: "+(r2s-r1s)/1e9);
		
		 t1s=System.nanoTime();
			for (int i=0; i<1000; i++){
				linkedList.remove("tag"+i);
			} t2s=System.nanoTime();
			System.out.println("il tempo di rimozione: "+(t2s-t1s)/1e9);
			
			 t1s=System.nanoTime();
				for (int i=0; i<1000; i++){
					set.remove("tag"+i);
				} t2s=System.nanoTime();
				System.out.println("il tempo di rimozione: "+(t2s-t1s)/1e9);
			
		
		

	}

}
