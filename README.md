Clone the repo on to your local drive

maven clean and install the repo (mvn clean install)
to run the app mvn spring-boot:run or you can open your ide to run it. 

Make sure you have maven and java install on your machine

to run the application the api is as follows:
Make sure you have insomnia or postman on your machine to test the api
http://localhost:8081/apis/playsafe/conversion (POST)
Payload example :
ConversionType is either (kelvinToCelsius, milesToKilos, poundsToKgs)
{
	"conversionType":  "poundsToKgs",
	"value" : "50.88"
	
}

