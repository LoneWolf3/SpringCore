package com.sac.DI;

import java.beans.ConstructorProperties;

public class SeqGenConsAmb {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;

	public SeqGenConsAmb() {
	}

	public SeqGenConsAmb(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}

	public SeqGenConsAmb(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public SeqGenConsAmb(String prefix, int initial) {
		this.prefix = prefix;
		this.initial = initial;
	}

	@ConstructorProperties({"initial", "suffix"})
	public SeqGenConsAmb(int initial, String suffix) {
	this.initial = initial;
	this.suffix = suffix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
	}
}
