interface VehicleOne
{
    int  speed=90;
    public void distance();
}

interface VehicleTwo
{
    int distance=100;
    public void speed();
}

class Vehicle  implements VehicleOne,VehicleTwo
{
    public void distance(){
        int  distance=speed*100; 
        System.out.println("distance traveled is "+distance);
    }
    public void speed(){
        int speed=distance/100;
    }
}

class MultipleInhe
{
    public static void main(String args[]){
        System.out.println("Vehicle");
        Vehicle obj=new Vehicle();
        obj.distance();
        obj.speed();
    }
}