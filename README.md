# Association



Hibernate Associations
This repository demonstrates the implementation of various associations in Hibernate. Below is a summary of the relationships implemented:

<H2>1. One-to-One</H2>

<p>In this association:
Two entities: Laptop and Student.
Each student is assigned a single laptop, showcasing a one-to-one relationship.</p>
<H2>2. One-to-Many</H2>
<p>In this association:
A single department (Department) can have multiple employees (Employee).
This demonstrates a one-to-many relationship.</p>
<H2>3. Many-to-One</H2>
<p>In this association:
Many employees (Employee) work on a single project (Project).
This demonstrates a many-to-one relationship, which is the reverse of the one-to-many relationship.</p>
<H2>4. Many-to-Many</H2>
<p>In this association:
Multiple students (Student) can enroll in multiple courses (Course), and each course can have multiple students enrolled.
Note: An attempt was made to join the Course column directly with the Student table, without creating a third join table. However, this approach could not achieve the desired functionality.</p>
