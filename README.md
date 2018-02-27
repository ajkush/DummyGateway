# DummyGateway: Restful Webservice interface to listen request to process Airline data to process and response based upon requested data in parameters provided in request.
Assumption: CSV file have the Airline data is a common file updated by other backend service on time to time.

Request :
Method: Get
http://localhost:8090/info
Response: This is a Spting Web Servce


Request :
Method: Get
http://localhost:8090//execute?column1=WTX&formulaToColumn1=SUM&column2=SOX&formulaToColumn2=AVG

Response: [{"id":0,"rating":"BB","wtx":26.402,"sox":532.0},{"id":0,"rating":"CC","wtx":75.068,"sox":5308.0},{"id":0,"rating":"B","wtx":90.213,"sox":3289.5},{"id":0,"rating":"CCC","wtx":125.81,"sox":3303.25},{"id":0,"rating":"CCC+","wtx":197.412,"sox":1018.80554},{"id":0,"rating":"B+","wtx":227.315,"sox":853.2014},{"id":0,"rating":"BB+","wtx":279.86902,"sox":376.7847},{"id":0,"rating":"B-","wtx":309.10403,"sox":979.5949},{"id":0,"rating":"BB-","wtx":384.44302,"sox":466.04248}]

