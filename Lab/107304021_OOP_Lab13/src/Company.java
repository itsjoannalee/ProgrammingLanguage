import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<FixedAsset> fixedAssets;
	private double bookValue;
	private double totalDepreciationExp;

	public Company(String name) {
		this.name=name;
		fixedAssets=new ArrayList<FixedAsset>();
		bookValue=0;
		totalDepreciationExp=0;
	}
	public void addFixedAsset(FixedAsset asset) {
		fixedAssets.add(asset);
		bookValue+=asset.getBookValue();
	}
	public double getTotalBookValue() {//�p����cost-�ֿn����
		for(FixedAsset i:fixedAssets) {
			bookValue+=i.getBookValue();
		}
		return bookValue;
	}
	public double getDepreciationExp() {
		double currentDepreciationExp=0;
		for(FixedAsset i:fixedAssets) {
			currentDepreciationExp+=i.getDepreciationExp();
		}
		return currentDepreciationExp;
	}
	public void updateBookValue(){
		bookValue=getTotalBookValue()-getDepreciationExp();
	}
	public void updateDepreciationExp() {//�p��p���`�@����
		for(FixedAsset i:fixedAssets) {
			totalDepreciationExp+=i.getDepreciationExp();
		}
	}
	
}
