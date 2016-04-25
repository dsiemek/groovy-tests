
GString getA(){
    def a1 = 1
    " walue ${a1}"
}

GString getB(){
    def b1 = 2
    " walue ${b1}"
}

GString ab = getA() + getB()
println ab

GString cd = "${getA()} ${getB()}"
println cd




//https://issues.apache.org/jira/browse/GROOVY-5436