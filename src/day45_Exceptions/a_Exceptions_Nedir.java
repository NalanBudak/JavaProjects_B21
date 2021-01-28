package day45_Exceptions;

public class a_Exceptions_Nedir {
    }/*
     OOP:
	    Encapsulation
	    Inheritance

	    Abstraction
	    Polymorphism

    Exception:
        checked & unchecked Exception
	    try & catch
	    multi-catch
	    finally

	    throws & throw
	    custom exceptions
===================================================

    Exception====> unexpected or unwanted events

	unchecked Exceptions (Unexpected)====> occures during runtime

					                        RunTimeException class is the parent of all Unchcked exception

					                        all Runtime exceptions are Uncheked Exception

	checked Exceptions (Unwanted)====>    occures during compile time

				                          all exceptions that are not run time are checked exceptions


Exception Handlings:

		1. try & catch blocks======> Used for handling both checked and unchecked exceptions

					try{
						exception statements;
					} catch(ExceptionClass e){
						statements
					}


				multi catch block===> parent exception type CAN NOT be placed before child exception type

									 for unchecked exceptions


				finally block=====> always gets executed regardless of the exception

								    not mandatory



	   2. throws keyword====> used for handling checked exceptions
	   						 placed in method signature, indicates that method throws an exception

	   						 caller of the method will be responsible for handling the exception


          throw====> manually throw an exception.We use it inside the method manually.( biz yeni object create ediyoruz throw keyword ile.)

		 throw ObjectOfExceptionClass


            "Cybertek"



        Custom Exceptions====>
	How to create custom unchecked exception? ====>  By inheriting RuntimeException class


	How to create custom checked exception?  ====>   By inheriting Exception class






 */
