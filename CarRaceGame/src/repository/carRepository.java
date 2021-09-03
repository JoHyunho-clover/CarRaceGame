package repository;
import java.util.HashMap;
import java.util.Map;

import carrace.car.carImpl;


public class carRepository {
	public static Map<String, carImpl> memory = new HashMap<>();
	
	public void save(carImpl car) {
		memory.put(car.name, car);
	}
	
	public carImpl get(String carname) {
		for(String name: memory.keySet()) {
			if(name==carname) {
				return memory.get(carname);
			}
		}
		return null;
	}
}
