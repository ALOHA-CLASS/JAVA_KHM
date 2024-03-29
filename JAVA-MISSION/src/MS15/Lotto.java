package MS15;

import java.util.ArrayList;

public class Lotto {

	private ArrayList<ArrayList<Integer>> gameList; 
	private ArrayList<String> typeList;
	private static Lotto instance;
	
	public Lotto() {
		gameList = new ArrayList<ArrayList<Integer>>(); 
		typeList = new ArrayList<String>();
	}

	public static Lotto getInstance() {
		if( instance == null )
			instance = new Lotto();
		return instance;
	}

	public ArrayList<ArrayList<Integer>> getGameList() {
		return gameList;
	}

	public void setGameList(ArrayList<ArrayList<Integer>> gameList) {
		this.gameList = gameList;
	}

	public ArrayList<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(ArrayList<String> typeList) {
		this.typeList = typeList;
	}
	
	
}
