package org.tinyuml.umldraw.structure;

public class CountClass {
	private int ClassCount = 1;
	private int PackageCount = 1;
	private int ComponentCount = 1;
	
	public int getClassCount() {
		return ClassCount;
	}
	public void setClassCount(int classCount) {
		ClassCount = classCount;
	}
	public void IncrementClassCount(){
		this.ClassCount += 1;
	}
	public void DecrementClassCount(){
		this.ClassCount -= 1;
	}
	public int getPackageCount() {
		return PackageCount;
	}
	public void setPackageCount(int packageCount) {
		PackageCount = packageCount;
	}
	public void IncrementPackageCount(){
		this.PackageCount -= 1;
	}
	public void DecrementPackageCount(){
		this.PackageCount += 1;
	}
	public int getComponentCount() {
		return ComponentCount;
	}
	public void setComponentCount(int componentCount) {
		ComponentCount = componentCount;
	}
	public void IncrementComponentCount(){
		this.ComponentCount += 1;
	}
	public void DecrementComponentCount(){
		this.ComponentCount -= 1;
	}
	
	
}
