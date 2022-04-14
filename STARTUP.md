# Getting Started - Backend

* git clone `https://github.com/revature-rev-tech2/project-3-back-end.git`

TO RUN APPLICATION LOCALLY:
----
1. Open IDE and import project to workspace
2. Navigate to src/main/java -> com.project3.revtech package -> RevtechApplication.java
3. Run as Java Application to start the server
4. Application and H2 database will run on server.port=7777
5. Once the application is running, on your web browser navigate to `http://localhost:7777/h2-console` in order to access H2 console

THINGS TO NOTE:
----
* The application.properties file contains the H2 database configuraton
* The schema.sql and data.sql files located in src/main/resources will auto generate the tables and data within the H2 database
* The application.yml file contains the AWS credentials to access the S3 bucket which we use to host the images from product image upload
* Java simplified encryption can only be ran locally, to get Java encryption started for the back-end. Refer to start-up instructions in documents folder

TO RUN THE APPLICATION REMOTELY:
----
1. Navigate to http://ec2-34-230-18-27.compute-1.amazonaws.com:8080/ to login to Jenkins connection to EC2
2. Use login credentials: `username: admin` `password: password`
3. Build Jenkins Job `Project-3-Back-End` which handles the building of the backend (along with H2 database)
4. Build Jenkins Job `Project-3-Back-End-Pipeline` which deploys the backend (allows working with the back end remotely)

THINGS TO NOTE:
----
* If The provided EC2 instance URL is no longer available, another EC2 may need to be created. See documents folder for instructions on creating an EC2 instance.
* The application.properties file contains the PostgreSQL database configuration, it must be uncommented before creating the job to create the PostgreSQL image.
* The DDL queries at the beginning of the schema.sql and data.sql files must also be uncommented to auto-generate data within the image.

# Getting Started - Frontend
* git clone `https://github.com/revature-rev-tech2/project-3-front-end-beta.git`

TO RUN APPLICATION LOCALLY w/ LOCAL BACKEND:
----
1. Run `npm install` to install the node_modules folder
2. Open source-code editor (ex.Visual Studio Code) and open project to load into workspace
3. Make sure the index.html file located in the src file has `<base href"/">` uncommented and `<base href="/dist/rev-tech/">` commented out
4. Make sure the instance.ts file located in app -> models has `static url: string = "http://localhost:7777";` uncommented and `static url: string = "http://ec2-34-230-18-27.compute-1.amazonaws.com:9999";` commented out 
5. Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
6. Follow steps for how to run the backend locally

TO RUN APPLICATION LOCALLY w/ REMOTE BACKEND:
----
1. Run `npm install` to install the node_modules folder
2. Open source-code editor (ex.Visual Studio Code) and open project to load into workspace
3. Make sure the index.html file located in the src file has `<base href"/">` uncommented and `<base href="/dist/rev-tech/">` commented out
4. Make sure the instance.ts file located in app -> models has `static url: string = "http://localhost:7777";` commented out and `static url: string = "http://ec2-34-230-18-27.compute-1.amazonaws.com:9999";` uncommented
5. Follow steps for how to run the backend remotely

TO RUN APPLICATION REMOTELY:
----
1. Navigate to http://ec2-50-16-74-43.compute-1.amazonaws.com:8080/jenkins/ to login to Jenkins connection to EC2
2. Build Jenkins Job `Project-3-Back-End` is the Jenkins Job which handles the building of the backend (along with H2 database)
3. Build Jenkins Job `Project-3-Back-End-Pipeline` is the Jenkins Job which deploys the backend (allows working with the back end remotely)
4. Navigate to the AWS CodePipeline console and create pipeline `Project-3-Front-End-Beta` which handles the building of the frontend (which is connected to and hosted by AWS S3)
5. Navigate to `http://revtech2-frontend-beta.s3-website-us-east-1.amazonaws.com` to access the application

THINGS TO NOTE:
--
1. Frontend CI/CD is implemented through AWS CodePipeline rather than Jenkins. See documents folder on how to create an AWS CodePipeline job.
2. If the S3 bucket URL is no longer available, an S3 bucket will have to be created to host the static website. See documents folder on how to create S3 bucket.
3. The application.yml file in the backend contains the bucket URL for the static website, this may need to be changed for password reset routing from email link. 

TO RUN ANGULAR MATERIAL FOR THEME CHANGING:
----
1.	Run `ng add @angular/material` to install angular material
2.	Pick  Custom theme 
3.	For “Set up HammerJS for gesture” and “Set up browser animations for Angular Material” , 
Pick it based on your needs. 
The Previous team pick no for Set up HammerJS for gesture
The Previous team pick yes for Set up browser animations for Angular Material
4.	Check the code at Styles.scss. Make sure the code is same as the original Styles.scss

Things to note:
* Make sure `@use @angular/material as mat` set the first line of code
* Check for `$rev-tech-primary` , `$rev-tech-accent` and `$rev-tech-warm` 
* Check for `mat.define-light-theme` and `mat.define-dark-theme`
* Check for `.darkMode`
* Check for duplicate imports of Angular material in styles.scss 
