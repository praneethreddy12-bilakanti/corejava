cifference between String and StringBuffer
There are many differences between String and StringBuffer. A list of differences between String and StringBuffer are given below:

No.	                           String	                                                                                                                          StringBuffer
1)                        	String class is immutable.                                                   1)StringBuffer class is mutable.
2)	                        String is slow and consumes 
                                             more memory
                              when you concat too many strings
                               because every time
					               it creates new instance.	                                                    2)   StringBuffer is fast and consumes 
					                                                                                                                                                        less memory 
					                                                                                                                                                          when you cancat strings.
3)                	String class overrides the
                   equals() method of Object class.
                  So you can compare the contents  
               of two strings by equals() method.   	                               3) StringBuffer class doesn't override the equals() method 
                                                                                                                                                           of Object class.