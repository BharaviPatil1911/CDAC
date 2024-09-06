class Discount{
    public static void main(String[] args){
        double total=400;
        double discountpercentage=0;
        boolean userhasmenbershipcard=true;
        if(total>=1000){
           discountpercentage=20.0;
        }
        else if(total>=500 && total<=999){
            discountpercentage=10.0;
        }
         else{
            discountpercentage=5.0;
        }
        if(userhasmenbershipcard){
             discountpercentage=5.0;
        }
      double discount=(discountpercentage/100)*total;
      double final_price=(total-discount);
    //   System.out.println(discount);
    //    System.out.println(final_price);
        System.out.println("Total Purchase: Rs." + total);
        System.out.println("Discount Applied: " + discountpercentage + "%");
        System.out.println("Discount Amount: Rs." + discount);
        System.out.println("Final Price After Discount: Rs." + final_price);
    }
}

Output = 
Total Purchase: Rs.400.0
Discount Applied: 5.0%
Discount Amount: Rs.20.0
Final Price After Discount: Rs.380.0