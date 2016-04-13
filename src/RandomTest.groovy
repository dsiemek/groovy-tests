def random = new Random()

def randomList = []

0..10.each {randomList << random.nextInt()}

println(randomList.max{null})
println(randomList[0])