
public class ChanceNode extends Node
{
	ChanceCard current;
	//the cards objects of type ChanceCard are to be created here
	ChanceCard c1=new ChanceCard("Go to jail!",null,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Proceeding to Jail,brace yourself!");
		}
	});
	ChanceCard c2=new ChanceCard("Advance to TrafalgarSquare,IF you pass GO Collect $200",c1,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Advancing to TrafalgarSquare");
		}
	});
	ChanceCard c3=new ChanceCard("Take a trip to MaryLebone Station,If you pass GO Collect $200",c2,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Moving to MaryLebone Station");
		}
	});
	ChanceCard c4=new ChanceCard("Advance to GO",c3,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Lets GO!");
		}
	});
	ChanceCard c5=new ChanceCard("Your building loan matures receive $150",c4,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $150");
		}
	});
	ChanceCard c6=new ChanceCard("BankPays you dividend of $50",c5,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $50");
		}
	});
	ChanceCard c7=new ChanceCard("You hav won a crossword competion collect $100",c6,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Recieving $100");
		}
	});
	ChanceCard c8=new ChanceCard("Drunk in charge.Pay a fine of $20",c7,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Deducting $50 from you're account");
		}
	});
	ChanceCard c9=new ChanceCard("GO Back 3 spaces",c8,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Going back 3 spaces");
		}
	});
	ChanceCard c10=new ChanceCard("Advance to MAYFAIR",c9,new Card_Operation(){
       
		public void run(Player p)
		{
			System.out.print("Advancing to Mayfair");
		}
	});
	
	public void visit(Player p)
	{
		current.run(p);
		current=current.next;
	}
}
/*
ChanceNode q1 = new ChanceNode("Advance to TrafalgarSquare,IF you pass GO Collect $200", q2);
ChanceNode q2 = new ChanceNode("Take a trip to MaryLebone Station,If you pass GO Collect $200", q3);
ChanceNode q3 = new ChanceNode("Advance to GO", q4);
ChanceNode q4 = new ChanceNode("Your building loan matures receive $150", q5);
ChanceNode q5 = new ChanceNode("BankPays you dividend of $50", q6);
ChanceNode q6 = new ChanceNode("You hav won a crossword competion collect $100", q7);
ChanceNode q7 = new ChanceNode("Goto Jail.Move directly to jail.Do not pass GO.Do Not collect $200, q8);
ChanceNode q8 = new ChanceNode("Drunk in charge.Pay a fine of $20", q9);
ChanceNode q9 = new ChanceNode("GO Back 3 spaces", q10);
ChanceNode q10 = new ChanceNode("Advance to MAYFAIR", q1);
Node head = q1;
Node cur  = head;
*/
