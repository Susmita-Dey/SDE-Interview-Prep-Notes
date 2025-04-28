class Database:
    def connect(self):
        return "Connected to Database"


class Service:
    def __init__(self):
        self.db = Database()  # tight coupling

    def get_data(self):
        return self.db.connect()


# Usage
service = Service()
print(service.get_data())
