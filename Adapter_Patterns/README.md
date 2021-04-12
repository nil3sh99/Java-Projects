###Introduction
Adapter pattern is also known as Wrapper.
Interface is used to connect between Adapter and adaptee.

Adapter lets classes work together which couldnt have worked because they are of different interfaces.

Now, we have a code, that uses some particular interface (Client) and we want the output to be in some other format which uses a different interface (Adaptee) and has a method specficRequest().
Adapter sits between the two and take request(), which is used to use the signature we are following i.e client code and then calls adaptee.

Client wants to call Adaptee and Client has to use a specific interface to get the code working, now it has to use Adapter, so that code works.

Intention: Do not change the alter/behavior of the code. 