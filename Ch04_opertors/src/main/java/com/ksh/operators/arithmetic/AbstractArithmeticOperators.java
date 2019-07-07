package com.ksh.operators.arithmetic;

public abstract class AbstractArithmeticOperators implements ArithmeticFactory {
	@Override
	public int add(byte i, byte j) {
		int z = i + j;
		System.out.println("byte addtion of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int add(short i, short j) {
		int z = i + j;
		System.out.println("short addtion of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int add(int i, int j) {
		int z = i + j;
		System.out.println("int addtion of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public long add(long i, long j) {
		long l = i + j;
		System.out.println("long addtion of " + i + ", " + j + " is : " + l);
		return l;
	}

	@Override
	public float add(float i, float j) {
		float z = i + j;
		System.out.println("float addtion of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public double add(double i, double j) {
		double d = i + j;
		System.out.println("short addtion of " + i + ", " + j + " is : " + d);
		return d;
	}

	// subtract
	@Override
	public int subtract(byte i, byte j) {
		int z = i - j;
		System.out.println("byte subtraction of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int subtract(short i, short j) {
		int z = i - j;
		System.out.println("short subtraction of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int subtract(int i, int j) {
		int z = i - j;
		System.out.println("int subtraction of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public long subtract(long i, long j) {
		long l = i - j;
		System.out.println("long subtraction of " + i + ", " + j + " is : " + l);
		return l;
	}

	@Override
	public float subtract(float i, float j) {
		float z = i - j;
		System.out.println("float subtraction of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public double subtract(double i, double j) {
		double d = i - j;
		System.out.println("short subtraction of " + i + ", " + j + " is : " + d);
		return d;
	}

	public abstract byte modulus(byte i, byte j);

	public abstract short modulus(short i, short j);

	public abstract int modulus(int i, int j);

	public abstract long modulus(long i, long j);

	public abstract float modulus(float i, float j);

	public abstract double modulus(double i, double j);
}
