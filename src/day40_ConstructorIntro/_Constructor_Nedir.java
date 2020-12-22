package day40_ConstructorIntro;

import com.sun.tools.javac.resources.compiler;

public class _Constructor_Nedir {
    /*

                 CONSTRUCTOR ======> A special method that every class MUST have

                                     It’s used when we create the objects of a class

                                     We can use constructors to initialize the object’s instance variables.

                                     Execution of a constructor ALWAYS depends on the object

constructor , it cannot be inheritance
-------------------------------------------------------
             this: refers to the object instances
	            this. : to call instance variables or methods
	                this() :  call constructor

-------------------------------------------------------

Constructor call: this()
			1. only a constructor can call another constructor
			2. constructor can be OVERLOADED. the only way to have more than one

constructor in class
			3. constructor cannot be called by constructor name. we need this()
			4. constructor call MUST be at first step
			5. one constructor can ONLY call one constructor
			6. Constructor cannot call or contain itself

------------------------------------------------------
         REGULAR METHODS=====>

    Access Modidifier  specifier  returnType methodName(Parameter){

    }

---------
        CONSTRUCTOR=======>  every class MUST have. if we dont create, compiler creates one (with NO ARGUMENT)

                             only gets executed when we create the object
    declear:

    Access Modidifier   ClassName(parameter){

    }
-------------------------------------------------------------

Yapılandırıcı metotlar (CONSTRUCTORS)

 nesne oluşturduğumuz anda çalıştırılan metotlardır. Herhangi bir geri dönüş tipi yoktur. Evet, ilginç ama void tipinde dahi bir geri dönüşü yoktur.
  Bir yapılandırıcının yaptığı iş, bir nesneyi ilk kullanıma hazırlamaktır.


Yapılandırıcı metotları şu şekilde özetleyebiliriz:

· Yapılandırıcıların erişim belirteci mutlaka ama mutlaka public olmalıdır.

· Yapılandırıcıların adı sınıfın adıyla aynı olmalıdır.

· Yapılandırıcı metot çağrılırken new anahtar sözcüğü kullanılır.

· Yapılandırıcılar bellekte nesneye bir yer ayrılmasını sağlarlar.

· Yapılandırıcılar her çağrılışlarında yeni bir nesne oluştururlar.







*/


}
