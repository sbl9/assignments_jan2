package jan2JavaExam;

public class Program9 {
//create 3 Threads and create deadlock situation -prog will never terminate


	 String str1 = "Java";
	    String str2 = "UNIX";
	    String str3="C lang";
	    
	    Thread trd1 = new Thread("My Thread 1"){
	        public void run(){
	            while(true){
	                synchronized(str1){
	                    synchronized(str2){
	                        System.out.println(str1 + str2);
	                    }
	                }
	            }
	        }
	    };
	     
	    Thread trd2 = new Thread("My Thread 2"){
	        public void run(){
	            while(true){
	                synchronized(str2){
	                    synchronized(str3){
	                        System.out.println(str2 + str3);
	                    }
	                }
	            }
	        }
	    };
	    
	    Thread trd3=new Thread("My Thread 3") {
	    	public void run() {
	    		while(true) {
	    			synchronized(str3) {
	    				synchronized(str1) {
	    					System.out.println(str3+str1);
	    				}
	    			}
	    		}
	    	}
	    };
	     
	     
	    public static void main(String a[]){
	    	Program9 prog = new Program9();
	    	prog.trd1.start();
	    	prog.trd2.start();
	    	prog.trd3.start();
	    }
	}
