package Terceros;

/**
* Terceros/TerceroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Terceros.idll
* mi�rcoles 26 de septiembre de 2018 09:13:52 PM COT
*/

public final class TerceroHolder implements org.omg.CORBA.portable.Streamable
{
  public Terceros.Tercero value = null;

  public TerceroHolder ()
  {
  }

  public TerceroHolder (Terceros.Tercero initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Terceros.TerceroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Terceros.TerceroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Terceros.TerceroHelper.type ();
  }

}
