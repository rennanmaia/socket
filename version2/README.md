# Socket
This is a socket example using java programming language that describe the communication process using since a single connection to multithreading application.

It was written to shows a at communications in distributed systems class to describe primitive communication process using different systems.

## Description

### Server
This version 2 contains a simmple server that just initialize on 12345 port and wait for a connection. Whe it receive a connection, shows a string the is sent to the client and closes.

### Client
The client initialize with a string argument, connects with server, send the string and close.

## Requirements
Java SE Development Kit

## Running
### Compiling
```sh
javac Server.java
javac Client.java
```

### Running
```sh
java Server
java Client stringEnviada
```