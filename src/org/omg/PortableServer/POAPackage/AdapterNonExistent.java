package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/AdapterNonExistent.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/puppet/workspace/8-2-build-windows-amd64-cygwin/jdk8u73/6086/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Friday, January 29, 2016 5:40:18 PM PST
*/

public final class AdapterNonExistent extends org.omg.CORBA.UserException
{

  public AdapterNonExistent ()
  {
    super(AdapterNonExistentHelper.id());
  } // ctor


  public AdapterNonExistent (String $reason)
  {
    super(AdapterNonExistentHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterNonExistent
