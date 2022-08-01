object Question2{
     
    def toUpper(str:String):String = str.toUpperCase()
    

    def toLower(str:String):String = str.toLowerCase()

    def formatNames(str:String, formatFunction: (String) => String) = formatFunction(str);
    

    def main(args:Array[String]): Unit = {

        println(formatNames("Benny",toUpper(_)))
        println(formatNames("Saman",toLower(_)))
        println(formatNames("Niroshan".substring(0,2),toUpper(_)) + formatNames("Niroshan".substring(2),toLower(_)))
        println(formatNames("Kumara".substring(0,1),toUpper(_)) + formatNames("Kumara".substring(1,5),toLower(_)) + formatNames("Kumara".substring(5),toUpper(_)))
    }

   

    

}