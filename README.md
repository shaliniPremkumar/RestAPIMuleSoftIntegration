# Technical-challenge 
This repository contains the project done as a part of Deloitte's technical challenge.


### About the Project
The project is to consume a web service exposed via **Docker** and create a **RESTful API** using **RAML** and **Mule 4**. The web service provides two *GET* services. The output of the response will be in **JSON** format. More details about the specifications are provided in the *RAML* file.

### Getting Started
> ##### In order to expose the web service, the Docker image must be run.
>
> - Create a Docker account in the **Docker Hub**
> - Install **Docker Desktop 2.4**.
> - Configure the Docker.
> - Initialize the Docker image locally.

### Pre-requisites
> ##### The following pre-requisites are mandatory in order to run the code.
>
> - Create an Anypoint account.
> - Install **Anypoint Studio 7.6.0**
> - Install **Postman**

### Usage
The **RAML** API specification for the project is present under the _src/main/resources_ folder of the project.
The application accepts _String_ parameters as input, which would be passed as a query parameter in the URL endpoint. The API returns a **200 OK* message if the request successfully hits the web service and the expected response is received. Proper error handling is done by suing the **Error Handler** function.

### Challenges faced
> - Docker containerization was a relatively new topic. Learning to initialize the web service via the Docker was challenging.
> - Learning and experimenting the vast **Data Weave** transform functions in Mule was very arduous, yet exciting.
> - Understanding the requirements was tough, as the knowledge over the topics mentioned in the challenge was less.
> - The response payload had a **CDATA** embedded nested XML format. The parsing of CDATA was the best challenge in the project.

### Design decisions
> - The XML embedded CDATA was handled by creating a **Java** class.
> - Used the various data weave **Transform Message** functions such as **read, write, map** throughout the project.
> - Kept the project design simple enough to be understood easily.
> - Ensured that a **formatted JSON** output is sent back to the end user.

### License
Distributed under the MIT License.

### References
- [Mulesoft](https://docs.mulesoft.com/)
- [Docker](https://www.docker.com/101-tutorial)
- [WSDL](https://www.soapui.org/docs/soap-and-wsdl/working-with-wsdls/)
- [RAML](https://raml.org/developers/raml-100-tutorial)
- [Web API design](https://docs.microsoft.com/en-us/azure/architecture/best-practices/api-design)
- [Stackoverflow](https://stackoverflow.com/)
