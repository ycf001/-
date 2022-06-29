package com.eastytuop.decorator;

import javax.swing.*;

/**
 * @author beck.yang
 * @date 2022/6/29 17:06
 * @description 张三
 */
public class ZhangSan extends Person{
	@Override
	public void wear() {
		System.out.println("穿白色T恤.");
	}
}
