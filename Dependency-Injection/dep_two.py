# Making dep_one.py better for future
class Database:
    def connect(self):
        return "Connected to Database"


class Service:
    def __init__(self, db):
        self.db = db  # loose coupling

    def get_data(self):
        return self.db.connect()


# Usage
db = Database()
service = Service(db)
print(service.get_data())
