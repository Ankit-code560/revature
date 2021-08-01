package tasktrain;

public class Train {
	private String destinationCode;
	private String station;
	private double arTime;
	private double deptTime;
	private int srno;
	
	public Train(int srno,String destinationCode,String station,double arTime,double deptTime) {
	
		this.destinationCode=destinationCode;
		this.srno=srno;
		this.station=station;
		this.arTime=arTime;
		this.deptTime=deptTime;
	}
	
	public void Display( )
	{
		System.out.printf("%d %6s %16s %8.2f %8.2f\n", srno, destinationCode, station,arTime,deptTime);
	}

	

}
