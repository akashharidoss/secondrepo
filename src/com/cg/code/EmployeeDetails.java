package com.cg.code;

public class EmployeeDetails {
	class EmployeeDetails
	{
	 
	   int emp_id, emp_salary;
	 
	   String emp_name, emp_address, emp_department, emp_email;
	 
	   public int getEmp_id()
	   {
	 
	      return emp_id;
	   }
	 
	   public void setEmp_id(int emp_id)
	   {
	 
	      this.emp_id = emp_id;
	   }
	 
	   public int getSalary()
	   {
	 
	     return emp_salary;
	 
	    }
	 
	    public void setSalary(int emp_salary)
	    {
	 
	       this.emp_salary = emp_salary;
	 
	    }
	 
	    public String getName()
	    {
	 
	       return emp_name;
	 
	    }
	 
	    public void setName(String emp_name)
	    {
	 
	       this.emp_name = emp_name;
	    }
	 
	   public String getAddress()
	   {
	 
	      return emp_address;
	 
	   }
	 
	  
	   public void setAddress(String emp_address)
	   {
	 
	      this.emp_address = emp_address;
	 
	   }
	 
	    public String getEmail()
	    {
	 
	       return emp_email;
	     }
	 
	     public void setEmail(String emp_email)
	     {
	 
	       this.emp_email = emp_email;
	 
	     }
	 
	    @Override
	 
	     public String toString()
	     {
	 
	        return " Employee details{ Id = "+ emp_id + "\n Salary="+salary+" + "\n Email = " + emp_email + "}";
	     }
	 
	}
	 
	public class Employee
	{
	 
	 
	   public static void main(String args[])
	   {
	 
	 
	      EmployeeDetails emp = new EmployeeDetails();
	 
	 
	      emp.setEmp_id(67);
	 
	      emp.setName("Sachin);
	 
	      emp.setSalary(30000);
	 
	      emp.setAddress("Mumbai");
	 
	      emp.setEmail("sachin234@gmail.com");
	 
	 
	      System.out.println(emp);
	 
	 
	     int sal = emp.getSalary();
	 
	     int increment = 0;
	 
	 
	     if ((sal &gt;=10000) &amp;&amp; (sal &lt;=50000))
	 
	     {
	 
	 
	        increment += (sal * 2)/100;
	 
	        sal = sal+increment;
	 
	        emp.setSalary(sal);
	 
	        System.out.println("\n Salary is incremented \n");
	 
	        System.out.println(emp);
	 
	    }
	    else if ((sal &gt;=50000) &amp;&amp; (sal &lt;=70000))
	    {
	 
	         increment += (sal * 5)/100;
	 
	         sal = sal+increment;
	 
	         emp.setSalary(sal);
	 
	         System.out.println("\n Salary is incremented \n");
	 
	         System.out.println(emp);
	 
	      }
	      else
	      {
	 
	          System.out.println("\n Salary is not incremented \n");
	 
	          System.out.println(emp);
	 
	       }

}
}