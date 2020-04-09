import java.io.*;
public class AddressBook
{
  public static void main(String[] args)
  {
    //Maak 'n array van Objects van Contacts;
    //Dus dink daaraan asof die Contact Class oor en oor gemaak word;
    //Dink die as 'n normale object verklaaring (Contact contact = new Contact();) maar jy maak net 'n array daarvan;
    Contact[] contactObject = new Contact[6];
    //Verklaar elk van die Contact classes se objects;
    //ONthou dat die PersonalContact en BusinessContact Classes subclasses (vertakkings) van die klas Contact;
    //Dus kan ek PersonalContact gebruik in die object van 'n Contact class;
    contactObject[0] = new PersonalContact("Rainard","0833783389","21 December");
    contactObject[1] = new BusinessContact("Xagarey","0875649258","xag.meyer@gmail.com","Xagemeister.co");
    contactObject[2] = new PersonalContact("Coenraad","0833083164","10 May");
    contactObject[3] = new BusinessContact("Henco","0896512086","henco.groenewald@hotmail.com","Henco$Broers");
    contactObject[4] = new PersonalContact("Wilme", "0832720639","20 May");
    contactObject[5] = new BusinessContact("Benjamin","0729918503","benjamin.bisschoff@student.nwu.ac.za","GrootpanBoerdery");
    //For loop om elk toString van al die objects te kry;
    System.out.println("\n+++ToString+++");
    for(int x = 0; x < contactObject.length; x++)
    {
      //onthou dat net die wat in elk een voor kom kan so geroep word;
      //toString kom in beide voor en dus kan dit geroep word maar getEmail kom net in BusinessContact voor en nie in Contact of PersonalContact nie dus kan nie geroep word nie;
      System.out.println(contactObject[x].toString());
    }
    //onthou dat net die wat in elk een voor kom kan so geroep word;
    //toString kom in beide voor en dus kan dit geroep word maar getEmail kom net in BusinessContact voor en nie in Contact of PersonalContact nie dus kan nie geroep word nie;
    System.out.println("\n+++GetContactDetails+++");
    for(int x = 0; x < contactObject.length; x++)
    {
      System.out.println(contactObject[x].getContactDetails());
    }
    //In die boonste for loops het die method in beide voorgekom en dus kon ons dit net roep;
    //Maar in die word daar spesifieke goed geroep soos email wat net in een van die klasse voorkom;
    //Dus gebruik ons "instanceof" wat as die object van Contact extended het na 'n spesifieke subklas soos PersonalContact sal hy uitvoer;
    System.out.println("\n+++PersonalContact+++");
    for(int x = 0; x < contactObject.length; x++)
    {
      if(contactObject[x]instanceof PersonalContact)
      //Onthou dat in die lyn hier onder is die method getBirthday() deel van PersonalContact en dus moet ons hom cast (PersonalContact);
      //Mens kan nie hom gebruik as hy nie van sy oorsprong is nie .. ;
        System.out.println("Naam: " + contactObject[x].getNaam() + " Birthday: " + ((PersonalContact) contactObject[x]).getBirthday());
    }
    //In die boonste for loops het die method in beide voorgekom en dus kon ons dit net roep;
    //Maar in die word daar spesifieke goed geroep soos email wat net in een van die klasse voorkom;
    //Dus gebruik ons "instanceof" wat as die object van Contact extended het na 'n spesifieke subklas soos PersonalContact sal hy uitvoer;
    System.out.println("\n+++BusinessContact+++");
    for(int x = 0; x < contactObject.length; x++)
    {
      if(contactObject[x]instanceof BusinessContact)
      //Onthou dat in die lyn hier onder is die method getCompanyName() deel van BusinessContact en dus moet ons hom cast (BusinessContact);
      //Mens kan nie hom gebruik as hy nie van sy oorsprong is nie ..;
        System.out.println("Naam: " + contactObject[x].getNaam() + " Company Name: " + ((BusinessContact) contactObject[x]).getCompanyName());
    }

    ObjectOutputStream stream;
    try
    {
      stream = new ObjectOutputStream(new FileOutputStream("Serialize.ser"));
      stream.writeObject(contactObject);
      stream.close();
    }
    catch(IOException ex)
    {
      System.out.println("Error" + ex);
    }

  }
}
