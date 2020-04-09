import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
//Naam van class met skrywing en met alles wat ons gaan implement of extend;
public abstract class Contact implements Serializable
{
  //Alle vars in die classes is "private";
  private String naam, telnum;
  //Maak altyd 'n defualt constructor;
/**Defualt Constructor*/
  public Contact()
  {
    this("","");
  }
  //Overloaded constructor is die een wat altyd veronderstel is om die werk te doen;
  //Moet meer of ander params he as die defualt, dis die doel van overloaded;
  //Indien selfde name aan byde parm en var gebruik is gebruik ons "this." ;
  public Contact(String naam , String telnum)
  {
    setNaam(naam);
    setTelNum(telnum);
  }
  //"get" verkry ons die var se waarde;
  public String getNaam()
  {
    return naam;
  }
  //"get" verkry ons die var se waarde;
  public String getTelNum()
  {
    return telnum;
  }
  //"set" stel ons waarde aan die var aan;
  //"set" kry ook 'n enkel parm wat die waarde van die var is;
  //Indien selfde name aan byde parm en var gebruik is gebruik ons "this." ;
  public void setNaam(String name)
  {
    naam  = name;
  }
  //"set" stel ons waarde aan die var aan;
  //"set" kry ook 'n enkel parm wat die waarde van die var is;
  //Indien selfde name aan byde parm en var gebruik is gebruik ons "this." ;
  public void setTelNum(String cell)
  {
    Pattern pattern =  Pattern.compile("\\d{10}");
    Matcher matcher =  pattern.matcher(cell);
    if(matcher.matches())
    telnum = cell;
    else
    throw new InvalidPhoneNumberException(cell);
  }
  //Abstract method het geen lyf(Body) nie en gaan eers gevul word in die classe wat die een extend;
  //Abstract method is 'n method wat in beide sub classe voorkom maar verskillend is;
  public abstract String getContactDetails();
}
