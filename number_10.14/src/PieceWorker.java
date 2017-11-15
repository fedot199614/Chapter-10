
public class PieceWorker extends Employee {
     private double wage;
     private int pieces;
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber,double wage,int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage>0) {
		this.wage = wage;
		}else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
			
		}
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		if(pieces>0) {
		this.pieces = pieces;
		}else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}
	}

	@Override
	public double earnings() {
		return pieces*wage;
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %d","employee",super.toString(),"wage",getWage(),"pieces",getPieces());
	}
	
}
