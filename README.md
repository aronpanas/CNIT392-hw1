CNIT 392
HW 1
Group Members : Min Gyeong Kang(Emma), Stephen Bergman, Aron Panas
Due Date: 03/04/19 2AM
 
Step-by-step instructions:
Preparation and Analysis of the problem:
1)      As a starting point, take UMLs that you submitted for Lab 4.  Discuss your submissions in your group and agree on an acceptable UML that you wish to take as a starting point. You may simplify your UML, but it still must meet the following:
a)      It should contain at least 5 classes
b)      It should have at least one subclass
c)      Each of the classes should have at least one association with another class
 
2)      Outline which of the requirements originally presented in the scenario for Labs 3 and 4 are no longer applicable due to your restriction of classes. (If you wish to retype the scenario and highlight what is no longer covered, it will be accepted)
A hit can only be assigned to one album
 
3)      In 15 words or less per requirement, describe at least one requirement that you will not be able to do with relational database. You will need to implement it, so be realistic. 
A user can only be a business user or a regular user
	
 
4)      Follow your book example of ODL to describe classes that you will work with. You will submit this description. 

 Class ARTIST
{
attribute string artistName;
Attribute date Birthdate;
Attribute string URL;
Relationship set<ARTIST> writes
inverse SONG:: wrote_by;
String GET_URL();
String GET_ARTISTNAME();
String GET_ARTISTBIRTHDATE();
Void SET_artistName(in string new_artistName);
Void SET_URL(in string new_url);
Void SET_artistbirthdate(in string new_artistbirthdate);
}

Class SONG
{
Attribute string title;
Attribute string artistName;,,?(foreign key?)
Attribute int year;
Attribute string genre;
Attribute string length;
Relationship set <SONG> wrote_by
Inverse ARTIST:: writes;
String GET_year();
String GET_genre();
String GET_length();
Void SET_TITLE(in string new_title);
}

Class SINGLE extends SONG
{
Relationship set < SINGLE> purchases
Inverse <REGULAR> purchased_by;
Relationship set <SINGLE> posts
Inverse <REGULAR>:: posted_by;
}

Class HIT extends SONG
{
Attribute string tracknumber;
Relationship set <HIT> makes_up
Inverse ALBUM:: made_by;
Relationship set <HIT> posts
Inverse BUSINESSUSER:: posted_by;
String GET_tracknumber();
Void SET_tracknumber(in string new_tracknumber);
}

Class ALBUM
{
Attribute string albumNumber;
Relationship set <HIT> makes_up_album
Inverse HIT is_made_up;
Relationship set <USER> purchases
Inverse USER is purchased by;
String GET_albumNumber();
Void SET_albumNumber(in string new_albumNumber);
}

Class User
{
Attribute long ID;
Attribute string NAME;
Attribute string ADDRESS;
Long getid()
Void setID(Long setID)
String getName()
Void setName(String setName)
String getAddress()
Void setAddress(String setAddress)
}

Class BusinessUser extends User
{
Attribute string VATnumber;
Relationship set <BusinessUser> posts
Inverse BusinessUsers:: posted_by;
Relationship BusinessUser posted_by
Inverse BusinessUser posts;
String getVAT();
Void setVAT(String setVAT);
String postHIt();
String postSong();
}

Class RegularUser extends User
{
Relationship set <RegularUser> purchases
Inverse RegularUser:: purchased_by;
Relationship RegularUser purchased_by
Inverse RegularUser purchases;
String purchaseAlbum();
String purchaseSong();
}

5)      Decide what 25 objects you would need to work with to get a feel of OODB.  Make sure that you have at least 2 pairs of objects that have exactly the same states.  What kind of characteristics they will have, what behaviors they will exhibit. Decide what you would like to keep persistent, and what can be transient, if anything.
 
Artist artist1 = new Artist(“Ariana Grande”, “06/23/1993”,”docs.google.com”);
Artist artist2 = new Artist(“PSY”,”12/31/1977”,”purdue.edu”);
Artist artist3 = new Artist(“GZA”, “2/9/1975”, “36chambersdojo.com”);
Song song1 = new Song("7rings","3:04","pop",2019);
Song song2 = new Song("Thank u, Next","3:27","pop",2019);
Song song3 = new Song("Liquid Swords","4:32","GZA",1992);
Song song4 = new Song("Living in the World Today","4:23","GZA",1992);
Song song5 = new Song("Gangnam Style","4:15","k-pop",2012);
User user1 = new User(“01”, “Joe Shmoe”, “23 University Street”);
User user2 = new User(“02”, “Rick James”, “135 Alley Road”);
User user3 = new User(“03”, “John Doe”, “1234 Main Street”);
User user4 = new User(“04”, “Jane Doe”, “4334 State Street”);
User user5 = new User(“05”, “Emma Kang”, “430 W Wood Street”);
Business business1 = new Business(“4321”);
Business business2 = new Business(“5678”);
Business business3 = new Business(“6969”);
Business business4 = new Business(“1010”);
Hit hit1 = new Hit(“7rings”,”Ariana Grande”, “2019”, “pop”,”3:04”, “1”);
Hit hit2 = new Hit(“Liquid Swords”, “GZA”, “1992”, 4:32, “1”);
Hit hit3 = new Hit(“Gangnam Style”, “2012”,”k-pop”,”4:15”, “5”);
Single single1 = new Single(“Thank u, Next”, “Ariana Grande”, “2019”, “pop”, “3:27”);
Album album1 = new Album(“1234567890”);
Album album2 = new Album(“0123456789”);
Album album3 = new Album(“9012345678”);
Album album4 = new Album(“8901234567”);
Album album5 = new Album(“7890123456”);
 
6)      Given your design, list three scenarios where you would want to query information about the states of your objects. Identify the states and the QDL command, per your book, that would give you this information.
	
A user wants to know the website of Ariana Grande
	SELECT artistname, URL FROM ARTIST WHERE artistname = “Ariana Grande”;
The number of users on the site
	SELECT COUNT(name) FROM USER;
Count the number of songs of Ariana Grande. 
	Select artist.artistname, COUNT(title) from SONG inner join artist on song.artistname = artist.artistname where artistname = “Ariana Grande” having artist.artistname;
 
7)      Given your design, outline three scenarios where you would want to alter one of the objects states.  Describe what states you would alter and why.
Ariana Grande wants to change her name to Ariana G because her old name was too popular
	UPDATE ARTIST SET artistname = “Ariana G” WHERE artistname = “Ariana Grande”;
Rick James wants to update their address to the new address they just moved to. 
	UPDATE USER SET address = “13820 Guild Avenue” WHERE name = “Rick James”;
PSY wants to change his URL to a shortened, easier to remember one.
	UPDATE ARTIST SET URL = “newsite.gov” WHERE artistname = “PSY”;
 
 
Implementation:
1)      Install your DMBS.  Note that ObjectDB is provided on Blackboard. You may work with any IDE of your choice (NetBeans, Eclipse, etc)
 
2)      Follow https://www.objectdb.com/java/jpa  to define your classes based on Step (4) of your analysis.  Discuss whether everything that you outlined in Step (4) of Analysis can be implemented in ObjectDB. What kind of changes do you need to make? 

	It was little bit difficult to implement all parts we outlined in Step (4) because of the unfamiliar language. The primary key 	had been expressed by adding “@Id @GeneratedValue” front of data type of the attribute. Also, we had to create each entities and a new database to store new values.
3)      Create your 25 objects and write them to your DB. 
 
4)      Create another program that will be able to perform Steps (6) and (7) above. 
 
5)      Use DBexplorer to received answers to Step (6) above.
 
 
To submit:
·  All steps of preparation and analysis
·  Steps 2-5 from Implementation

Class Diagram this is based off of



