import groovy.sql.Sql

class Checker {
    void doIt(doIt){
//        assert doIt instanceof String
    }
}

def checker = new Checker()
def x = 13
checker.doIt("""doIt
                ${x}"""
)
new Sql().rows("select * from x")
