package dishashmap;


/**
* dishashmap/ValeurHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from dishashmap.idl
* vendredi 4 avril 2014 12 h 40 CEST
*/

abstract public class ValeurHelper
{
  private static String  _id = "IDL:dishashmap/Valeur:1.0";

  public static void insert (org.omg.CORBA.Any a, dishashmap.Valeur that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static dishashmap.Valeur extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (dishashmap.ValeurHelper.id (), "Valeur");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static dishashmap.Valeur read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ValeurStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, dishashmap.Valeur value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static dishashmap.Valeur narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof dishashmap.Valeur)
      return (dishashmap.Valeur)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      dishashmap._ValeurStub stub = new dishashmap._ValeurStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static dishashmap.Valeur unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof dishashmap.Valeur)
      return (dishashmap.Valeur)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      dishashmap._ValeurStub stub = new dishashmap._ValeurStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
