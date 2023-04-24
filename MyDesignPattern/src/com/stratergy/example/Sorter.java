package com.stratergy.example;

public class Sorter {
	private SortingStratergy strategy;
	 
	 public Sorter(SortingStratergy strategy) {
	     this.strategy = strategy;
	 }
	 
	 public void setStrategy(SortingStratergy strategy) {
	     this.strategy = strategy;
	 }
	 
	 public void sort(int[] array) {
	     strategy.sort(array);
	 }
}
