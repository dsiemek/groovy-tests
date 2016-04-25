println new Date()
x = "It is currently ${ new Date() }"
assert x.values[0] instanceof Date

y = "It is currently ${ writer -> writer << new Date()}"
assert y.values[0] instanceof Closure
sleep 5000
println x
println y



//http://groovy.jmiguel.eu/groovy.codehaus.org/Strings+and+GString.html
//http://programmingitch.blogspot.ca/2010/10/be-careful-using-gstrings-for-sql.html
//http://docs.groovy-lang.org/2.3.5/html/api/groovy/sql/Sql.html#expand(java.lang.Object)