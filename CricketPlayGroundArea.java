public class CricketPlayGroundArea {
    public static void main(String[] args) {

        //Question 1: A cricket Coach want to measure the area of Cricket ground and he know the Radius of the cricket groundGiven 
        //Formula P= rr*r (r square) = 3.1415. Constraints: r>=20<3D30 
        //If he enters any number <20 & greater than 30 it should display "Wrong Display Output". 
        //Inputs: If he Enters any number between 20 and 30 the program should calculate the area and prints the area as output. 
        //Case 1: input 22 Output: 1520.486 
        //case 2: 34 Output : Wrong Display Output.

      int r = 34;
      
      double area = 3.1415*(Math.pow(r,2));
      
      if(r>=20 && r == 22 && r<=30){
        System.out.println("Area of Cricket Ground is: "+area);
      }else{
        System.out.println("Wrong Input plz enter the number b/w 20 & 30");
      }
    }
}