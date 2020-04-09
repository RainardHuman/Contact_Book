public class InvalidPhoneNumberException extends RuntimeException
{
  //Default constructor so as daar geen parm gestuur is nie gaan die program nie crash nie;
  public InvalidPhoneNumberException()
  {
      //"this" sal homself roep en dus dan die overloaded constructor roep omrede hy 'n parm het en dan verder aangaan by die overloaded constructor;
      this("");
  }
  //Overloaded constructor ontvang die parm van die Contact class en kan dan hier uitgegooi word;
  public InvalidPhoneNumberException(String reason)
  {
    System.out.println("InvalidPhoneNumberException: " + reason + " must be in form XXXXXXXXXX as digits");
  }
}
