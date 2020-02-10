SET SERVEROUTPUT ON               
BEGIN
    FOR const IN ( SELECT TABLE_NAME, CONSTRAINT_NAME
               FROM USER_CONSTRAINTS
               WHERE CONSTRAINT_TYPE IN ('R', 'C') /*Foreign Key and Check constraints.*/ )
    LOOP
        EXECUTE IMMEDIATE 'ALTER TABLE '||const.TABLE_NAME ||' DROP CONSTRAINT '||const.CONSTRAINT_NAME;
        DBMS_OUTPUT.PUT_LINE('Dropped constraint '||const.CONSTRAINT_NAME||' of table '||const.TABLE_NAME); 
    END LOOP;
END;
/

SET SERVEROUTPUT ON   
BEGIN
  --Bye Sequences!
  FOR i IN (SELECT us.sequence_name
              FROM USER_SEQUENCES us) LOOP
    EXECUTE IMMEDIATE 'drop sequence '|| i.sequence_name ||'';
  END LOOP;
  --Bye Tables!
  FOR i IN (SELECT ut.table_name
              FROM USER_TABLES ut) LOOP
    EXECUTE IMMEDIATE 'drop table '|| i.table_name ||' CASCADE CONSTRAINTS ';
  END LOOP;

END;
/

BEGIN  
  FOR i in (select trigger_name,owner 
              from dba_triggers 
             where trigger_name like '%_BI%' and owner = 'myTesting' ) LOOP  
    EXECUTE IMMEDIATE 'DROP TRIGGER '||i.owner||'.'||i.trigger_name;  
  END LOOP;  
END;
/