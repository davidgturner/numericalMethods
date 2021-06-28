public class Pyramid {

	/**
	 * pyramidal numbers
	 */
	private int[] pyra;

	private int[] sums;

	private String[] addition;

	/**
	 * constructor with size m
	 */
	public Pyramid(int n) {
		addition = new String[5000];
		int i = 0;
		int p = 0;
		while (p < n) {
			p = pyramid(i);
			//System.out.println(p);
			i++;
		}
		pyra = new int[i];
		i = 0;
		p = 0;
		while (p < n) {
			p = pyramid(i);
			pyra[i] = p;
			i++;
		}
	}

	/**
	 * computes the mth pyramid number
	 * Precondition: m>1
	 */
	public int pyramid(int m) {
		int p = 0;
		p = ((m - 1) * m * (m + 1)) / 6;
		return p;
	}

	/**
	 * prints the pyramid numbers up to n
	 */
	public void printData() {
		int p = 0;
		System.out.print("m      P(m)");
		System.out.println();
		for (int i = 2; i < pyra.length; i++) {
			System.out.print(i + "  " + p);
			System.out.println();
		}
	}

	/**
	 public void decompose()
	 {
	 System.out.print("Integer   #pyrimidal   combination");
	 System.out.println();

	 for(int i=0;i<=20;i++)
	 {
	 System.out.print(i + "      ");
	 System.out.print(whichOne(i));
	 System.out.print(addition);
	 System.out.println();
	 }

	 }
	 */
	/**
	 * MUST GIVE A VALUE LESS THAN 5 or there is a problem
	 * calculates the total number of pyrimdal numbers for a particualr i
	 * for example: 1 is 1, 2 is 2 3 is 3 and 4 is 1.
	 */
	public String total1(int integer) {
		int temp = 0;
		String a = "";
		//we are trying to find 2 for now
		for (int i = 0; i < pyra.length; i++) {
			//first check to see if the integer is equal to a pyramid number
			if (pyra[i] == integer) {
				temp = 1;
				a = "" + "[P(" + i + ")]";
				//System.out.print("P(" + temp + ")");
			}

		}
		//if temp returns 0 then it is not found and not 1
		return a;
	}

	public int total1a(int integer) {
		int temp = 0;

		//we are trying to find 2 for now
		for (int i = 0; i < pyra.length; i++) {
			//first check to see if the integer is equal to a pyramid number
			if (pyra[i] == integer) {
				temp = 1;
				//System.out.print("P(" + temp + ")");
			}

		}
		//if temp returns 0 then it is not found and not 1
		return temp;
	}

	public String total2(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++) {
				//sums[i][j] = ;
				if (pyra[i] + pyra[j] == integer) {
					temp = 2;
					a = "[P(" + i + ")" + "+ P(" + j + ")]";
				}
			}
		return a;
	}

	public int total2a(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++) {
				//sums[i][j] = ;
				if (pyra[i] + pyra[j] == integer) {
					temp = 2;
					a = "[P(" + pyra[i] + ")" + "P(" + pyra[j] + ")]";
				}
			}
		return temp;
	}

	public String total3(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++)
				for (int k = 0; k < pyra.length; k++) {
					if (pyra[i] + pyra[j] + pyra[k] == integer) {
						temp = 3;
						a = "[P(" + i + ")" + " + P(" + j + ")" + " + P(" + k + ")]";
					}
				}
		return a;
	}

	public int total3a(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++)
				for (int k = 0; k < pyra.length; k++) {
					if (pyra[i] + pyra[j] + pyra[k] == integer) {
						temp = 3;
						a = "[P(" + i + ")" + "P(" + j + ")" + "P(" + k + ")]";
					}
				}
		return temp;
	}

	public String total4(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++)
				for (int k = 0; k < pyra.length; k++)
					for (int l = 0; l < pyra.length; l++) {
						if (pyra[i] + pyra[j] + pyra[k] + pyra[l] == integer) {
							temp = 4;
							a = "[P(" + i + ")" + " + P(" + j + ") " + "+ P(" + k + ") + P(" + l + ")]";
						}
					}
		return a;
	}

	public int total4a(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++)
				for (int k = 0; k < pyra.length; k++)
					for (int l = 0; l < pyra.length; l++) {
						if (pyra[i] + pyra[j] + pyra[k] + pyra[l] == integer) {
							temp = 4;
							a = "[P(" + pyra[i] + ")" + "P(" + pyra[j] + ")]" + "P(" + pyra[k] + ") P(" + pyra[l] + ")";
						}
					}
		return temp;
	}

	public String total5(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++)
				for (int k = 0; k < pyra.length; k++)
					for (int l = 0; l < pyra.length; l++)
						for (int m = 0; m < pyra.length; m++) {

							if (pyra[i] + pyra[j] + pyra[k] + pyra[l] + pyra[m] == integer) {
								temp = 5;
								a = "[P(" + i + ")" + " + P(" + j + ")" + " + P(" + k + ") + P(" + l + ") + P(" + m + ")]";
							}
						}
		return a;
	}

	public int total5a(int integer) {
		String a = "";
		int temp = 0;
		for (int i = 0; i < pyra.length; i++)
			for (int j = 0; j < pyra.length; j++)
				for (int k = 0; k < pyra.length; k++)
					for (int l = 0; l < pyra.length; l++)
						for (int m = 0; m < pyra.length; m++) {

							if (pyra[i] + pyra[j] + pyra[k] + pyra[l] + pyra[m] == integer) {
								temp = 5;
								a = "[P(" + pyra[i] + ")" + "P(" + pyra[j] + ")" + "P(" + pyra[k] + ") P(" + pyra[l] + ") P(" + pyra[m] + ")]";
							}
						}
		return temp;
	}

	//determines which occurence it is
	public void whichOne() {


		System.out.print("Integer   #pyrimidal   combination");
		System.out.println();
		//p.print("Integer   #pyrimidal   combination");
		//p.println();


		int temp = 0;
		String a = "";
		for (int i = 0; i <= 5000; i++) {
			if (total1a(i) == 1) {
				temp = 1;
				a = total1(i);
			} else if (total2a(i) == 2) {
				temp = 2;
				a = total2(i);
			} else if (total3a(i) == 3) {
				temp = 3;
				a = total3(i);
			} else if (total4a(i) == 4) {
				temp = 4;
				a = total4(i);
			} else if (total5a(i) == 5) {
				temp = 5;
				a = total5(i);
			}
			System.out.print(i + "      ");
			System.out.print(temp + "   ");
			System.out.print(a);
			System.out.println();

			temp = 0;
			a = "";
		}


	}

	public int find(int num) {
		int sum = 1;
		// loop from the last index back adding up as you go
		for (int i = pyra.length - 1; i > 0; i--) {
			//to return 1
			if (num == pyra[i])
				return 1;
			else if (pyra[i] < num) {
				//to return 2
				sum += 1;
				if (sum == pyra[i])
					return sum;
			}
		}

		return sum;
		/**
		 else if(pyra[i] < num)
		 {
		 //to return 2
		 sum += pyra[i];
		 if(sum == pyra[i])
		 return sum;

		 while(sum != pyra[i])

		 }
		 */


	}

	public static void main(String[] args) {

		Pyramid pyr = new Pyramid(5000);
		pyr.whichOne();

	}
}


