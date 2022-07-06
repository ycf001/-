package com.eastytuop.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author beck.yang
 * @date 2022/7/5 19:20
 * @description 享元工厂
 */
public class FlyWeightFactory {
	private Map<String, FlyWeight> flyWeightMap = new HashMap<>();

	public FlyWeight getFlyWeight(String key){
		if (flyWeightMap.containsKey(key)) {
			return flyWeightMap.get(key);
		}else {
			ConcreteFlyWeight concreteFlyWeight = new ConcreteFlyWeight(key);
			flyWeightMap.put(key,concreteFlyWeight);
			return concreteFlyWeight;
		}
	}

	public int size(){
		return flyWeightMap.size();
	}
}
