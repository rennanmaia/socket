# Socket
This is a socket example using java programming language that describe the communication process using since a single connection to multithreading application.

It was written to shows a at communications in distributed systems class to describe primitive communication process using different systems.


version 1
- Simple Server starts, wait a connection and finish
- Simple Client starts, connect and close

version 2
- Server strats, wait a connection, wait messages and closes when the client finish
- Client strats, connect to a server, send messagens and closes

version 3
- Servidor inicia, aguarda conexão, aguarda mensagens e termina
- Cliente inicia, conecta, envia várias mensagens e termina ao ser digitada a mensagem sair

version 4
- Servidor inicia, implementa runnable e gera uma thread para cada cliente que conecta, recebe as mensagens e entrega pra todos os clientes conectados,  e termina
- Cliente inicia, conecta, envia várias mensagens e termina ao ser digitada a mensagem sair

version 5
- Servidor inicia, implementa runnable e gera uma thread para cada cliente que conecta, recebe as mensagens e entrega pra todos os clientes conectados,  e termina
- Cliente inicia, conecta, envia várias mensagens e recebe várias mensagens por meio de threads e termina ao ser digitada a mensagem sair
