import java.util.Scanner;
public class AMS {
public static void main(String [] args) {
Scanner id=new Scanner(System.in);

System.out.print("Anda Siapa = ");


String nama=id.nextLine();
int no_ktp;


switch(nama){
	
	case "muhaji" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 123 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;
	
	case "ascarina" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 456 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;

	case "rinto" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 789 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;
	
	case "rini" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 012 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;
	
	default:
	System.out.println("coba ulangi lagi");
	break;

class AMS
{
private String anda_siapa;
private int no_ktp;

public AMS(String Anda Siapa,int no ktp);
{ this.nama=nm;
  this.no_ktp=noktp;
}

public void tampilData()
{System.out.print("Anda Siapa	:"+ this.nama);
System.out.print("No ktp	:"+ this.no_ktp);
System.out.print("");
System.out.print("");
}
}



//close switch
}
}
}

