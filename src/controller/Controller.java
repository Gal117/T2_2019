package controller;

import api.IMovingViolationsManager;
import model.data_structures.DoublyLinkedList;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;

public class Controller {

	/**
	 * Reference to the services manager
	 */
	@SuppressWarnings("unused")
	private static IMovingViolationsManager  manager = new IMovingViolationsManager();
	
	public static void loadMovingViolations() {
		
	}
	
	public static LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		return null;
	}
	
	public static LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		return null;
	}
}
