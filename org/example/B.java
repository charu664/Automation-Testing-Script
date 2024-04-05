package org.example;


import org.testing.dataprovider.Pincodedata;
import org.testng.annotations.Test;

public class B extends A{
    //@Test
   // public void m1() throws InstantiationException {
    //    System.out.println("I am m1 of A");
   // }
  //  @Test(expectedExceptions = {ArrayIndexOutOfBoundsException.class,})
   // public void m2() {
    //    System.out.println("I am m2 of A");
  //  }
   // @Test(groups = "Sanity")
    //public void m3() {
       // System.out.println("I am m3 of A");
  //  }
@Test(dataProvider = "Pincodes Data",dataProviderClass = Pincodedata.class)
    public void printPinCodes(String pincode,String abc,String zxc,String hjk,String ert,String yui,String opl,String ghj){
        System.out.println(pincode+ " - " +abc+ " - " +zxc+ " - " +hjk+ " - " +ert+ " - " +yui+ " - " +opl+ " - " +ghj);

    }}