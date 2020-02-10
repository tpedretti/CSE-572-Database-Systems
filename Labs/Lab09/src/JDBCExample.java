import java.sql.* ;

public class JDBCExample {
	
	 public static void main(String args[]) {
		 
		 try{  
 	    		//step1 load the driver class  
 			Class.forName("oracle.jdbc.driver.OracleDriver") ;
   
 			//step2 create  the connection object    
 			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@orafarm.cse.csusb.edu:1522:orcl", "tpedretti", "pt8635") ;
   
 			//step3 create the statement object
 			String query = "select distinct job_id, location_id from employees, departments where employees.department_id=departments.department_id and employees.department_id=80";
			
 			PreparedStatement pstmt_employees = con.prepareStatement(query) ;
   
 			//step4 execute query  
 			ResultSet rs_employees = pstmt_employees.executeQuery() ;
 			    					
 			while (rs_employees.next())
			{
 				System.out.println("Job ID:" + rs_employees.getString(1));
				System.out.println("Location ID:" + rs_employees.getString(2) + "\n");
 			}
			
			query = "select e.last_name, d.department_name, d.location_id, l.city from employees e, departments d, locations l where e.department_id=d.department_id and d.location_id=l.location_id and e.commission_pct is not null";			
 			pstmt_employees = con.prepareStatement(query) ;   
 			rs_employees = pstmt_employees.executeQuery() ;
 			    					
 			while (rs_employees.next())
			{
 				System.out.println("Last Name: " + rs_employees.getString(1));
				System.out.println("Department Name: " + rs_employees.getString(2));
				System.out.println("City: " + rs_employees.getString(2) + "\n");
 			}
			
			query = "select e.last_name, e.job_id, e.department_id, d.department_name from employees e join departments d  on(e.department_id=d.department_id) join   locations l on(d.location_id=l.location_id) where lower(l.city)='toronto'";			
 			pstmt_employees = con.prepareStatement(query) ;   
 			rs_employees = pstmt_employees.executeQuery() ;
 			    					
 			while (rs_employees.next())
			{
 				System.out.println("Last Name: " + rs_employees.getString(1));
				System.out.println("Job ID: " + rs_employees.getString(2));
				System.out.println("Department ID: " + rs_employees.getString(3));
				System.out.println("Department Name: " + rs_employees.getString(4) + "\n");
 			}
			
			query = "select w.last_name \"employee\", w.employee_id \"emp#\", m.last_name \"manager\", m.employee_id  \"mgr#\" from employees w join employees m on(w.manager_id=m.employee_id)";			
 			pstmt_employees = con.prepareStatement(query) ;   
 			rs_employees = pstmt_employees.executeQuery() ;
 			    					
 			while (rs_employees.next())
			{
 				System.out.println("Last Name: " + rs_employees.getString(1));
				System.out.println("Employee ID: " + rs_employees.getString(2));
				System.out.println("Manager Last Name: " + rs_employees.getString(3));
				System.out.println("Manager ID: " + rs_employees.getString(4) + "\n");
 			}
			
			query = "SELECT w.last_name, w.hire_date, m.last_name, m.hire_date FROM   employees w, employees m WHERE w.manager_id=m.employee_id AND w.hire_date <  m.hire_date";			
 			pstmt_employees = con.prepareStatement(query) ;   
 			rs_employees = pstmt_employees.executeQuery() ;
 			    					
 			while (rs_employees.next())
			{
 				System.out.println("Last Name: " + rs_employees.getString(1));
				System.out.println("Hire Date: " + rs_employees.getString(2));
				System.out.println("Manager Last Name: " + rs_employees.getString(3));
				System.out.println("Manager Hire Date: " + rs_employees.getString(4) + "\n");
 			}
			
		 } catch(Exception e){ System.out.println(e);}	
 
	 }

}
