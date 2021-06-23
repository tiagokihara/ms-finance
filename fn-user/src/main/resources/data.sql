insert into users (name, email, password) values ('Lionel Messi', 'messi@fcbarcelona.esp', '$2a$10$BO8fLJDhn/C8825OnPgjKuPV65i7mfrnBKHsz/XT6fPO4pG7WLHD6');
insert into users (name, email, password) values ('Cristiano Ronaldo', 'cr7@juventus.ita', '$2a$10$xH8m3G2NCyrZVjINDaa3A.yCFfnc9hW5HaWfzi3yMpPEk612psgR6');

insert into roles (role_name) values ('ROLE_OPERATOR');
insert into roles (role_name) values ('ROLE_ADMIN');

insert into user_roles (user_id, role_id) values (1, 1);
insert into user_roles (user_id, role_id) values (2, 1);
insert into user_roles (user_id, role_id) values (2, 2);