
public class Node_CommunityChest extends Node
{
    Card_CommunityChest current;
    Board b1 = new Board();
    //the cards objects of type Card_CommunityChest are to be created here
    Card_CommunityChest c1=new Card_CommunityChest("Advance to GO ",null,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Advancing to GO ");
            p.currentlocation = b1.place40;
        }
    });
    Card_CommunityChest c2=new Card_CommunityChest(" Bank Error in your favour,Collect $200",c1,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Recieving $200");
            p.money+=200 ;
        }
    });
    Card_CommunityChest c3=new Card_CommunityChest("From Sale of stock,you get $50",c2,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Recieving $50");
            p.money+=50;
        }
    });
    Card_CommunityChest c4=new Card_CommunityChest("Annuity Matures,Collect $100",c3,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Recieving $100");
            p.money+=100;
        }
    });
    Card_CommunityChest c5=new Card_CommunityChest("It is your B'day,Collect $10 From Each Player",c4,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Recieving $10 from each player");
            p.money+=10;
        }
    });
    Card_CommunityChest c6=new Card_CommunityChest("Income Tax refund,Collect $20",c5,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Recieving $20");
            p.money+=20;
        }
    });
    Card_CommunityChest c7=new Card_CommunityChest("Goto Jail.Move directly to jail.Do not pass GO.Do Not collect $200",c6,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Moving to Jail");
            p.currentlocation = b1.place10;
        }
    });
    Card_CommunityChest c8=new Card_CommunityChest("Drunk in charge.Pay a fine of $20",c7,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Deducting $20 from you're account");
            p.money=20;
        }
    });
    Card_CommunityChest c9=new Card_CommunityChest("Doctor's Fee,Pay $50",c8,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Deducting $50");
            p.money-=50;
        }
    });
    Card_CommunityChest c10=new Card_CommunityChest("You hav won $10 in Quiz Contest.",c9,new Card_Operation(){
       
        public void run(Player p)
        {
            System.out.print("Recieving $10");
            p.money+=10;
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
