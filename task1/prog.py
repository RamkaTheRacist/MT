import coreLogic as co
from core import coreFunc as cfunc
import os
cls = lambda: os.system('cls')
def startProg():
    while(True):
        cls()
        print("Choose file to open or create new?")
        choose = input()
        if(choose == "Open"):
            path = input("Absolute path: ")
            array = co.openFile(path)
            cfunc(array, path)
        elif(choose == "Create"):
            path = input("Absolute path: ")
            array = []
            cfunc(array, path)
        elif(choose == "Exit"):
            break
        elif(choose == "Help"):
            print("1)Open [path to file] - open file\n2)Create [path to file] - create new file\n3)Exit - exit from program\n4)Help - for help")
            input()
        else:
            print("Unknown command")
            input()