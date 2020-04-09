import java.io.*;
public class ReadData
{
  public static void main(String[] args)
  {
    //Maak object van Input stream waarmee ons gaan lees;
    ObjectInputStream stream;
    //Try sodat as die program sou crash , hy eeder die error uitgooi;
    try
    {
      //maak die stream oop na die Serialize.ser file
      stream = new ObjectInputStream(new FileInputStream("Serialize.ser"));
      //Maak object array van Contacts waarin ons die data gaan in lees;
      Contact[] contactObject;
      //Lees data in moet die ingeleesde data cast na Contact toe
      contactObject = (Contact[]) stream.readObject();
      System.out.println("\n+++ToString+++");
      //lees die toString van elke ingeleesde object
      for(int x = 0; x < contactObject.length; x++)
      {
        //onthou dat net die wat in elk een voor kom kan so geroep word;
        //toString kom in beide voor en dus kan dit geroep word maar getEmail kom net in BusinessContact voor en nie in Contact of PersonalContact nie dus kan nie geroep word nie;
        System.out.println(contactObject[x].toString());
      }
      //maak die stream toe sodat dit nie sal onnodige ram gebruik nie of sodat ons hom later weer kan gebruik;
      stream.close();
    }
    //catch enige errors;
    catch(Exception ex)
    {
      //String voor die Exception cast hom na string makliker as om Exception te cast;
      System.out.println("Error:" + ex);
    }
  }
}
