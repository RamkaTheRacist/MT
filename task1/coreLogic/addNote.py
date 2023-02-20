from .createNewNote import createNew
from .searchEmptyIndex import findIndex
def add(array: list):
    note = createNew(findIndex(array))
    array.append(note)