package ca.mcgill.ecse321.loyaltypoints;

public class OperationFlatRatePoints implements PointsStrategy{
	@Override
	public int getPoints(double price) {
		return 25;
	}
}