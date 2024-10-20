package org.example;

class Customer{
	private String name;
	private int tag; //VIP
	private int waitTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int isTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
}
