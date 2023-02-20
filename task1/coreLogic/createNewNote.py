from datetime import datetime
def createNew(id: int) -> dict :
    note = {}
    title = input("Title: ")
    body = input("Body: ")
    date = datetime.now().strftime("%d %B %Y %H:%M:%S")
    note.setdefault('id', id)
    note.setdefault('title', title)
    note.setdefault('body', body)
    note.setdefault('date', date)
    return note
