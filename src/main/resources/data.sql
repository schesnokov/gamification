INSERT INTO ATTRIBUTE (id, stat1, val1, stat2, val2, stat3, val3) VALUES  (1, 'Agility', 0, 'Strenght', 0, 'Intellect', 0),
                                                                          (2, 'Agility', 0, 'Strenght', 0, 'Intellect', 0),
                                                                          (3, 'Agility', 0, 'Strenght', 0, 'Intellect', 0),
                                                                          (4, 'Agility', 0, 'Strenght', 0, 'Intellect', 0),
                                                                          (5, 'Agility', 0, 'Strenght', 0, 'Intellect', 0),
                                                                          (6, 'Agility', 0, 'Strenght', 0, 'Intellect', 0);

INSERT INTO PROJECT (id, project_name) VALUES (1, 'PPA'),
                                              (2, 'PQA'),
                                              (3, 'TADS');

INSERT INTO EMPLOYEE (id, first_name, second_name, attribute_id) VALUES (1, 'Chergei', 'Sesnokov', 1),
                                                                        (2, 'Bikita', 'Nutko', 2),
                                                                        (3, 'Nenis', 'Daumov', 3),
                                                                        (4, 'Earta', 'Mn', 4),
                                                                        (5, 'Olena', 'Ardina', 5),
                                                                        (6, 'Karkadiy', 'Ashin', 6);

INSERT INTO EMPLOYEE_PROJECT (employee_id, project_id) VALUES (1, 1),
                                                              (2, 1),
                                                              (3, 1),
                                                              (3, 2),
                                                              (4, 2),
                                                              (6, 2),
                                                              (5, 3),
                                                              (6, 3);
