object Question1 extends App(){
    def main(amount:Double):Double=amount match{

       case x if x<=20000=>x*0.02
       case x if x<=200000=>x*0.04
       case x if x<=2000000=>x*0.035
       case x if x>200000=>x*0.065
    
}
     println("Enter the amount of deposit:")
     val amount=scala.io.StdIn.readDouble()
     println("The inetrest is:"+main(amount))


}