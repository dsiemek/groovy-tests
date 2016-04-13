List<Integer> list = [56, '9', 74]
def max = list.max{item ->
    (item < 50) ? item: null
}

println(list.max())
println(max)


//println(('9' as Character) as Integer)