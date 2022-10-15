from flask import Flask, request
from flask_restful import Api, Resource
from flask_sqlalchemy import SQLAlchemy
import mysql.connector
import json
import urllib

# Read currency data from the json file
with open("country-by-currency-name.json") as file:
    data = file.read()
    currency_details = json.loads(data)
    print(len(currency_details))


# connecting with mysql server
cnx = mysql.connector.connect(user='root', password='Dip@2001', host='127.0.0.1')
cur = cnx.cursor(buffered=True)
# creating database for our application
cur.execute("CREATE DATABASE IF NOT EXISTS mycurrencyDB")
cur.close()
cnx.close()