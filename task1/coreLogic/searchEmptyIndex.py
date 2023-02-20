def findIndex(array:list) -> int:
    count = 0
    if(len(array) == 0):
        return len(array)
    for item in array:
        if(item["id"] == count):
            count+=1
    return count