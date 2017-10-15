
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
	public Node start()
	{
		return place40;
	}
	
	
	
	public Node place40 = new Node("Go",null);
	int[] temp = {50,200,600,1400,1700};
	Node place39 = new CityNode("Mayfair","Blue",400,temp,2000,200,200,place40);
	Node place38 = new Node("SuperTax",place39);//inc
	int[] temp1={35,175,500,1100,1300};
	Node place37 = new CityNode("ParkLane","Blue",350,temp1,1500,200,200,place38);
	Node place36 = new Node("Chance",place37);//chance
	
	Node place35 = new Node("LiverPoolStation",place36);//st
	int[] temp2 = {28,150,450,1000,1200};
	Node place34 = new CityNode("BondStreet","Green",320,temp2,1400,200,200,place35);
	Node place33 = new Node("CommunityChest",place34);//cc
	int[] temp3= {26,130,390,900,1100};
	Node place32 = new CityNode("OxfordStreet","Green",300,temp3,1275,200,200,place33);
	int[] temp4= {26,130,390,900,1100};
	Node place31 = new CityNode("RegentStreet","Green",300,temp4,1275,200,200,place32);
	Node place30 = new Node("Jail",place31);//wait for a turn in jail
	int[] temp5 = {24,120,360,850,1025};
	Node place29 = new CityNode("Picadilly","Yellow",280,temp5,1200,150,150,place30);
	Node place28 = new Node("WaterWorks",place29);//st
	int[] temp6 = {22,110,330,800,975};
	Node place27 = new CityNode("CoventryStreet","Yellow",260,temp6,1150,150,150,place28);
	int[] temp7 = {22,110,330,800,975};
	Node place26 = new CityNode("LeicesterSquare","Yellow",260,temp7,1150,150,150,place27);
	Node place25 = new Node("FenchurchStation",place26);//st
	int[] temp8 = {20,100,300,750,925};
	Node place24 = new CityNode("TrafalgarSquare","Red",240,temp8,1100,150,150,place25);
	int[] temp9 = {18,90,250,700,875};
	Node place23 = new CityNode("FleetStreet","Red",220,temp9,1050,150,150,place24);
	Node place22 = new Node("Chance",place23);//chance
	int[] temp10 = {18,90,250,700,875};
	Node place21 = new CityNode("Strand","Red",220,temp10,1050,150,150,place22);
	Node place20 = new Node("FreePark",place21);//wait for a turn in free park
	int[] temp11 = {16,80,220,600,800};
	Node place19 = new CityNode("VineStreet","Orange",200,temp11,1000,100,100,place20);
	int[] temp12 = {14,70,200,550,750};
	Node place18 = new CityNode("MarlboroughStreet","Orange",180,temp12,950,100,100,place19);
	Node place17 = new Node("community chest",place18);//cc
	int[] temp13 = {14,70,200,550,750};
	Node place16 = new CityNode("BowStreet","Orange",180,temp13,950,100,100,place17);
	Node place15 = new Node("MaryleboneStation",place16);
	int[] temp14 = {12,60,180,500,700};
	Node place14 = new CityNode("NorthumberlandAvenue","Pink",160,temp14,900,100,100,place15);
	int[] temp15 = {10,50,150,450,625};
	Node place13 = new CityNode("WhiteHall","Pink",140,temp15,750,100,100,place14);
	Node place12 = new Node("ElectricCompany",place13);//inc
	int[] temp16 = {10,50,150,450,625};
	Node place11 = new CityNode("PallMall","Pink",140,temp16,750,100,100,place12);
	Node place10 = new Node("Jail",place11);//wait for a turn in jail
	int[] temp17 = {8,40,100,300,450};
	Node place9 = new CityNode("PentonvilleRoad","LightBlue",120,temp17,600,50,50,place10);
	int[] temp18 = {6,30,90,270,400};
	Node place8= new CityNode("EustonRoad","LightBlue",100,temp18,550,50,50,place9);
	Node place7 = new Node("chance",place8);//chance
	int[] temp19 = {6,30,90,270,400};
	Node place6 = new CityNode("TheAngelIslington","LightBlue",100,temp19,550,50,50,place7);
	Node place5 = new Node("KingsCrossStation",place6);//st
	Node place4 = new Node("Incometax",place5);//inc
	int[] temp20={4,20,60,180,320};
	Node place3 = new CityNode("Whitechapelroad","Brown",60,temp20,450,50,50,place4);
	Node place2 = new Node("Community Chest",place3);//cc
	int[] temp21 = {2,10,30,90,160};
	Node place1 = new CityNode("OldKentRoad","Brown",60,temp21,250,50,50,place2);
	
	HashMap<String,Node> b = new HashMap<String,Node>();
	
	
	public Node place(String p)
	{
		return b.get(p);
	}
	
	public Board()
	{
	    place40.next=place1;
	    b.put("Go",place40);
	    b.put("OldKentRoad",place39);
	    b.put("Community Chest",place38);
	    b.put("Whitechapelroad",place37);
	    b.put("Incometax",place36);
	    b.put("KingsCrossStation",place35);
	    b.put("TheAngelIslington",place34);
	    b.put("chance",place33);
	    b.put("EustonRoad",place32);
	    b.put("PentonvilleRoad",place31);
	    b.put("Jail",place30);
	    b.put("PallMall",place29);
	    b.put("ElectricCompany",place28);
	    b.put("WhiteHall",place27);
	    b.put("NorthumberlandAvenue",place26);
	    b.put("MaryleboneStation",place25);
	    b.put("BowStreet",place24);
	    b.put("community chest",place23);
	    b.put("MarlboroughStreet",place22);
	    b.put("VineStreet",place21);
	    b.put("FreePark",place20);
	    b.put("Strand",place19);
	    b.put("Chance",place18);
	    b.put("FleetStreet",place17);
	    b.put("TrafalgarSquare",place16);
	    b.put("FenchurchStation",place15);
	    b.put("LeicesterSquare",place14);
	    b.put("CoventryStreet",place13);
	    b.put("WaterWorks",place12);
	    b.put("Picadilly",place11);
	    b.put("Jail",place10);
	    b.put("RegentStreet",place9);
	    b.put("OxfordStreet",place8);
	    b.put("CommunityChest",place7);
	    b.put("BondStreet",place6);
	    b.put("LiverPoolStation",place5);
	    b.put("Chance",place4);
	    b.put("ParkLane",place3);
	    b.put("SuperTax",place2);
	    b.put("Mayfair",place1);
	}
}
