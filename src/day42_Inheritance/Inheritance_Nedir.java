package day42_Inheritance;

public class Inheritance_Nedir {

    /*  Inheritance (Kalıtım) Nedir?
        Bir sınıfın başka bir sınıftan özelliklerini ve metotlarını miras almasıdır.


   Inheritance===> to build IS A relationship between the classes. parent and child classes
			 easiest and fastest way to get rich ==> extends

			child class (sub):  can inherit methods and variables from parent class (ONLY the visible variables and methods)

   Constructor cannot be inherited, constructor 'da class name ve constructor class name in ayni olmasi gerekir. Ama Inheritance Parent class da; bu mumkun olmaz bu yuzden contructor asla inherited olmaz

					public: inheritable at every where

					protected: visibile and inheritable within same package. aslo visible to the sub classes outside package

					default: inheritable within same package

					Public > Protected > default > private

					public & protected can be inherited to ANY sub class


TODO-			Parent class (super): Cannot Inherit from sub class


			advantages:
				 reusable
				 less codes
				 easy to maintain
=============================================================
      Method overloading===>same method name, different parameters
		                    returnType does not matter
	                    	Any method can be overloaded


    Method overriding====>  same method name, same parameter
						MUST happen in subclass

						ONLY instance can be overriden (private)

						access modifier: MUST be same or more visible
						returnType: MUST be same
						@override annotation MUST be applicable


Overriding Ne Demek?

    Miras aldığımız metodları aynı isimle kendi classımızda da tanımlarsak bu metodu
    çağırdığımız zaman artık miras aldığımız değil kendi metodumuz çağrılacak.
    Yani kendi classımızda bulunan aynı isimli metot çağrılacaktır.
    Buna inheritance da ki overriding kavramı diyoruz. Overriding yaparak aslında super classtaki metodu iptal etmiş oluyoruz.




*/



}
