
public class Node_Chance extends Node
{
    Card_Chance current;
    
    Board b = new Board();
    //the cards objects of type Card_Chance are to be created here
    Card_Chance c1 = new Card_Chance("Go to jail!",null,new Card_Operation() { 
        public void run(Player p)
        {
            System.out.print("Your in Jail!");
            p.currentlocation=b.place10;
            
        }
    });
    
    Card_Chance c2 = new Card_Chance("Advance to TrafalgarSquare,If you pass Go Collect $200 ",c1,new Card_Operation(){
        public void run(Player p)
        {
            boolean check = false;
            Node n = p.currentlocation;
            while(n!= b.place24)
            {
                
                if(n == b.place40) 
                {
                    check = true;
                }
                n = n.next;
            }
            
                if(check=true) 
                {
                    System.out.print("Receieving $200");
                    p.money+=200;
                    p.currentlocation = b.place24;
                }
            
                else 
                    p.currentlocation = b.place24;
        }
    });
    
    
      Card_Chance c3=new Card_Chance("Take a trip to MaryLebone Station,If you pass GO Collect $200",c2,new Card_Operation(){
          public void run(Player p)
            {
                boolean check = false;
              Node n = p.currentlocation;
                while(n!= b.place15)
                {
                    
                    if(n == b.place40) 
                    {
                        check = true;
                    }
                    n = n.next;
                }
                
                    if(check=true) 
                    {
                        System.out.print("Receieving $200");
                        p.money+=200;
                        p.currentlocation = b.place15;
                    }
                
                    else 
                        p.currentlocation = b.place15;
              
            }
    });
    Card_Chance c4 = new Card_Chance("Advance to GO",c3,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Your at Start!.Receieving $200");
            p.currentlocation=b.place40;
            p.money+=200;
            
        }
    });
    Card_Chance c5 = new Card_Chance("BankPays you dividend of $50",c4,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Receive $50");
            
            p.money+=50;
            
        }
    });
    Card_Chance c6 = new Card_Chance("You hav won a crossword competion collect $100",c5,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Receieving $100");
            
            p.money+=100;
            
        }
    });
    
    Card_Chance c7 = new Card_Chance("Your building loan matures receive $150",c6,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Receieving $150");
            
            p.money+=150;
            
        }
    });
    Card_Chance c8 = new Card_Chance("Goto Jail.Move directly to jail",c7,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Your in jail!");
            p.currentlocation = b.place10;
            
            
        }
    });
    Card_Chance c9 = new Card_Chance("Drunk in charge.Pay a fine of $20",c8,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Deducting $20");
            
            p.money-=20;
            
        }
    });
    
    Card_Chance c10 = new Card_Chance("GO to PallMall",c9,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("Receieving $10");
            
            p.money+=10;
            
        }
    });
    
    Card_Chance c11 = new Card_Chance("Advance to MAYFAIR",c10,new Card_Operation() {
        public void run(Player p)
        {
            System.out.print("You're advancing to MayFair");
            p.currentlocation= b.place39;
            
            
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
/////                                                                                               ChanceNode q9 = new ChanceNode("GO Back 3 spaces", q10);
ChanceNode q10 = new ChanceNode("Advance to MAYFAIR", q1);
Node head = q1;
Node cur  = head;
*/