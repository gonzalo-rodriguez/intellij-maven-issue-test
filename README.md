Test project used to demonstrate an apparent issue with Maven projects in IntelliJ Ultimate 2023.3.3.

Importing the pom.xml from the parent project as a Maven project and then running clean install from IntelliJ ends up showing a "error: package org.apache.log4j does not exist", even though the dependency is being recognized by IntelliJ and shown both in the project dependencies and the module dependencies.
