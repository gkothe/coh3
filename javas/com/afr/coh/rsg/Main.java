package com.afr.coh.rsg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main {
	private List<Unit> units = new ArrayList();
	private List<Unit> masterList = new ArrayList();

	public void init() {
		this.units.clear();
		this.masterList.clear();
		BufferedReader br = null;
		try {
			InputStream is = Main.class.getResourceAsStream("/data.txt");
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			int numberAvailable = 10;
			String sCurrentLine;
//			for (int x = 1; x < numberAvailable; x++) {

				while ((sCurrentLine = br.readLine()) != null) {

					String[] parts = sCurrentLine.split(",");
					
					Unit unit = new Unit(parts[0].trim(), Integer.valueOf(
							parts[1].trim()).intValue(), parts[2].trim());
					this.masterList.add(unit);
					this.units.add(unit);
//				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	
	

	public static void main(String[] args) {
		
		
	}
	
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}	
	
	public HashMap<String, Integer> getRandomUnits(String nationality,
			int pointsMax) {
		int pointCount = 0;
		HashMap<String, Integer> randomUnits = new HashMap();
		
		if(nationality.equalsIgnoreCase("Russia ATB")){//rifles and mgs fixed
			int inf = (pointsMax/80);
			int mg = inf/3;
			inf = inf - mg;
			
			for (int i = 0; i < inf; i++) {
				int random  = randInt(1, 3);
				Unit unidade = new Unit();
				if(random==1){
					unidade = 	getUnitname(nationality,"SMG/Rifles");
				}if(random==2){
					unidade = getUnitname(nationality,	"NKVD");
				}if(random==3){
					unidade = getUnitname(nationality,	"Rifles");
				}
				
				pointCount += unidade.getPoints();
				Integer count = (Integer) randomUnits.get(unidade.getName());
				if (count != null) {
					count = Integer.valueOf(count.intValue() + 1);
				} else {
					count = Integer.valueOf(1);
				}
				Integer countI = Integer.valueOf(count.intValue());
				randomUnits.put(unidade.getName(), countI);
				
			}
			
			for (int i = 0; i < mg; i++) {
				
				int random  = randInt(1, 3);
				Unit unidade = unidade = 	getUnitname(nationality,"MMG Maxim");
				
				pointCount += unidade.getPoints();
				Integer count = (Integer) randomUnits.get(unidade.getName());
				if (count != null) {
					count = Integer.valueOf(count.intValue() + 1);
				} else {
					count = Integer.valueOf(1);
				}
				Integer countI = Integer.valueOf(count.intValue());
				randomUnits.put(unidade.getName(), countI);
				
			}
			
			
		}else if(nationality.equalsIgnoreCase("Germany ATB")){//rifles and mgs fixed
			int inf = (pointsMax/70);
			int mg = inf/3;
			inf = inf - mg;
			
			for (int i = 0; i < inf; i++) {
				int random  = randInt(1, 3);
				Unit unidade = unidade = 	getUnitname(nationality,"Rifles");
				
				pointCount += unidade.getPoints();
				Integer count = (Integer) randomUnits.get(unidade.getName());
				if (count != null) {
					count = Integer.valueOf(count.intValue() + 1);
				} else {
					count = Integer.valueOf(1);
				}
				Integer countI = Integer.valueOf(count.intValue());
				randomUnits.put(unidade.getName(), countI);
				
			}
			
			for (int i = 0; i < mg; i++) {
				
				int random  = randInt(1, 2);
				Unit unidade = new Unit();
				if(random==1){
					unidade = 	getUnitname(nationality,"LMG 34");
				}if(random==2){
					unidade = getUnitname(nationality,	"HMG 34");
				}
				
				pointCount += unidade.getPoints();
				Integer count = (Integer) randomUnits.get(unidade.getName());
				if (count != null) {
					count = Integer.valueOf(count.intValue() + 1);
				} else {
					count = Integer.valueOf(1);
				}
				Integer countI = Integer.valueOf(count.intValue());
				randomUnits.put(unidade.getName(), countI);
			}
			
		}
		
		while (pointCount < pointsMax) {
			Unit randomUnit = getRandomUnit(nationality);
			if (randomUnit == null) {
				return randomUnits;
			}
			
			
			int auxpoints = pointCount +  randomUnit.getPoints();
			;
			if (auxpoints <= pointsMax) {
				pointCount += randomUnit.getPoints();
				Integer count = (Integer) randomUnits.get(randomUnit.getName());
				if (count != null) {
					count = Integer.valueOf(count.intValue() + 1);
				} else {
					count = Integer.valueOf(1);
				}
				Integer countI = Integer.valueOf(count.intValue());
				randomUnits.put(randomUnit.getName(), countI);
				
			}else{
				removeUnit(randomUnit);
			}
		}
		return randomUnits;
	}
	
	/*
	public HashMap<String, Integer> getRandomUnits(String nationality,
			int pointsMax) {
		int pointCount = 0;
		HashMap<String, Integer> randomUnits = new HashMap();
		while (pointCount < pointsMax) {
			Unit randomUnit = getRandomUnit(nationality);
			if (randomUnit == null) {
				return randomUnits;
			}
			
			
			
			pointCount += randomUnit.getPoints();
			if (pointCount <= pointsMax) {
				Integer count = (Integer) randomUnits.get(randomUnit.getName());
				if (count != null) {
					count = Integer.valueOf(count.intValue() + 1);
				} else {
					count = Integer.valueOf(1);
				}
				Integer countI = Integer.valueOf(count.intValue());
				randomUnits.put(randomUnit.getName(), countI);
				removeUnit(randomUnit);
			}
		}
		return randomUnits;
	}*/

	public void removeUnit(Unit unit) {
		for (int x = 0; x < this.units.size(); x++) {
			if ((unit.getName().equalsIgnoreCase(((Unit) this.units.get(x))
					.getName()))
					&& (unit.getNationality()
							.equalsIgnoreCase(((Unit) this.units.get(x))
									.getNationality()))) {
				this.units.remove(x);
				break;
			}
		}
	}

	public Unit getRandomUnit(String nationality) {
		List<Unit> theUnits = getUnits(nationality);
		int numberOfUnits = getNumberOfUnits(nationality);
		if (numberOfUnits == 0) {
			return null;
		}
		int index = getRandomNumber(numberOfUnits);
		Unit unit = (Unit) theUnits.get(index);
		return unit;
	}

	public List<Unit> getUnits(String nationality) {
		List<Unit> toReturn = new ArrayList();
		for (Unit unit : this.units) {
			if (unit.getNationality().equalsIgnoreCase(nationality)) {
				toReturn.add(unit);
			}
		}
		return toReturn;
	}
	
	
	public Unit getUnitname(String nationality, String nome) {
		for (Unit unit : this.units) {
			if (unit.getNationality().equalsIgnoreCase(nationality) && unit.getName().equalsIgnoreCase(nome)) {
				return unit;
			}
		}
		return null;
	}

	public int getNumberOfUnits(String nationality) {
		int count = 0;
		for (Unit unit : this.units) {
			if (unit.getNationality().equalsIgnoreCase(nationality)) {
				count++;
			}
		}
		return count;
	}

	public int getRandomNumber(int max) {
		Random generator = new Random();
		int i = generator.nextInt(max);
		return i;
	}

	public List<Unit> getUnits() {
		return this.units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public List<Unit> getMasterList(String nationality) {
		List<Unit> toReturn = new ArrayList();
		for (Unit unit : this.masterList) {
			if (unit.getNationality().equalsIgnoreCase(nationality)) {
				toReturn.add(unit);
			}
		}
		return toReturn;
	}

	public void setMasterList(List<Unit> masterList) {
		this.masterList = masterList;
	}

	public int getMasterListCount() {
		return this.masterList.size();
	}
}