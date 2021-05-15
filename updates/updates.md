# library v1.0
### Update by user arshiaor 16/5/2021  1:02 AM
### last commit code :
---
### updates :
**Boss** Has a unique user name and password <br />
the submitted username for all objects are their ID(can be member ID or employee ID) and their password is their national ID.<br/>

**Librarian** : Librarians do need account to sign in their pannel which should be created by the Boss,librarians can CREATE,READ,UPDATE and DELETE both Members and Books.
>Note! The book management methods have been used parallel to **Shelf** class that will be noted later
>Note! we have memberverifySignIn for both classes **Librarian*8 and **Member_CRUD** .
**Member** : contains members' properties<br/>

**Book**: contains book properties.<br/>

**Member_CRUD** : each member can be created by librarians or he/she can sign up by themselves,so this class has methods to Show each member's information,ability to update or delete their account and methods to verify member signup and sign in.
>Note! Members who are created by librarians can have manual member ID but the ones who sign up themselves, a random member iD will be assigned to them.

**Person** : Mostly has primitive properties like name, family and national ID that will be inherited by other classes.
