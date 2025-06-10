cd C:\Users\Student\Documents\Java\day13-oop; "JAVA_HOME=C:\\Program Files\\Apache NetBeans\\jdk" cmd /c "\"C:\\Program Files\\Apache NetBeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" \"-Dexec.executable=C:\\Program Files\\Apache NetBeans\\jdk\\bin\\java.exe\" -Dexec.mainClass=com.mycompany.day13.oop.main -Dexec.classpathScope=runtime -Dexec.appArgs= \"-Dmaven.ext.class.path=C:\\Program Files\\Apache NetBeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/C:/Program%20Files/Apache%20NetBeans/java/maven/lib/jansi-2.4.1.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/C:/Program%20Files/Apache%20NetBeans/java/maven/lib/guava-33.2.1-jre.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Scanning for projects...

----------------------< com.mycompany:day13-oop >-----------------------
Building day13-oop 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ day13-oop ---
skip non existing resourceDirectory C:\Users\Student\Documents\Java\day13-oop\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ day13-oop ---
Nothing to compile - all classes are up to date.

--- exec:3.1.0:exec (default-cli) @ day13-oop ---
Enter employee number:
5000
Enter employee name:
pop
Enter employee address
popl
Enter employee hoursWorked
9
Enter PAY RATE PER HOUR
6000
Enter SALES AMOUNT
32000
employee no 5000: employee name: pop address: popl
 54000.0employee no 5000: employee name: pop address: popl
 
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  30.186 s
Finished at: 2025-06-10T16:59:01+03:00
------------------------------------------------------------------------
