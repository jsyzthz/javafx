# Readme for verifying the bug

It seems that the native launcher on windows-systems is not being able to pass non-latin parameters (like filenames) to the JVM. To reproduce this issue, please ***don't*** use any IDE on this project, a simple terminal/commandline is sufficient.


# Generate the native bundle
```
C:\tmp\javafx> mvn clean jfx:native
```

This should generate some files for reproducing.


# Executing with generated javafx-jar
***(current path is project-root)***

```
C:\tmp\javafx> java -jar target\jfx\app\test-jfx.jar 中国.test
```
This works flawless and works like expected!

# Executing with generated native launcher

```
C:\tmp\javafx> target\jfx\native\test\test.exe 中国.test
```

This does NOT work, and this is the bug. It seems that there is a problem with the used native exe-file, which has problems with non-latin characters. Changing the filename to something like "working.test" is (as suggested by the filename) working.

Reproducable on:
- Windows 7 (64bit)
- Windows 8.1 (64bit)

Reproducable with JDK:
- 1.8.0u72
- 1.8.0u92