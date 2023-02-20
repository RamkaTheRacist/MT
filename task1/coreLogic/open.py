import json
def openFile(path:str) ->list:
   with open(path, "r") as fh:
      file = json.load(fh)
   return file