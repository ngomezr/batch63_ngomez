package com.cogent.generics;

interface Calculation<T extends Number>{
	T add(T a, T b);
	T subtract(T a, T b);
	T multiply(T a, T b);
	T divide(T a, T b);
}

class Integer implements Calculation<Number>{

	@Override
	public Number add(Number a, Number b) {
		return a.intValue() + b.intValue();
	}

	@Override
	public Number subtract(Number a, Number b) {
		return a.intValue() - b.intValue();
	}

	@Override
	public Number multiply(Number a, Number b) {
		return a.intValue() * b.intValue();
	}

	@Override
	public Number divide(Number a, Number b) {
		return a.intValue() / b.intValue();
	}
}

class Long implements Calculation<Number>{

	@Override
	public Number add(Number a, Number b) {
		return a.longValue() + b.longValue();
	}

	@Override
	public Number subtract(Number a, Number b) {
		return a.longValue() - b.longValue();
	}

	@Override
	public Number multiply(Number a, Number b) {
		return a.longValue() * b.longValue();
	}

	@Override
	public Number divide(Number a, Number b) {
		return a.longValue() / b.longValue();
	}
}

class Float implements Calculation<Number>{

	@Override
	public Number add(Number a, Number b) {
		return a.floatValue() + b.floatValue();
	}

	@Override
	public Number subtract(Number a, Number b) {
		return a.floatValue() - b.floatValue();
	}

	@Override
	public Number multiply(Number a, Number b) {
		return a.floatValue() * b.floatValue();
	}

	@Override
	public Number divide(Number a, Number b) {
		return a.floatValue() / b.floatValue();
	}
}

class Double implements Calculation<Number>{

	@Override
	public Number add(Number a, Number b) {
		return a.doubleValue() + b.doubleValue();
	}

	@Override
	public Number subtract(Number a, Number b) {
		return a.doubleValue() - b.doubleValue();
	}

	@Override
	public Number multiply(Number a, Number b) {
		return a.doubleValue() * b.doubleValue();
	}

	@Override
	public Number divide(Number a, Number b) {
		return a.doubleValue() / b.doubleValue();
	}
}


public class Calculations {
	public static void main(String[] args) {
		Calculation<Number> i = new Integer();
		Calculation<Number> l = new Long();
		Calculation<Number> f = new Float();
		Calculation<Number> d = new Double();
		
		System.out.println(i.add(6.2, 2.3));
		System.out.println(i.subtract(6.2, 2.3));
		System.out.println(i.multiply(6.2, 2.3));
		System.out.println(i.divide(6, 2));
		
		System.out.println();
		
		System.out.println(l.add(6.2, 2.3));
		System.out.println(l.subtract(6.2, 2.3));
		System.out.println(l.multiply(6.2, 2.3));
		System.out.println(l.divide(6.2, 2.3));
		
		System.out.println();
		
		System.out.println(f.add(6.2, 2.3));
		System.out.println(f.subtract(6.2, 2.3));
		System.out.println(f.multiply(6.2, 2.3));
		System.out.println(f.divide(6.2, 2.3));
		
		System.out.println();
		
		System.out.println(d.add(6.2, 2.3));
		System.out.println(d.subtract(6.2, 2.3));
		System.out.println(d.multiply(6.2, 2.3));
		System.out.println(d.divide(6.2, 2.3));
	}
}
