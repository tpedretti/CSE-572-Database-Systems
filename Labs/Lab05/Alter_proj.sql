ALTER TABLE proj ADD CONSTRAINT proj_pk PRIMARY KEY (proNumber);
ALTER TABLE proj ADD CONSTRAINT proj_Col FOREIGN KEY (deptNo) REFERENCES dept (deptNo);