# kotlin-azure-serverless
====================================

Sample Kotlin project with maven and Azure Functions.

What's Here
-----------

This sample includes:

* README.md - this file
* pom.xml - this file is the Maven Project Object Model for the web service
* src/main - this directory contains your Kotlin source files
* FunctionHttpTrigger.kt - Trigger function by endpoint 
* FunctionTimerTrigger.kt - Trigger function by CRON


Getting Started
---------------

1. Install maven.  See https://maven.apache.org/install.html for details.

2. Install Azure CLI. See https://docs.microsoft.com/en-us/cli/azure/install-azure-cli?view=azure-cli-latest

3. Run the login command.

        $ az login

4. Install Azure Functions Core Tools. See https://aka.ms/azfunc-install


5. Install dependencies.

        $ mvn clean install

6. Compile Kotlin.

        $ mvn kotlin:compile package

7. Run. (Run locally)
        
        $ mvn azure-functions:run

8. Deploy to Azure. (Deploy and run on Azure)

        $ mvn azure-functions:deploy
