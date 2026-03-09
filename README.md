# CIS4340 Lab 2

## 1  Objective
Create a *GitHub* repository for **10** short Java programs with known security problems as identified in the *SEI CERT Oracle Coding Standard for Java*, then solve those security problems and use *GitHub* to track applied changes.

## 2  Requirements
*GitHub* will be the major part of this assignment and the next assignment. First off, here’s a quick *GitHub* overview. *GitHub* is a code hosting platform for version control and collaboration. It lets you and others work together on projects from anywhere. *GitHub* uses the following elements and actions to manage codebases - for a single user or *many* users. Some important ideas are shown in the diagram below.

![GitHub Pull Request](https://axolo.s3.eu-west-3.amazonaws.com/communication/blog/ultimate-pull-request/Branches+in+GitHub.png)

Some important terms to know when using *GitHub* include:
- **Repository:** A collection of one to many files.
- **Branch:** A subset of the *repository* consisting of a file or files.
- **Pull:** The act of selecting a file or files to put into a *branch* that will be updated or undergoing some modifications.
- **Merge:** Accepts all the modifications to the selected file or files, and updates the *Master* branch with those modifications. This merged product will be the new baseline *Master.*

It is important to note that this can be accomplished thru the GitHub website or by using the GitHub application installed on your PC. A very good command line tutorial is available at https://www.liquidlight.co.uk/blog/git-for-beginners-an-overview-and-basic-workflow/. (This is a very useful tutorial for those of you comfortable with the Linux & Mac OSX terminal.)

### 2.1  GitHub Account
A *GitHub* account is required for this assignment for two primary reasons. The first is to walk through a modern software production environment that uses some form of version control and change tracking. The second reason is that another assignment will require a *GitHub* account. We will be using this *GitHub* account for subsequent assignments.

Note that you have created a *repository*, a *branch*, added some code, pulled from another
*GitHub* account, modified the code, and merged it back into the *repository*. Those same
steps will be applied to the following problems - with one exception - *the changed code will
**not** be merged into the repository*. More about that later.

### 2.2  *SEI CERT Oracle Coding Standard for Java* problems
The Java rules and recommendations used in the *SEI CERT Oracle Coding Standard for Java* are a work in progress and reflect the current thinking of the secure coding community. Because this is a development website, many pages are incomplete or may contain errors. Nonetheless, we will be using this for a baseline set of a total of 10 short programming examples with *known security* deficiencies. There are **5 mandatory** examples to be included in your *GitHub* account and **5 user selected examples** to be included in your *GitHub* account to earn full credit for this assignment.

The *Coding Standard* consists of a set of *rules* which are defined as follows: Rules must meet the following criteria:
- Violation of the guideline is likely to result in a defect that may adversely affect the safety, reliability, or security of a system, for example, by introducing a security flaw that may result in an exploitable vulnerability.
- The guideline does not rely on source code annotations or assumptions.
- Conformance to the guideline can be determined through automated analysis (either static or dynamic), formal methods, or manual inspection techniques.

Rules are identified by the label *rule*, and each one has several examples.

#### 2.2.1  5 User-Selected Vulnerabilities
Based on the *5 items above* select 5 other well known Java vulnerabilities. Use the same procedure outlined above for the *mandatory* vulnerabilities. **Make sure to choose 5 different rule sets with a single example from the 5 unique rules.**

#### 2.2.2  Filenames
The filenames shown above for the 5 *mandatory* code fragments are the concatenation of the *rule number* and the *specific code example* separated by an *underscore* (-). Use that same technique for name generation for the 5 examples you choose.
