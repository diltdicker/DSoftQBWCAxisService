# DSoftQBWCAxisService

## Building AAR
* Make sure that you have properly set the AXIS_HOME environent variable.

* First download the required libs for compilation.

```mvn dependency:copy-dependencies -DoutputDirectory=maven-repository```

* Next run the ant script located in the (service) directory.

* The newly built .aar will appear in the (build) directory and will be ready for deployment.
