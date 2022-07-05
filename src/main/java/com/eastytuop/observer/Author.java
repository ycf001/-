package com.eastytuop.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/4 18:21
 * @description 作者（被观察者）
 */
public abstract class Author {
	List<Reader> readers = new ArrayList<>();

	public void addReader(Reader reader){
		readers.add(reader);
	}

	public void removeReader(Reader reader){
		readers.remove(reader);
	}

	public void notify(String title){
		for (Reader reader : readers) {
			reader.read(title);
		}
	}

	public abstract void writeTitle(String title);
}
