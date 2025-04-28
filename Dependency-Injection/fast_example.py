from fastapi import FastAPI, Depends

app = FastAPI()


class Database:
    def connect(self):
        return "Connected to Database"

    def disconnect(self):
        return "Disconnected from Database"


def get_database():
    db = Database()
    try:
        # yielding the database connection means connect to database when needed
        yield db
    finally:
        db.disconnect()


@app.get("/chai")
def read_chai(db=Depends(get_database), message=""):
    return {"db": db, message: "Chai is ready!"}


# This is a simple FastAPI application that demonstrates dependency injection.
