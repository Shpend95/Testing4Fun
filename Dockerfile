FROM maven:3.9.6-eclipse-temurin-22

# Set working directory inside container
WORKDIR /app

# Copy everything into container
COPY . .

# Compile test classes (not just main)
RUN mvn clean test-compile


# Run the Java test class
CMD ["mvn", "exec:java", "-Dexec.mainClass=utils.Test4Fun"]
