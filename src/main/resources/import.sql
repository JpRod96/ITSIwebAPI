------------------------------------------------------------USERS/ROLES--------------------------------------------------------------------
INSERT INTO role (id, name) VALUES (1, 'ADMINISTRATOR');
INSERT INTO role (id, name) VALUES (2, 'STUDENT');
INSERT INTO role (id, name) VALUES (3, 'ACCOUNTANT');
INSERT INTO role (id, name) VALUES (4, 'AUXILIARY_ACCOUNTANT');
INSERT INTO role (id, name) VALUES (5, 'SECRETARY');

INSERT INTO user (id, username, password) VALUES (1, 'admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.');
INSERT INTO user (id, username, password) VALUES (2, 'est', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.');
INSERT INTO user (id, username, password) VALUES (3, 'acc', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.');
INSERT INTO user (id, username, password) VALUES (4, 'sec', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO user_role (user_id, role_id) VALUES (4, 4);
INSERT INTO user_role (user_id, role_id) VALUES (4, 5);
------------------------------------------------------------ACCOUNTABILITY----------------------------------------------------------------
INSERT INTO account (id, code, level, name) VALUES (1, 100000, 1, "uno");
    INSERT INTO account (id, code, level, name, upper_account_id) VALUES (3, 110000, 2, "unodos", 1);
INSERT INTO account (id, code, level, name) VALUES (2, 200000, 1, "dos");