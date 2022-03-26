import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
class BasicCalculator
{

}
interface Communication1
{
  public void phone(long num);
  public void message(String word);
}
interface Communication2{
  public void fromAddress(String add1);
  public void toAddress(String add2);
  public void subject(String sub);
  public void mailText(String mailsms);
  public void mailSent(String mail);
}
interface Communication3{
  public void recipient(String recname);
  public void cliqText(String cliqsms);
  public void cliqSent(String cliq);
}
interface Datetime
{
  public void date(long currentdate);
  public void time(long currenttime); 
}
  

class Whatsapp implements Communication1,Datetime
{
  public void phone(long num)
  {
    System.out.println();
  }

  public void message(String word)
  {
    System.out.println("Message sent.");
  }

  public void date(long currentdate)
  {
    System.out.println();
  }

  public void time(long currenttime)
  {
    System.out.println();
  }
}


class Email implements Communication2,Datetime
{

  public void fromAddress(String add1)
  {
    System.out.println();
  }

  public void toAddress(String add2)
  {
    System.out.println();
  }

  public void subject(String sub)
  {
    System.out.println();
  }

  public void mailText(String mailsms)
  {
      System.out.println();
  }


  public void mailSent(String mail)
  {
    System.out.println("Mail sent.");
  }

   public void date(long currentdate)
  {
    System.out.println(java.time.LocalDate.now());
  }


  public void time(long currenttime)
  {
    System.out.println(java.time.LocalTime.now());
  }
}


class Cliqmessage implements Communication3,Datetime
{
   public void recipient(String recname)
  {
    System.out.println();
  }

  public void cliqText(String cliqsms)
  {
      System.out.println();
  }

  public void cliqSent(String cliq)
  {
    System.out.println("Message sent.");
  }

   public void date(long currentdate)
  {
    System.out.println(java.time.LocalDate.now());
  }


  public void time(long currenttime)
  {
    System.out.println(java.time.LocalTime.now());
  }
}


class Socialmedia
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("1.Whatsapp\n2.Email\n3.Cliqmessage\nEnter your option");
    int ans=scan.nextInt();
    Whatsapp m1=new Whatsapp();
    Email m2=new Email();
    Cliqmessage m3=new Cliqmessage();
    switch(ans)
    {
        case 1:
            System.out.println("Enter the phone number:");
            long num=scan.nextLong();
            m1.phone(num);
            System.out.println("Text message:");
            String word=scan.next();
            System.out.println(java.time.LocalDate.now());
            System.out.println(java.time.LocalTime.now());
            m1.message(word);
            break;
        
        case 2:
            
            System.out.print("Enter from address: ");
            String add1=scan.next();
            m2.fromAddress(add1);
            System.out.print("Enter to address: ");
            String add2=scan.next();
            m2.toAddress(add2);
            System.out.print("Enter the subject: ");
            String sub=scan.next();
            m2.subject(sub);
            System.out.println("Text message:");
            String mailsms=scan.next();
            m2.mailText(mailsms);
            System.out.println(java.time.LocalDate.now());
            System.out.println(java.time.LocalTime.now());
            m2.mailSent("Mail sent");
            
            break;

        case 3:
           
            System.out.println("Enetr Recipient name: ");
            String recname=scan.next();
            m3.recipient(recname);
            System.out.println("Text message:");
            String cliqsms=scan.next();
            m3.cliqText(cliqsms);
            System.out.println(java.time.LocalDate.now());
            System.out.println(java.time.LocalTime.now());
            m3.cliqSent("Message sent");
            
            break;
    }
    
  }
}
