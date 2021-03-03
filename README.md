# Conversation-handler-for-REST-APIs



The aim of this project is to design an implement a conversation handler for coordination protocols.
Step 1:
Implement 10 different REST Web services. For simplicity, we assume that each service requires as input the name of the user. The service will return one of the two
messages:
- If the user name’s starts with A-M, a simple JS0N message stating: user’s
name, invocation date, and invocation time.
- If the user name’s starts with N-Z, a simple XML message stating: user’s
name, invocation date, and invocation time.
Step 2:
Input: A file with a state diagram specification that describes the coordination protocols for the 10 Web services. The transitions.txt may be labeled with conditions
(document returned by the service invocation). Your implementation and design should work for any coordination protocol.
Based on the current state of the user’s conversation with the Web services, the system shows (on a Web interface) the services that the user will be able to invoke
from that state, until the end of the coordination protocol. Each time a user selects service, that service is invoked and the resulting message is shown to the user.
Important: Different users should be able to initiate conversations with the Web services at the same time. One way to show that is to use the system from multiple Web browsers at the same time. You are required to include a unique conversation ID in each message. All messages of the same conversation will carry the same unique conversation ID value.
