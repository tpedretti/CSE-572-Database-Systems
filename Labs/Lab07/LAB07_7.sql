select e.last_name as "EMPLOYEE" , e.employee_id "EMP#", m.last_name "MANAGER", m.manager_id "MGR#" from hr.employees e left outer join hr.employees m on (e.manager_id = m.employee_id);