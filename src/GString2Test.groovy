def s = "String "
def g = "GString created at ${new Date()}"
GString x = GString.EMPTY + s + g
def y = s + g
assert s instanceof String
assert g instanceof GString
assert x instanceof GString
assert y instanceof String
println x