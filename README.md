# simple-api-testing

Concept to testing model:
- Using Mountebank to create an "isolated" environment in order to test the required API(s) without the need for actual SIT/UAT.
- User should record the actual response from API testing and convert to .js file -> put to the desginated folder.
- Mountebank imports the api with specific response for each test case from [imposters] folder.
