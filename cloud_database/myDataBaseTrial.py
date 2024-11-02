import firebase_admin
from firebase_admin import credentials
from firebase_admin import firestore

# Use a service account.
cred = credentials.Certificate(r"C:\Users\cjcri\myKeys\myHealthDB.json")

app = firebase_admin.initialize_app(cred)

db = firestore.client()
##
doc_ref = db.collection("Health Users").document("Ben")
doc_ref.set({"Heart Rate": 145, "Steps": 3500, "Age": 18})

doc_ref1 = db.collection("Health Users").document("Ted")
doc_ref1.set({"Heart Rate": 145, "Steps": 3500, "Age": 18})

doc_ref.update({"Weight":255})
doc_ref1.update({"Weight":455})

query = db.collection("Health Users").where("Steps", ">", 3000)
docs = query.get()

for doc in docs:
    print(f"Document ID: {doc.id} => Data: {doc.to_dict()}")

doc_ref1.update({"Weight": firestore.DELETE_FIELD})
print("Field 'Weight' deleted successfully.")

print(f"{doc.id}: {doc.to_dict()}")