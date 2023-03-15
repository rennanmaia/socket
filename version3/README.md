# Socket
This is a socket example using java programming language that describe the communication process using since a single connection to multithreading application.

It was written to shows a at communications in distributed systems class to describe primitive communication process using different systems.

## Description
Version 3

### Server
This version 3 contains a simmple server that just initialize on 12345 port and wait for a connection. Whe it wait for messages to be sent by client and, whe client closes it close too.

### Client
The client initialize, connects with server and wait for user type some message and press enter. Every enter pressed send the string to the server. If the string is equal to "sair" the client finish its running.

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
java Client
```