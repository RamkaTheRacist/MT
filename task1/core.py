import os
import coreLogic as co
import json
cls = lambda: os.system('cls')
def coreFunc(array:list, path:str):
    while(True):
        cls()
        print("Command: ")
        choose = input()
        if(choose == "Add"):
            co.add(array)
            print("Added successfully")
            input()
        elif(choose == "Save"):
            with open(path, "w") as fh:
                json.dump(array, fh)
            print("Saved successfully")
            input()
            break
        elif(choose == "Delete"):
            while(True):
                cls()
                print("Index: ")
                index = input()
                if(index.isdigit()):
                    break
            suc = co.deleteNote(array, int(index))
            if(suc == True):
                print("Deleted successfully")
                input()
            else:
                print("Could not delete")
                input()

        elif(choose == "ShowList"):
            if(len(array) > 0):
                co.showList(array)
                input()
            else:
                print("No entries")
                input()
        elif(choose == "OpenNote"):
            if(len(array) > 0):
                while(True):
                    cls()
                    print("Index: ")
                    index = input()
                    if(index.isdigit()):
                        if((int(index) >= 0) & (int(index) < len(array))):
                            break
                co.changeNote(array[int(index)])
                input()
            else:
                print("No entries")
                input()
            
        elif(choose == "Exit"):
            break
        elif(choose == "Help"):
            print("1)Add - add note\n2)Save - save file and exit\n3)Delete - delete note by index\n4)ShowList - show list of notes\n5)OpenNote - open note by index\n6)Exit - exit from program\n7)Help - for help")
            input()
        else:
            print("Unknown command")
            input()