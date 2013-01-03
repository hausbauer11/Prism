package me.botsko.prism.actiontypes;

public class GenericActionType implements ActionType {
	
	
	/**
	 * 
	 * @return
	 */
	public String getActionType(){
		return "generic";
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isBlockAction(){
		return true;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isEntityAction(){
		return false;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isItemStackAction(){
		return false;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isSignAction(){
		return false;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean doesCreateBlock(){
		return isBlockAction();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean canRollback(){
		return true;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean canRestore(){
		return true;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getNiceWordOfAction(){
		return "did something to";
	}
}