package com.ksh.operators.arithmetic;

public class KshArithmeticOperators extends AbstractArithmeticOperators {

	@Override
	public int multiplication(byte i, byte j) {
		int z = i * j;
		System.out.println("byte multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int multiplication(short i, short j) {
		int z = i * j;
		System.out.println("short multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int multiplication(int i, int j) {
		int z = i * j;
		System.out.println("int multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public long multiplication(long i, long j) {
		long z = i * j;
		System.out.println("long multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public float multiplication(float i, float j) {
		float z = i * j;
		System.out.println("flat multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public double multiplication(double i, double j) {
		double d = i * j;
		System.out.println("double multiplication of " + i + ", " + j + " is : " + d);
		return d;
	}

	@Override
	public int division(byte i, byte j) {
		int z = i / j;
		System.out.println("byte multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int division(short i, short j) {
		int z = i / j;
		System.out.println("short multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int division(int i, int j) {
		int z = i / j;
		System.out.println("int multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public long division(long i, long j) {
		long z = i / j;
		System.out.println("long multiplication of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public float division(float i, float j) {
		float z = i / j;
		System.out.println("float division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public double division(double i, double j) {
		double z = i / j;
		System.out.println("double division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public byte modulus(byte i, byte j) {
		byte z = (byte) (i % j);
		System.out.println("byte division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public short modulus(short i, short j) {
		short z = (short) (i % j);
		System.out.println("short division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public int modulus(int i, int j) {
		int z = i % j;
		System.out.println("int division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public long modulus(long i, long j) {
		long z = i % j;
		System.out.println("long division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public float modulus(float i, float j) {
		float z = i % j;
		System.out.println("float division of " + i + ", " + j + " is : " + z);
		return z;
	}

	@Override
	public double modulus(double i, double j) {
		double z = i % j;
		System.out.println("double division of " + i + ", " + j + " is : " + z);
		return z;
	}

}
