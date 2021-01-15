package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();

		/*******************************
		 * La méthode add() ******************************
		 */

		// ArrayList
		long tpsdebut = System.currentTimeMillis();
		for (int i = 0; i <= 999999; i++) {
			alist.add(i);
		}
		long tpsfin = System.currentTimeMillis();
		long dureeAddArrayList = tpsfin - tpsdebut;

		// LinkedList
		tpsdebut = System.currentTimeMillis();
		for (int i = 0; i <= 999999; i++) {
			llist.add(i);
		}
		tpsfin = System.currentTimeMillis();
		long dureeAddLinkeList = tpsfin - tpsdebut;

		/******************************
		 * La méthode get()
		 ******************************/

		// ArrayList
		tpsdebut = System.currentTimeMillis();
		for (int i = 0; i <= 1000; i++) {
			alist.get(i);
		}
		tpsfin = System.currentTimeMillis();
		long dureeGetArrayList = tpsfin - tpsdebut;

		// LinkedList
		tpsdebut = System.currentTimeMillis();
		for (int i = 0; i <= 1000; i++) {
			llist.get(i);
		}
		tpsfin = System.currentTimeMillis();
		long dureeGetLinkedList = tpsfin - tpsdebut;

		/*******************************
		 * La méthode remove() ******************************
		 */
		// ArrayList
		tpsdebut = System.currentTimeMillis();

		for (int i = 1000; i >= 0; i--) {
			alist.remove(i);
		}
		tpsfin = System.currentTimeMillis();
		long dureeRemoveArrayList = tpsfin - tpsdebut;

		// LinkedList
		tpsdebut = System.currentTimeMillis();

		for (int i = 1000; i >= 0; i--) {
			llist.remove(i);
		}
		tpsfin = System.currentTimeMillis();
		long dureeRemoveLinkedList = tpsfin - tpsdebut;
		System.out.println("ArrayList/LinkedList  " + "Add" + "     " + "Get" + "    " + "Remove");
		System.out
				.println("ArrayList:             " + dureeAddLinkeList + "     " + dureeGetArrayList + "     " + dureeRemoveArrayList);
		System.out.println(
				"LinkedList:            " + dureeAddArrayList + "     " + dureeGetLinkedList + "     " + dureeRemoveLinkedList);

	}
}