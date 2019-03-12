package com.cl.demo;

import redis.clients.jedis.Jedis;

public class JedisDemo {
	public static void main(String[] args) {
		//每次都是new一个对象
		add();
		get();
		del();
		//实力化Jedis
		Jedis jedis = new Jedis();
		
		System.out.println(String.format("abc=%s bbb=%s", jedis.get("abc"),jedis.get("bbb")));
	}
	
	public static void add(){
		Jedis jedis = new Jedis();
		jedis.set("abc", "赵子龙abc");
		jedis.set("bbb", "赵子龙bbb");
		
	}
	public static void get(){
		Jedis jedis = new Jedis();
		System.out.println(String.format("abc=%s bbb=%s", jedis.get("abc"),jedis.get("bbb")));
		
		
	}
	
	public static void del(){
		Jedis jedis = new Jedis();
		jedis.del("bbb");
	}
}
