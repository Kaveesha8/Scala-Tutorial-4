object Question2{

    def isNegEvenOrOdd(x:Int):Unit = {
            if(x <= 0 ) {
                println("Negative/Zero")
            }
            else if(x%2 == 0){
                println("Even Number")
            }
            else {
                println("Odd Number")
            }
        }

    def main(args:Array[String]): Unit = {
     print("Enter  a Number :")
     var number=scala.io.StdIn.readInt()
     isNegEvenOrOdd(number)
        
    }

   
    

}