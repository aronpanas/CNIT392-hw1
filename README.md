CNIT 392
HW 1
Group Members : Min Gyeong Kang(Emma), Stephen Bergman, Aron Panas
Due Date: 03/01/19 2AM
 
Step-by-step instructions:
Preparation and Analysis of the problem:
1)      As a starting point, take UMLs that you submitted for Lab 4.  Discuss your submissions in your group and agree on an acceptable UML that you wish to take as a starting point. You may simplify your UML, but it still must meet the following:
a)      It should contain at least 5 classes
b)      It should have at least one subclass
c)      Each of the classes should have at least one association with another class
 
2)      Outline which of the requirements originally presented in the scenario for Labs 3 and 4 are no longer applicable due to your restriction of classes. (If you wish to retype the scenario and highlight what is no longer covered, it will be accepted)
A hit can only be assigned to one album
 
3)      In 15 words or less per requirement, describe at least one requirement that you will not be able to do with relational database. You will need to implement it, so be realistic. 
A user can only be a business user or a regular user.
	
 
4)      Follow your book example of ODL to describe classes that you will work with. You will submit this description. Need to change to ODL
Artist
artistName(PK)
Birthdate
URL
getArtistName()
setArtistName()
getArtistBirthdate()
setArtistBirthdate()
getURL()
setURL()
Song
Title(PK)
artistName(FK)
Year
Genre
Length
getTitle()
setTitle()
getArtistName()
setArtistName()
getYear()
setYear()
getGenre()
setGenre()
getLength()
setLength()
Single
Hit
TrackNumber
getTrackNumber()
setTrackNumber()
Album
AlbumNumber
getAlbumNumber()
setAlbumNumber()

User (Stephen)
ID
Name
Address 
getID()
setID()
getAddress()
setAddress()
getName()
setName()
Business User (Stephen)
VAT number
getVATnumber()
setVATnumber()
postSingle()
postHit()
Regular User (Stephen)
purchaseSingle()
purchaseAlbum()
 
5)      Decide what 25 objects you would need to work with to get a feel of OODB.  Make sure that you have at least 2 pairs of objects that have exactly the same states.  What kind of characteristics they will have, what behaviors they will exhibit. Decide what you would like to keep persistent, and what can be transient, if anything. 
Artist(“Ariana Grande”, “06/23/1993”,”docs.google.com”)
Artist(“PSY”,”12/31/1977”,”purdue.edu”)
Artist(“GZA”, “2/9/1975”, “36chambersdojo.com”)
Song(“7rings”,”Ariana Grande”, “2019”, “pop”,”3:04”)
Song(“Thank u, Next”, “Ariana Grande”, “2019”, “pop”, “3:27”)
Song(“Liquid Swords”, “GZA”, “1992”, “4:32”)
Song(“Living in the World Today”, “GZA”, “1992”, “4:23”)
Song(“Gangnam Style”, “2012”,”k-pop”,”4:15”)
User(“01”, “Joe Shmoe”, “23 University Street”)
User(“02”, “Rick James”, “135 Alley Road”)
User(“03”, “John Doe”, “1234 Main Street”)
User(“04”, “Jane Doe”, “4334 State Street”)
User(“05”, “Emma Kang”, “430 W Wood Street”)
Business(“4321”)
Business(“5678”)
Business(“6969”)
Business(“1010”)
Hit(“7rings”,”Ariana Grande”, “2019”, “pop”,”3:04”, “1”)
Hit(“Liquid Swords”, “GZA”, “1992”, 4:32, “1”)
Hit(“Gangnam Style”, “2012”,”k-pop”,”4:15”, “5”)
Single(“Thank u, Next”, “Ariana Grande”, “2019”, “pop”, “3:27”)
Album(“1234567890”)
Album(“0123456789”)
Album(“9012345678”)
Album(“8901234567”)
Album(“7890123456”)
 
6)      Given your design, list three scenarios where you would want to query information about the states of your objects. Identify the states and the QDL command, per your book, that would give you this information.
An Artist changes their name and website, it must be updated on the DB
A User is trying to change their name, but there is no way to know if it is them just based off their name. Querying the userID would help discern that it is actually the user
Need to double check that an album is made up of the correct songs, need a list of all the songs in it.
 
7)      Given your design, outline three scenarios where you would want to alter one of the objects states.  Describe what states you would alter and why.
ArtistName, if an artist decides to change their name
Address, if a user decides to move
URL, if an artist changes their primary web URL (tour dates, etc.)
 
 
Implementation:
1)      Install your DMBS.  Note that ObjectDB is provided on Blackboard. You may work with any IDE of your choice (NetBeans, Eclipse, etc)
 
2)      Follow https://www.objectdb.com/java/jpa  to define your classes based on Step (4) of your analysis.  Discuss whether everything that you outlined in Step (4) of Analysis can be implemented in ObjectDB. What kind of changes do you need to make? 
 
3)      Create your 25 objects and write them to your DB.
 
4)      Create another program that will be able to perform Steps (6) and (7) above. 
 
5)      Use DBexplorer to received answers to Step (6) above.
 
 
To submit:
·         All steps of preparation and analysis
·         Steps 2-5 from Implementation

Class Diagram this is based off of




