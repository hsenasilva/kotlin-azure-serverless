# kotlin-azure-serverless
==========================

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

4. Install dependencies.

        $ mvn clean install

5. Compile Kotlin.

        $ mvn kotlin:compile package

6. Run. (Run locally)
        
        $ mvn azure-functions:run

7. Deploy to Azure. (Deploy and run on Azure)

        $ mvn azure-functions:deploy
