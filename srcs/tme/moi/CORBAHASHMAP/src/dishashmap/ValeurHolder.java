package dishashmap;

/**
* dishashmap/ValeurHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from dishashmap.idl
* vendredi 4 avril 2014 12 h 40 CEST
*/

public final class ValeurHolder implements org.omg.CORBA.portable.Streamable
{
  public dishashmap.Valeur value = null;

  public ValeurHolder ()
  {
  }

  public ValeurHolder (dishashmap.Valeur initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = dishashmap.ValeurHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    dishashmap.ValeurHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return dishashmap.ValeurHelper.type ();
  }

}
