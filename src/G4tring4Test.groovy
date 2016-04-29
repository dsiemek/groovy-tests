GString single(value){
    return "value(${value}) "
}


GString createGString(){
    return
    single(1) +
            single(2) +
            single(3) +
            single(4) +
            single(5) +
            single(6)
            single(7)
}

println(createGString())


