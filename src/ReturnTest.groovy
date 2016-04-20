class CountDown { int counter = 10 }

CountDown finalCountDown() {
    def countDown = new CountDown()
    try {
        def x = countDown.counter = --countDown.counter
        println x
        println countDown.counter
           countDown.counter = --countDown.counter
    } catch (ignored) {
        println "That will never happen. ${ignored.message}"
        countDown.counter = Integer.MIN_VALUE
    } finally {
        return countDown
    }
    3453
}

println finalCountDown().counter




//https://issues.apache.org/jira/browse/GROOVY-7065