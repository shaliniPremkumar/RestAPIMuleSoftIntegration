# Global Weather RESTful API
This repository contains an integration project done as a part of Deloitte's technical challenge.


### About the Project
The project is to consume a web service exposed via **Docker** and create a **RESTful API** using **RAML** and **Mule 4.3.0**. The web service provides two **GET** services - *GetWeather* and *GetCitiesByCountry*. The formatted output of the response will be in **JSON** format. The API returns a **200 OK** message if the request successfully hits the web service and the response is received. Appropriate error handling is implemented by using the **Error Handler** function. More details about the specifications are briefed in the *RAML* file.

**Input:** *CityName (String), CountryName (String)*

**Output:** *JSON array*


### Getting Started
> ##### In order to expose the web service, the Docker image must be run.
>
> - Create a Docker account in **Docker Hub**.
> - Install **Docker Desktop 2.4**.
> - Configure the Docker.
> - Initialize the Docker image locally.

### Pre-requisites
> ##### The following pre-requisites are mandatory in order to run the code.
>
> - Create an Anypoint account.
> - Install **Anypoint Studio 7.6.0** (Mule runtime engine version **4.3.0**).

### Challenges faced
> - **Docker containerization** was a relatively new topic. Learning to initialize the web service via the Docker was challenging.
> - Learning and experimenting the vast **Data Weave** transform functions in Mule was very arduous, yet exciting.
> - The response payload had a **CDATA** embedded nested XML format. The parsing of CDATA was the best challenge in the project.

### Design decisions
> - Handled the XML embedded CDATA by creating a **Java** class.
> - Used the various data weave **Transform Message** functions such as **read, write, map** throughout the project.
> - Kept the project design simple enough to be understood easily.
> - Implemented the routing via **API Kit router** and **API Console**, which enable the API to be run via an API call and via the console respectively, embedding the RAML.
> - Designed separate flows that has increased the reusability of certain functions.
> - Ensured that a **formatted JSON** output is sent back to the end user.


### Usage
1. Clone the repository to the local.
2. Import the cloned project as a Mule Application via the Anypoint Studio application. ![image](https://user-images.githubusercontent.com/73317774/97315303-b2589480-18bc-11eb-8c37-d4746a3ec414.png)

3. Choose the *Anypoint Studio project from File System* option, set the Project Root and Project Name. ![image](https://user-images.githubusercontent.com/73317774/97315455-d916cb00-18bc-11eb-8ccd-6508083424ca.png)

4. Once the project is loaded in the Anypoint Studio, run the project as a *Mule Application*. ![image](https://user-images.githubusercontent.com/73317774/97316449-d9fc2c80-18bd-11eb-9770-44cc7cd54eec.png)

5. Wait until the application is *built* and *deployed* successfully. This might take a few minutes. The status can be monitored in the Anypoint Studio Console.   
![image](https://user-images.githubusercontent.com/73317774/97317545-049ab500-18bf-11eb-8c10-9ef26af1c806.png)

6. The API, embedded with the RAML, can be accessed via the *APIKit Consoles*. ![image](https://user-images.githubusercontent.com/73317774/97318168-b0dc9b80-18bf-11eb-8ce2-077569b02678.png)
![image](https://user-images.githubusercontent.com/73317774/97324109-97d6e900-18c5-11eb-9bf4-25c1780c2c5a.png)

7. Choose a *GET* service and click on the **TRY OUT** button to request and receive a response.
![image](https://user-images.githubusercontent.com/73317774/97323839-4cbcd600-18c5-11eb-94f0-7c3d95d4b22f.png)
![image](https://user-images.githubusercontent.com/73317774/97323903-5e9e7900-18c5-11eb-8efc-424a6fc49464.png)

8. Alternatively, the API can be accessed via third party applications such as **Postman** or simply browse the endpoint via a browser. The endpoints are briefed in the *RAML specification*.
![image](https://user-images.githubusercontent.com/73317774/97320087-94416300-18c1-11eb-9c6f-71866b1b6642.png)
![image](https://user-images.githubusercontent.com/73317774/97324634-2e0b0f00-18c6-11eb-9c45-ecceac3588c9.png)


### Deliverables
> - The working code uploaded in this repository.
> - The **RAML API specification** for the project present in the repository. Anypoint Exchange Portal link [Global Weather API](https://anypoint.mulesoft.com/exchange/portals/na-3440/c714d793-958c-47a8-be33-70abb1affea8/globalweatherAPI/).
> - *README* specifying the commentary on design decisions and challenges faced

### License
Distributed under the MIT License.

### References
- [Mulesoft](https://docs.mulesoft.com/)
- [Docker](https://www.docker.com/101-tutorial)
- [WSDL](https://www.soapui.org/docs/soap-and-wsdl/working-with-wsdls/)
- [RAML](https://raml.org/developers/raml-100-tutorial)
- [Web API design](https://docs.microsoft.com/en-us/azure/architecture/best-practices/api-design)
- [Stackoverflow](https://stackoverflow.com/)
