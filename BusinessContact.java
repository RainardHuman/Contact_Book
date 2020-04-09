//Naam van class met skrywing en met alles wat ons gaan implement of extend;
public  class BusinessContact extends Contact
{
//Alle vars in die classes is "private";
private String email, companyName;
//Maak altyd 'n defualt constructor;
public BusinessContact()
{
  this("","","","");
}
//Overloaded constructor is die een wat altyd veronderstel is om die werk te doen;
//Moet meer of ander params he as die defualt, dis die doel van overloaded;
//Indien selfde name aan byde parm en var gebruik is gebruik ons "this." ;
public BusinessContact(String naam , String telnum ,String email,String companyName)
{
  super(naam,telnum);
  setEmail(email);
  setCompanyName(companyName);
}
//"get" verkry ons die var se waarde;
public String getEmail()
{
  return email;
}
//"get" verkry ons die var se waarde;
public String getCompanyName()
{
  return companyName;
}
//"set" stel ons waarde aan die var aan;
//"set" kry ook 'n enkel parm wat die waarde van die var is;
//Indien selfde name aan byde parm en var gebruik is gebruik ons "this." ;
public void setEmail(String email)
{
  this.email = email;
}
//"set" stel ons waarde aan die var aan;
//"set" kry ook 'n enkel parm wat die waarde van die var is;
//Indien selfde name aan byde parm en var gebruik is gebruik ons "this." ;
public void setCompanyName(String companyName)
{
  this.companyName = companyName;
}
//Abstract method het geen lyf(Body) nie en gaan eers gevul word in die classe wat die een extend;
//Abstract method is 'n method wat in beide sub classe voorkom maar verskillend is;
//Hier word hy gevul;
public String getContactDetails()
{
    return "Name: " + super.getNaam() + " Telephone Number: " + super.getTelNum() + " Email: " + getEmail();
}
//toString is afvoer van of oor class;
//String representation van object is 'n beskrywing van die object en al sy vars;
//Onthou hergebruik code om vinnig te programmeer (getContactDetails() in toString is beter as om oor te tik)
public String toString()
{
  return getContactDetails() + "Company name:" + getCompanyName();
}
}
