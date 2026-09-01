public class pizza {
    private boolean veg;
    private float price;
    private float extracheese=100;
    private float extratopings=150;
    private float takeawayprice=20;
    private float basepizzaprice;
    private boolean isExtracheeseAdded=false;
    private boolean isExtratopingsAdded=false;
    private boolean isTakeAway=false;

    public pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=500;
        }
        this.basepizzaprice=this.price;
    }
    public void addextracheese(){
        this.isExtracheeseAdded=true;
        this.price+=extracheese;
    }
    public void addextratopings(){
        this.isExtratopingsAdded=true;
        this.price+=extratopings;
    }
    public void takeaway(){
        this.isTakeAway=true;
        this.price+=takeawayprice;
    }
    public void getbill(){
        String bill="";
        System.out.println("pizza : "+this.basepizzaprice);
        if(isExtracheeseAdded){
            bill+="extra cheese added : "+this.extracheese+"\n";
        }
        if(isExtratopingsAdded){
            bill+="extra topings added : "+this.extratopings+"\n";
        }
        if(isTakeAway){
            bill+="take away added : "+this.takeawayprice+"\n";
        }
        bill+="Total bill :"+this.price+"\n";
        System.out.println(bill);
    }
}
