class CityNode extends Node
{

    
    String color;
    int price;
    int renthouse[] = new int[5];
    int renthotel;
    int housecost;
    int hotelcost;
    int mortgage_value;

    Player owner;
    int no_houses;
    int no_hotels;

    CityNode(String placename, String color, int price, int renthouse[],
            int renthotel, int housecost, int hotelcost, Node next)
    {
        super(placename,next);
        
        this.color = color;
        this.price = price;
        this.renthouse = renthouse;
        this.renthotel = renthotel;
        this.housecost = housecost;
        this.hotelcost = hotelcost;
       
    }
    
   

    public String getColor()
    {
        return color;
    }

    public int getPrice()
    {
        return price;
    }

    public int build_cost()
    {
        if (no_houses < 4)
            return housecost;
        else
            return housecost;
    }

    public void build()
    {

    }

    public int rent()
    {
        if (no_hotels == 1)
        {
            return (renthotel);
        } else
        {
            return (renthouse[no_houses]);
        }
    }
}