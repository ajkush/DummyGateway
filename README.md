# DummyGateway: This gateway has Restful Webservice interface exposed to listen for the request to process Airline data and provide the response based on the requested data in request parameters. Technilogy: SpringBoot Starter & Java

Assumption: CSV file have the Airline data is a common file updated by another backend service from time to time.

"Commons" project need to add into ProcessingGateway application.

Request : Method: Get http://localhost:8090/info Response: This is a Spting Web Servce

/execute methos have 4 parameters
1.) Colunm 1 name from cvs sheet
2.) Forlula(Or calculation) which need to perform on column 1. eg AVG or SUM
3.) Colunm 2 name from cvs sheet
4.) Forlula(Or calculation) which need to perform on column 2. eg AVG or SUM

Request : Method: Get http://localhost:8090/execute?column1=WTX&formulaToColumn1=SUM&column2=SOX&formulaToColumn2=AVG

Response: [{"id":0,"rating":"BB","wtx":26.402,"sox":532.0},{"id":0,"rating":"CC","wtx":75.068,"sox":5308.0},{"id":0,"rating":"B","wtx":90.213,"sox":3289.5},{"id":0,"rating":"CCC","wtx":125.81,"sox":3303.25},{"id":0,"rating":"CCC+","wtx":197.412,"sox":1018.80554},{"id":0,"rating":"B+","wtx":227.315,"sox":853.2014},{"id":0,"rating":"BB+","wtx":279.86902,"sox":376.7847},{"id":0,"rating":"B-","wtx":309.10403,"sox":979.5949},{"id":0,"rating":"BB-","wtx":384.44302,"sox":466.04248}]

Request : localhost:8090//execute?column1=WTX&formulaToColumn1=AVG&column2=SOX&formulaToColumn2=AVG 

Response: [{"id":0,"rating":"BB","wtx":6.6005,"sox":532.0},{"id":0,"rating":"CC","wtx":55.266502,"sox":5308.0},{"id":0,"rating":"B","wtx":35.20575,"sox":3289.5},{"id":0,"rating":"CCC","wtx":35.401375,"sox":3303.25},{"id":0,"rating":"CCC+","wtx":11.889265,"sox":1018.80554},{"id":0,"rating":"B+","wtx":10.448067,"sox":853.2014},{"id":0,"rating":"BB+","wtx":4.846313,"sox":376.7847},{"id":0,"rating":"B-","wtx":11.360438,"sox":979.5949},{"id":0,"rating":"BB-","wtx":6.192817,"sox":466.04248}]
