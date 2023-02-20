def showOneNote(note:dict):
    for item in note.keys():
        print ("%s : %s" % (item, note[item]))

def showList(array:list):
    for item in array:
        print(item["id"], item["title"], item["date"])