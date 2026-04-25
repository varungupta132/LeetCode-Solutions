# Write your MySQL query statement below

select patient_id , patient_name , conditions  from Patients where conditions like "DIAB1%"
  OR conditions LIKE '% DIAB1%';


-- SELECT patient_id, patient_name, conditions
-- FROM Patients
-- WHERE conditions LIKE 'DIAB1%' 
--    OR conditions LIKE '% DIAB1%';


# Write your MySQL query statement below

-- select patient_id , patient_name , conditions  from Patients where condition in (
--     select conditions fron Patients like "DIAB1"% 
-- ) 