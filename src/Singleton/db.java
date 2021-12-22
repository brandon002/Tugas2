package Singleton;

import java.util.Vector;

import Package.Package;

public class db {
	private static db _instance = new db();
	private Vector<Package> listPackage = new Vector<>();
	public db() {
		// TODO Auto-generated constructor stub
	}
	public static db getInstance() {
		if(_instance == null) {
			_instance = new db();
		}
		return _instance;
	}
	public void addPackage(Package Package) {
		listPackage.add(Package);
	}
	public Vector<Package> getListPackage(){
		return listPackage;
	}
}
