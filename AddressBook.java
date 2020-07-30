import java.util.Scanner;


class Details
{

	 private String FirstName;
	 private String LastName;
	 private String Addrress;
	 private String City;
	 private String State;
	 private int Zip;
	 private long PhoneNo;

	 @Override
	public String toString() {
		return "Details [FirstName=" + FirstName + ", LastName=" + LastName + ", Addrress=" + Addrress + ", City=" + City
				+ ", State=" + State + ", Zip=" + Zip + ", PhoneNo=" + PhoneNo +  "]";
	}
	 public Details(String FirstName, String LastName, String Addrress, String City, String State, int Zip,
			long PhoneNo) {

		 super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Addrress = Addrress;
		this.City = City;
		this.State = State;
		this.Zip = Zip;
		this.PhoneNo = PhoneNo;
	}

	 public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getAddrress() {
		return Addrress;
	}
	public void setAddrress(String Addrress) {
		this.Addrress = Addrress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int Zip) {
		this.Zip = Zip;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long PhoneNo) {
		this.PhoneNo = PhoneNo;
	}

}
public class AddressBook {

	public static void main(String[] args) {
		 String FirstName = null;
		 String LastName;
		 String Addrress;
		 String City;
		 String State;
		 int Zip;
		 long PhoneNo;
		 Details detail[]=new Details[100];
		 Scanner sc=new Scanner(System.in);
		 int i,count=0,choice=0,Dbook;
		 while(true)
		 {
			   System.out.println("Welcome To Addrress Book");
			   System.out.println("1. Add the Details");
				System.out.println("2. Update the Details");
				System.out.println("3. Delete the Details");
				System.out.println("4. Display all the Details");
				System.out.println("5. Search the Details By Phone Number");
				System.out.println("6. Exit");

				System.out.println("Please Enter your choice  : ");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Add Record");
					System.out.println(" ");
					System.out.println("Enter number of Details to be entered");
					Dbook = sc.nextInt();
					for(i=0;i<Dbook;i++)
					{
						System.out.println("Enter the First Name :");
						FirstName=sc.next();
						System.out.println("Enter the Last Name :");
						LastName=sc.next();
						System.out.println("Enter Addrress :");
						Addrress=sc.next();
						System.out.println("Enter State :");
						State=sc.next();
						System.out.println("Enter City :");
						City=sc.next();
						System.out.println("Enter Zip Code :");
						Zip=sc.nextInt();
						System.out.println("Enter Phone Number:");
						PhoneNo=sc.nextLong();
						detail[count++]=new Details(FirstName, LastName, Addrress, City, State, Zip, PhoneNo);
						System.out.println("Added the Record sucessfully.");
						System.out.println(" ");

					}
					break;
				case 2:
					   System.out.println("Updated Record");
					   System.out.println("Enter Phone Number for updation : ");
						PhoneNo = sc.nextLong();
						for (i = 0; i <= count; i++) {

							if (detail[i] != null && detail[i].getPhoneNo()==PhoneNo) {
								System.out.println("Enter First Name :");
								FirstName=sc.next();
								detail[i].setFirstName(FirstName);
								System.out.println("Enter Last Name :");
								LastName=sc.next();
								detail[i].setLastName(LastName);
								System.out.println("Enter Addrress :");
								Addrress=sc.next();
								detail[i].setAddrress(Addrress);
								System.out.println("Enter State :");
								State=sc.next();
								detail[i].setState(State);
								System.out.println("Enter City :");
								City=sc.next();
								detail[i].setCity(City);
								System.out.println("Enter Zip Code :");
								Zip=sc.nextInt();
								detail[i].setZip(Zip);
								System.out.println("AddrressBook Updated by PhoneNumber"+PhoneNo);
							}
						}
						break;

				case 3:
					System.out.println("Delete the record details");
					System.out.println(" ");
					System.out.println("Enter phone number for deletion : ");
					PhoneNo= sc.nextLong();
					for (i = 0; i <= count; i++) {

						if (detail[i] != null && detail[i].getPhoneNo()== PhoneNo) {
							detail[i] = null;
							System.out.println("Record deleted successfully");
						}
					}

					break;

				case 4:

					System.out.println("Display all Addrressbook record");
					System.out.println(" ");

					for (i = 0; i <count; i++) {

						System.out.println(detail[i]);

					}

					break;

				case 5:
					System.out.println("Search Addrressbook details by Phone Number: ");
					System.out.println(" ");
					System.out.println("Enter Phone Number for search : ");
					PhoneNo = sc.nextLong();
					for (i = 0; i < count; i++) {

						if (detail[i] != null && detail[i].getPhoneNo()==PhoneNo) {
							System.out.println(detail[i]);
						}
					}
					break;

				case 6:

					System.exit(0);

				default:
					System.out.println("Please enter correct choice");

				}
		 }

	}

}
