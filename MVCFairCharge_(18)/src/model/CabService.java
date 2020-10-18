package model;
//Model layer ==/Service class===/Business logic
public class CabService
{
    public double autobill(double km,int minute)
    {
    	double basicamount=km*6;
    	int waitingcharge=minute*2;
    	
    	double finalamount=basicamount+waitingcharge;
    	return finalamount;
    }
    public double primebill(double km,int minute)
    {
    	double basicamount=km*10;
    	int waitingcharge=minute*2;
    	
    	double finalamount=basicamount+waitingcharge;
    	return finalamount;
    }
    public double minbill(double km,int minute)
    {
    	double basicamount=km*8;
    	int waitingcharge=minute*2;
    	
    	double finalamount=basicamount+waitingcharge;
    	return finalamount;
    }
}
