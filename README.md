# Assignment 3
The relevant mtl file can be found at:

[no.tdt4250.assignment3.html/src/no/tdt4250/assignment3/main/departmentToHtmlGenerator.mtl](no.tdt4250.assignment3.html/src/no/tdt4250/assignment3/main/departmentToHtmlGenerator.mtl)

The relevant xmi file that it can generate html from can be found at:
[no.tdt4250.assignment1.model/model/Department.xmi](no.tdt4250.assignment1.model/model/Department.xmi)

**NOTE:** the location of the xmi and ecore file depends on the "platform:" path of eclipse, so the path might have to be changed to fit your system.  If the system can not find the ecore file based on the given .xmi then change line 5 in the xmi file to fit your path. The line looks like the one below.
```
    xmlns:no.tdt4250.assignment1.model="platform:/resource/no.tdt4250.assignment1.model/model/courceList.ecore"
```

## Changes made to assignment 1
The .xmi file had error to show that the validation worked. This was removed so that the .mtl file could build the html, but this quick fix meant that it contains duplicate info.

**NOTE:** The duplicate info means that some files are generated more than once, and the overwritten info means that there are no hyperlinks to other files. The best file to look at for checking the validity of this assignment can be found at: 

```
no.tdt4250.assignment3.html/target/DepartmentofComputerScience.html
```

After running the .mtl file if the target folder is used for output.

# Assignment 1 parts

The ecore model that contains the model relevant for assignment 1 can be found in:


```
no.tdt4250.assignment1.model/model/courceList.ecore
```

Features that the model should be able to cover:

- [ ] Courses mandatory/elective
	- [x] Status can be O(obligatory), VA(elective), M2A(At least two in group) or other
	- [x] Status can differ between studyprogrammes.
	- [ ] Status defines a constraint/validation that proibits certain combinations automatically
	- [x] Course can be mandaroty for one specialization and elective for an other.
- [ ] Master must contain a minimum of Higher level courses.
- [x] Containment relation.
- [x] Container relation.
- [x] Standard relation.
- [x] Recurcive relation.
- [x] Class attribute.
- [x] Enum.
- [ ] Abstract class
- [ ] Super class
- [x] Class derived attribute. __Example: CourceSpecification name attribute__
- [x] OCL defined getter/setter __Example: CourceSpecification name attribute__
- [x] OCL defined validation __Example: EvaluationForm: weightMustBeComplete __
- [ ] Java defined validation.
- [x] 1 to 1 and 0 to many multiplicity.
- [x] .xmi file with test data.
- [ ] Faculty owns courses.
- [x] Study programmes can change from year to year.
- [x] Courses can change from year to year.
- [x] Courses can be taught either at spring, autumn or both.
- [x] Programmes can be of bachlor, master, phd, etc..

Note: The department.xmi file contains invalid information as the test data is not complete. It is still usefull for testing the system.