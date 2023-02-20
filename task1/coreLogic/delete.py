def deleteNote(array:list, index:int) -> bool:
    if((index >= 0) & (index < len(array))):
        array.pop(index)
        return True
    else:
        return False