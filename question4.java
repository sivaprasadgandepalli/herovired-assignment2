import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
class ResidentialSociety{
    String societyName;
    String location;
    String SecretoryName;
    void show(){
        System.out.print("societyName: "+societyName+"\nlocation:"+location+"\nSecretoryName: "+SecretoryName);
    }
}
class Building extends ResidentialSociety{
    String buildingName;
    int totalNumberOfApartments;
}
class Apartment extends Building{
    int apartmentNumber;
    String ownerName; 
    String electricMeterNumber;
    Apartment(int apartmentNumber,String buildingName,String ownerName,String electricMeterNumber){
        this.apartmentNumber=apartmentNumber;
        this.buildingName=buildingName;
        this.electricMeterNumber=electricMeterNumber;
        this.ownerName=ownerName;
    }
    void display()
    {
        System.out.println("apartmentID: "+apartmentNumber+" buildingName: "+buildingName+
        " electricmeterNumber: "+electricMeterNumber+" ownerName: "+ownerName);
    }
}
public class question4 {
    static void menuDisplay()
    {
        System.out.println("a. View Apartment details\nb. View Building Details\nc. View Society Details");
        System.out.println("enter your choice below:");
    }
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        ResidentialSociety RSobj=new ResidentialSociety();
        RSobj.societyName="Galaxy-Apartment Residential Society";
        RSobj.location=" Banjara Hills,Hyderabad";
        RSobj.SecretoryName="Mr.K.Sudheer Reddy";
        Building buildingA=new Building();
        Building buildingB=new Building();
        Building buildingC=new Building();
        Apartment apObj[]=new Apartment[30];
        menuDisplay();
        char ch=sc.next().charAt(0);
        if(ch=='a')
        {
            int apartmentNumber=0;
            String buildingName="";
            String ownerName="";
            String electricMeterNumber="";
            String line = "";  
            String splitBy = ","; 
            BufferedReader br=new BufferedReader(new FileReader("demoData.csv"));
            int i=1;
            while ((line = br.readLine()) != null && i<30)
            {  
                String[] Tdata = line.split(splitBy);
                int var=Integer. parseInt(Tdata[0]);
                apObj[i]=new Apartment(var,Tdata[1],Tdata[2],Tdata[3]);
                i++;

            }
            br.close();
            for(int j=1;j<30;j++)
            {
                apObj[j].display();
            }
        }
        else if(ch=='b')
        {
            System.out.println("1.Building A\n2.Building B\n3.Building C");
            System.out.println("enter your choice:");
            int choi=sc.nextInt();
            if(choi==1)
            {
                buildingA.buildingName="A";
                buildingA.totalNumberOfApartments=10;
                System.out.println("buildingName :"+buildingA.buildingName+" totalNumberOfApartments: "+buildingA.totalNumberOfApartments);
            }
            else if(choi==2)
            {
                buildingA.buildingName="B";
                buildingA.totalNumberOfApartments=10;
                System.out.println("buildingName :"+buildingA.buildingName+" totalNumberOfApartments: "+buildingA.totalNumberOfApartments);
            }
            else{
                buildingA.buildingName="C";
                buildingA.totalNumberOfApartments=10;
                System.out.println("buildingName :"+buildingA.buildingName+" totalNumberOfApartments: "+buildingA.totalNumberOfApartments);
            }
        }
        else if(ch=='c')
        {
            RSobj.societyName="Galaxy-Apartment Residential Societ";
            RSobj.location=" Banjara Hills,Hyderabad";
            RSobj.SecretoryName="Mr.K.Sudheer Reddy";
            RSobj.show();
        }
    }
}
