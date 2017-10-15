
public class ChanceNode extends Node
{
	ChanceCard current;
	//the cards objects of type ChanceCard are to be created here
	ChanceCard c1=new ChanceCard("Advance to GO ",null,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Advancing to GO ");
		}
	});
	ChanceCard c2=new ChanceCard(" Bank Error in your favour,Collect $200",c1,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $200");
		}
	});
	ChanceCard c3=new ChanceCard("From Sale of stock,you get $50",c2,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $50");
		}
	});
	ChanceCard c4=new ChanceCard("Annuity Matures,Collect $100",c3,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $100");
		}
	});
	ChanceCard c5=new ChanceCard("It is your B'day,Collect $10 From Each Player",c4,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $10 from each player");
		}
	});
	ChanceCard c6=new ChanceCard("Income Tax refund,Collect $20",c5,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $20");
		}
	});
	ChanceCard c7=new ChanceCard("Goto Jail.Move directly to jail.Do not pass GO.Do Not collect $200",c6,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Moving to Jail");
		}
	});
	ChanceCard c8=new ChanceCard("Drunk in charge.Pay a fine of $20",c7,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Deducting $20 from you're account");
		}
	});
	ChanceCard c9=new ChanceCard("Doctor's Fee,Pay $50",c8,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Deducting $50");
		}
	});
	ChanceCard c10=new ChanceCard("You hav won $10 in Quiz Contest.",c9,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $10");
		}
	});
	
	public void visit(Player p)
	{
		current.run(p);
		current=current.next;
	}
}
/*
CommunityChest q1 = new CommunityChest("Advance to GO ", q2);
	CommunityChest q2 = new CommunityChest(" Bank Error in your favour,Collect $200", q3);
	CommunityChest q3 = new CommunityChest("From Sale of stock,you get $50", q4);
	CommunityChest q4 = new CommunityChest("Annuity Matures,Collect $100", q5);
	CommunityChest q5 = new CommunityChest("It is your B'day,Collect $10 From Each Player", q6);
	CommunityChest q6 = new CommunityChest("Income Tax refund,Collect $20", q7);
	CommunityChest q7 = new CommunityChest("Goto Jail.Move directly to jail.Do not pass GO.Do Not collect $200, q8);
	CommunityChest q8 = new CommunityChest("Drunk in charge.Pay a fine of $20", q9);
	CommunityChest q9 = new CommunityChest("Doctor's Fee,Pay $50", q10);
	CommunityChest q10 = new CommunityChest("You hav won $10 in Quiz Contest.", q1);*/
