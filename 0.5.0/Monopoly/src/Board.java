
import java.io.*;
import java.util.*;
import java.lang.Object;
public class Board
{
    /* It has been found that the board places (of Node type) is to be available in many classes and thus cannot be confined to a single one.
	So, this class will store the board(and subsequently have methods which return) in two ways;
	1. A circular linked list
	2. A key value pair of Nodes with the key being an unique identification of the same, so the name is used.
		*/
	
	
	
	public Node place40 = new Node("Go",null);
	int[] temp = {50,200,600,1400,1700};
	Node place39 = new Node_City("Mayfair","Blue",400,temp,2000,200,200,place40);
	Node place38 = new Node_Tax("Super Tax",200,place39);//inc
	int[] temp1={35,175,500,1100,1300};
	Node place37 = new Node_City("Park Lane","Blue",350,temp1,1500,200,200,place38);
	Node place36 = new Node("Chance",place37);//chance
	//add rent to 000!
	Node place35 = new Node_Utility("Liver Pool Station",200,000,place36);//st
	int[] temp2 = {28,150,450,1000,1200};
	Node place34 = new Node_City("Bond Street","Green",320,temp2,1400,200,200,place35);
	Node place33 = new Node("Community Chest",place34);//cc
	int[] temp3= {26,130,390,900,1100};
	Node place32 = new Node_City("Oxford Street","Green",300,temp3,1275,200,200,place33);
	int[] temp4= {26,130,390,900,1100};
	Node place31 = new Node_City("Regent Street","Green",300,temp4,1275,200,200,place32);
	Node place30 = new Node("Go to Jail",place31);//wait for a turn in jail
	int[] temp5 = {24,120,360,850,1025};
	Node place29 = new Node_City("Picadilly","Yellow",280,temp5,1200,150,150,place30);
	//add rent to 000!
	Node place28 = new Node_Utility("WaterWorks",150,000,place29);//st
	int[] temp6 = {22,110,330,800,975};
	Node place27 = new Node_City("Coventry Street","Yellow",260,temp6,1150,150,150,place28);
	int[] temp7 = {22,110,330,800,975};
	Node place26 = new Node_City("Leicester Square","Yellow",260,temp7,1150,150,150,place27);
	//add rent to 000!
	Node place25 = new Node_Utility("Fenchurch Station",200,000,place26);//st
	int[] temp8 = {20,100,300,750,925};
	Node place24 = new Node_City("Trafalgar Square","Red",240,temp8,1100,150,150,place25);
	int[] temp9 = {18,90,250,700,875};
	Node place23 = new Node_City("Fleet Street","Red",220,temp9,1050,150,150,place24);
	Node place22 = new Node("Chance",place23);//chance
	int[] temp10 = {18,90,250,700,875};
	Node place21 = new Node_City("Strand","Red",220,temp10,1050,150,150,place22);
	Node place20 = new Node("Free Parking",place21);//wait for a turn in free park
	int[] temp11 = {16,80,220,600,800};
	Node place19 = new Node_City("Vine Street","Orange",200,temp11,1000,100,100,place20);
	int[] temp12 = {14,70,200,550,750};
	Node place18 = new Node_City("Marlborough Street","Orange",180,temp12,950,100,100,place19);
	Node place17 = new Node("Community Chest",place18);//cc
	int[] temp13 = {14,70,200,550,750};
	Node place16 = new Node_City("Bow Street","Orange",180,temp13,950,100,100,place17);
	//add rent to 000!
	Node place15 = new Node_Utility("Marylebone Station",200,000,place16);
	int[] temp14 = {12,60,180,500,700};
	Node place14 = new Node_City("Northumberland Avenue","Pink",160,temp14,900,100,100,place15);
	int[] temp15 = {10,50,150,450,625};
	Node place13 = new Node_City("WhiteHall","Pink",140,temp15,750,100,100,place14);
	//add rent to 000!
	Node place12 = new Node_Utility("Electric Company",150,000,place13);//inc
	int[] temp16 = {10,50,150,450,625};
	Node place11 = new Node_City("Pall Mall","Pink",140,temp16,750,100,100,place12);
	Node place10 = new Node("Jail",place11);//wait for a turn in jail
	int[] temp17 = {8,40,100,300,450};
	Node place9 = new Node_City("Pentonville Road","LightBlue",120,temp17,600,50,50,place10);
	int[] temp18 = {6,30,90,270,400};
	Node place8= new Node_City("Euston Road","LightBlue",100,temp18,550,50,50,place9);
	Node place7 = new Node("Chance",place8);//chance
	int[] temp19 = {6,30,90,270,400};
	Node place6 = new Node_City("The Angel, Islington","LightBlue",100,temp19,550,50,50,place7);
	//add rent to 000!
	Node place5 = new Node_Utility("Kings Cross Station",200,000,place6);//st
	Node place4 = new Node_Tax("Income Tax",200,place5);//inc
	int[] temp20={4,20,60,180,320};
	Node place3 = new Node_City("Whitechapel Road","Brown",60,temp20,450,50,50,place4);
	Node place2 = new Node("Community Chest",place3);//cc
	int[] temp21 = {2,10,30,90,160};
	Node place1 = new Node_City("Old Kent Road","Brown",60,temp21,250,50,50,place2);
	
	HashMap<String,Node> b = new HashMap<String,Node>();
	

	public Node start()
    {
        return place40;
    }
	public Node place(String p)
	{
		return b.get(p);
	}
	
	public Board()
	{
	    place40.next=place1;
	    b.put("Old Kent Road",place1);
	    b.put("Community Chest",place2);
	    b.put("Whitechapel Road",place3);
	    b.put("Income Tax",place4);
	    b.put("Kings Cross Station",place5);
	    b.put("The Angel, Islington",place6);
	    b.put("Chance",place7);
	    b.put("Euston Road",place8);
	    b.put("Pentonville Road",place9);
	    b.put("Jail",place10);
	    b.put("Pall Mall",place11);
	    b.put("Electric Company",place12);
	    b.put("WhiteHall",place13);
	    b.put("Northumberland Avenue",place14);
	    b.put("Marylebone Station",place15);
	    b.put("Bow Street",place16);
	    b.put("Community Chest",place17);
	    b.put("Marlborough Street",place18);
	    b.put("Vine Street",place19);
	    b.put("Free Parking",place20);
	    b.put("Strand",place21);
	    b.put("Chance",place22);
	    b.put("Fleet Street",place23);
	    b.put("Trafalgar Square",place24);
	    b.put("Fenchurch Station",place25);
	    b.put("Leicester Square",place26);
	    b.put("Coventry Street",place27);
	    b.put("WaterWorks",place28);
	    b.put("Picadilly",place29);
	    b.put("Go to Jail",place30);
	    b.put("Regent Street",place31);
	    b.put("Oxford Street",place32);
	    b.put("Community Chest",place33);
	    b.put("Bond Street",place34);
	    b.put("Liver Pool Station",place35);
	    b.put("Chance",place36);
	    b.put("Park Lane",place37);
	    b.put("Super Tax",place38);
	    b.put("Mayfair",place39);
	    b.put("Go",place40);
	    
	}
}
