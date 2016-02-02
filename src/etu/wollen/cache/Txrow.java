package etu.wollen.cache;

//xlsx table row (abstract)
public abstract class Txrow {
	private int size;
	private String[] fld;
	
	public Txrow(int size){
		this.size = size;
		fld = new String[size];
	}
	
	public String get(int i) throws IndexOutOfBoundsException{
		if(i < 0 || i >= size){
			throw new IndexOutOfBoundsException("Field index out of range");
		}
		return fld[i];
	}
	
	public void set(int i, String str) throws IndexOutOfBoundsException{
		if(i < 0 || i >= size){
			throw new IndexOutOfBoundsException("Field index out of range");
		}
		fld[i] = str;
	}
}

//row of 1st table
class T1row extends Txrow{
	/*
	 * 0 = count number
	 * 1 = reg number
	 * 2 = FIO
	 * 3 = episode number
	 * 4 = med code
	 * 5 = service
	 * 6 = name of rest
	 * 7 = result
	 * 8 = measurement units
	 * 9 = date
	 * 10 = time
	 */
	public final static int size = 11;
	public T1row(){
		super(size);
	}
}

//row of 2nd table
class T2row extends Txrow{
	/*
	 * 0 = count number
	 * 1 = reg number
	 * 2 = FIO
	 * 3 = med card number
	 * 4 = status
	 * 5 = date
	 * 6 = data
	 */
	public final static int size = 7;
	public T2row(){
		super(size);
	}
}

//row of 3rd table
class T3row extends Txrow{
	/*
	 * 0 = count number
	 * 1 = reg number
	 * 2 = F
	 * 3 = I
	 * 4 = O
	 * 5 = episode number
	 * 6 = date of end
	 * 7 = time of end
	 * 8 = status
	 * 9 = date
	 * 10 = data
	 * 11 = doctor
	 */
	public final static int size = 12;
	public T3row(){
		super(size);
	}
}
