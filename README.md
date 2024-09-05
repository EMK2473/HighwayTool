# Highway Tool
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
OOP Lab Module: A Java program that identifies the type and direction of an interstate highway based on its number. It can determine if the highway is a primary or auxiliary interstate and specify its direction and the primary interstate it serves if applicable.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 


Using terminal commands: 

- Clone or download the repository: 
```Java 
- git clone https://github.com/your-username/HighwayTool.git 
```

- Navigate to the project directory: 
```Java
- cd HighwayTool 
```
- Compile the HighwayTool.java file: 
```Java
- javac HighwayTool.java 
```
- Run the program: 
```Java
- java HighwayTool
```  

## Application Usage
Once the program is running, it will prompt you to enter a highway number. The program will then determine if the number represents a valid interstate highway and provide details about it:  
```Java
Primary Interstate (1-99):  
- Even numbers: Going east/west. 
- Odd numbers: Going north/south. 
```
```Java
Auxiliary Interstate (100-999):  
- Serves a primary interstate (the last two digits of the highway number). 
- Even numbers: The auxiliary highway serves a primary highway going east/west. 
- Odd numbers: The auxiliary highway serves a primary highway going north/south. 
```
If you input: 

```Java
45 
```
The output will be:
```Java
I-45 is primary, going north/south. 
```
If you input:
```Java
295
``` 
The output will be:
```Java
I-295 is auxiliary, serving I-95, going north/south. 
```
If you input: 
```Java
150
``` 
The output will be:
```Java
I-150 is not a valid interstate highway number.
```

## Contributions
Eric Keeton

## Test Commands
You can test the program by entering various highway numbers to ensure correct identification and classification

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)