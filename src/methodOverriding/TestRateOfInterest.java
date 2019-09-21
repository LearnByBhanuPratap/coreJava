package methodOverriding;

public class TestRateOfInterest {

	public static void main(String[] args) {

		HDFCBank hDFCBank = new HDFCBank();

		hDFCBank.rateOfInterest();

		ICICI iCICI = new ICICI();

		iCICI.rateOfInterest();

		SBI sBI = new SBI();

		sBI.rateOfInterest();
	}

}
