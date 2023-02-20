import os
from datetime import datetime
from .showNote import showOneNote
cls = lambda: os.system('cls')
def changeNote(note: dict) -> dict:
    tmpBody = ""
    tmpTitle = ""
    while(True):
        cls()
        showOneNote(note)
        choose = input("Command: ")
        if(choose == "Overwrite"):
            tmpTitle = input("Title: ")
            tmpBody = input("Body: ")
            note.update({'title': tmpTitle, 'body': tmpBody, 'date':datetime.now().strftime("%d %B %Y %H:%M:%S")})
        elif(choose == "Save"):
            return note
        elif(choose == "Help"):
            cls()
            print("Expecting commands:\n1)Overwrite - overwrite note\n2)Save - save and exit\n3)Help - for help")
            input()
        else:
            print("Unknown command")
            input()