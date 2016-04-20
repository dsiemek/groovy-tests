
List<Integer> list = [58, '9', 74]
def max = list.max{item ->
    println item.class
    (item < 70) ? item: null
}

//println(list.max())
println list
println(max)
println(max.class)


//println(('9' as Character) as Integer)