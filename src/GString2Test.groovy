//GString a = "text "   GroovyCastException
def s = "String "
def g = "GString created at ${new Date()}"
GString x = GString.EMPTY + s + g
def y = s + g as GString
def z = g + s

//assert a instanceof String
assert s instanceof String
assert g instanceof GString
assert x instanceof GString
assert y instanceof String
assert z instanceof GString

println x
println x.getValues()
println x.getStrings()
println x.class