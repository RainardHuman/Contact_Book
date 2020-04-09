public class TestException
{
  public static void main(String[] args)
  {
    //Try sodat as die program sou crash , hy eeder die error uitgooi;
    try
    {
      //Maak object van PersonalContact met verkeerde details;
      Contact Pobject = new PersonalContact("Rainard","083A783361","21 December");
    }
    //Error sal gevang word van ons eie InvalidPhoneNumberException class
    catch(InvalidPhoneNumberException ex)
    {
      //String voor die Exception cast hom na string makliker as om Exception te cast;
      System.out.println("Error:" + ex);
    }
    //Try sodat as die program sou crash , hy eeder die error uitgooi;
    try
    {
      //Maak object van BusinessContact met verkeerde details;
      Contact Bobject = new BusinessContact("Henco","09756419","henco.groenewald@gmail.com","Henco$Seun");
    }
    //Error sal gevang word van ons eie InvalidPhoneNumberException clas
    catch(InvalidPhoneNumberException ex)
    {
      //String voor die Exception cast hom na string makliker as om Exception te cast;
      System.out.println("Error:" + ex);
    }

  }
}
