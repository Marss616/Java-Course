# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy all Java files into the container
COPY *.java .

# Compile all Java files
RUN javac *.java

# Specify the main class (replace with the appropriate class name if needed)
CMD ["java", "Welcome"]
