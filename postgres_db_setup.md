# **PostgreSQL Database Setup Guide in Docker**

This guide provides detailed instructions for setting up a PostgreSQL database using Docker on a Mac. It covers the installation of Docker, pulling the PostgreSQL image, creating a Docker container, and setting up a new user, database, schema, and table.

## **Prerequisites**

- Access to a Mac computer.
- Basic understanding of terminal commands.

## **Step-by-Step Guide**

### **Step 1: Install Docker on Mac**

1. Download Docker Desktop for Mac from the Docker website.
2. Open the downloaded **`.dmg`** file.
3. Drag and drop the Docker icon into the Applications folder.
4. Launch Docker from the Applications folder. This will initiate the setup process.
5. If prompted, authorize Docker with your system password.
6. Wait for Docker to indicate that it is up and running.

### **Step 2: Pull PostgreSQL Docker Image**

1. Open your terminal.
2. Pull the latest PostgreSQL image:

    ```
    docker pull postgres
    
    ```

3. Verify the image is pulled correctly:

    ```
    
    docker images
    
    ```


### **Step 3: Check Running Containers**

(Optional) Check if any containers are already running:

```

docker ps

```

### **Step 4: Create a New Container**

Create a new Docker container with PostgreSQL:

```

docker run --name postgres-container -e POSTGRES_PASSWORD=mypassword -e POSTGRES_USER=myuser -e POSTGRES_DB=mydatabase -p 5432:5432 -d postgres

```

Replace **`mypassword`**, **`myuser`**, and **`mydatabase`** with your desired password, username, and database name.

### **Step 5: Access the PostgreSQL Database**

Connect to your PostgreSQL database:

```

docker exec -it postgres-container psql -U myuser -d mydatabase

```

### **Step 6: List All Databases**

To list all databases:

```

\dt

```

### **Step 7: Create a New Schema**

Create a new schema in your database:

```

CREATE SCHEMA my_schema;

```

Verify the schema:

```

\dn

```

### **Step 8: Create a New User Table**

Create a new table under the schema:

```

CREATE TABLE my_schema.user_table (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(100),
    lastname VARCHAR(100),
    email VARCHAR(100)
);

```

Verify the table:

```

\dt my_schema.*

```

### **Step 9: Insert Records into User Table**

Insert records into **`user_table`**:

```

INSERT INTO my_schema.user_table (firstname, lastname, email) VALUES ('John', 'Doe', 'john.doe@example.com');
INSERT INTO my_schema.user_table (firstname, lastname, email) VALUES ('Jane', 'Doe', 'jane.doe@example.com');

```

### **Step 10: Exit the Database**

To exit the PostgreSQL prompt:

```

\q

```