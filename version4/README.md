# Socket
This is a socket example using java programming language that describe the communication process using since a single connection to multithreading application.

It was written to shows a at communications in distributed systems class to describe primitive communication process using different systems.

## Description
Version 4

### Server
This version 4 contains a server that initialize on 12345 port and wait for a connections. Each new client that connects it shows a message and open a new thread. After that, each message sent by each client is presented on prompt where the server is running. The server just closes whe the Ctrl+C command is typed on the command prompt.
In this version its allowed to connect more than one client to one single server.

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