# DSoftQBWCAxisService
SOAP server that handles connections from the QuickBooks Web Connector and implements qbxml requests/responses from a Webapp <https://github.com/diltdicker/DSoftQBWCWebApp> to allow for a more RESTful way of communicating with either a single or multiple instance(s) of QuickBooks Desktop Pro.

## How the Service works
This service works in conjunction with <https://github.com/diltdicker/DSoftQBWCWebApp>.
Using Mongodb as database for communication bewteen the Webapp, requests and responses are passed between the two services. This works such that you can send an QBXML (just send as normal XML) POST request to the Webapp and the periodically the Axis service will send the requests to the respective QuickBooks Desktop instances to be executed.

## QWC File
To use your service, you must create a QWC file to distribute to client machines running QuickBooks Desktop and have the Web Connector installed <https://developer.intuit.com/app/developer/qbdesktop/docs/get-started/get-started-with-quickbooks-web-connector#alternative-option-to-qb-web-connector>.

## Instructions for use
* Make sure that Mongodb is running on the machine with the appropriate configuration
* On your Tomcat server make sure that the Axis2 servlet is running
* Upload the AAR to the Axis2 servlet

## Modify Service
* Skeleton file is located at _service/src/com/dickersonsoftware/intuit/DSoftQBWCSoapServiceSkeleton.java_
(The methods are documented in greater deatail <https://developer-static.intuit.com/qbSDK-current/doc/PDF/QBWC_proguide.pdf>)
    * connectionError :
    * sendRequestXML :
    * serverVersion : 
    * getLastError :
    * authenticate :
    * receiveResponseXML :
    * clientVersion : 
    * closeConnection :
* The properties file is located at _service/resources/config.properties_
    * mongo_host : mongodb hostname
    * mongo_port : mongodb port number
    * mongo_db : database name for the application

## Building AAR
1. Make sure that you have properly set the **AXIS_HOME** environent variable.
2. Download the required libs for compilation.
        ``mvn dependency:copy-dependencies -DoutputDirectory=maven-repository``

3. Next run the ant script located in the (service) directory.
4. The newly built .aar will appear in the (build) directory and will be ready for deployment.
