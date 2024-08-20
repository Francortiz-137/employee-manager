# Employee Manager

Employee Manager is a simple REST API built with Spring Boot for managing employee records. It provides endpoints to create, read, update, and delete employee data.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Create Employee**: Add a new employee to the database.
- **Read Employees**: Retrieve all employees or a specific employee by ID.
- **Update Employee**: Update an existing employee's information.
- **Delete Employee**: Remove an employee from the database.

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.8.1 or higher
- An IDE such as IntelliJ IDEA or Eclipse

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/employee-manager.git
    ```
2. Navigate to the project directory:
    ```bash
    cd employee-manager
    ```
3. Build the project with Maven:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

## Endpoints

### Get All Employees
- **URL**: `/employee`
- **Method**: `GET`
- **Response**: `200 OK` with a list of employees.

### Get Employee by ID
- **URL**: `/employee/find/{id}`
- **Method**: `GET`
- **Response**: `200 OK` with the employee data if found.

### Add Employee
- **URL**: `/employee/add`
- **Method**: `POST`
- **Body**: JSON representing the employee.
- **Response**: `201 Created` with the created employee data.

### Update Employee
- **URL**: `/employee/update`
- **Method**: `PUT`
- **Body**: JSON representing the updated employee data.
- **Response**: `200 OK` with the updated employee data.

### Delete Employee
- **URL**: `/employee/delete/{id}`
- **Method**: `DELETE`
- **Response**: `200 OK` if the employee was successfully deleted.

## Technologies Used
- **Spring Boot**: For creating the RESTful web services.
- **Maven**: For managing project dependencies.
- **Jakarta EE**: For transaction management.

