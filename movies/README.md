# Java + Spring Boot backend

### Dependencies
<ul>
  <li>Spring Boot Starter Data MongoDB</li>
  <li>Spring Boot DevTools</li>
  <li>Spring Boot Framework</li>
  <li>Spring DotEnv</li>
  <li>Spring Project Lombok</li>
</ul>

### Basic Overview
Database : MongoDB (deployed on MongoDB Atlas)
<br><br>
The application has 2 classes
<ul>
  <li>
    Movie - Contains movie data
  </li>
  <li>
    Reviews - Contains review data
  </li>
</ul>
Which have 3 layers
<ul>
  <li>Controller - Serves as the RestController with Get/Post Mapping in the functions</li>
  <li>Service - Conatins business logic (Complicaed create, update requests which are not directly served by the repository laayer)</li>
  <li>Repository - Interface to talk to the MongoDB Database</li>
</ul>


### Endpoints

<ul>
  <li>{path}/api/v1/movies (GET) - Gets all movies data</li>
  <li>{path}/api/v1/movies/{imdbId} (GET) - Gets single movie data</li>
  <li>{path}/api/v1/reviews (POST, Request Body : {"body" : "", "imdbId": ""}) - Adds a review to the list of reviews of a single movie</li>
</ul>

