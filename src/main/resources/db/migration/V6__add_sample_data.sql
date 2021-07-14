--User insertions
insert into appuser (first_name, last_name, description, url, phone_number,
                     address, city, postcode, email, password)
values ('Jan',
        'Nowak',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et ' ||
        'dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ' ||
        'commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat ' ||
        'nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit ' ||
        'anim id est laborum.',
        'http://www.ortomedik.pl/wp-content/uploads/bfi_thumb/lekarz-353n6xlisfl9y57x5s0pa8.png',
        '+48500000000',
        'Pyszna 2/3',
        'Krakow',
        '30-126',
        'jnowak@example.com',
        '$2y$12$zKYvWsxOLrHHhc5wqn0yhu3/hPzjQHXDZBHewAKr6xaZl30bHSwNG ');


--User insertion
insert into appuser (first_name, last_name, description, url, phone_number,
                     address, city, postcode, email, password)
values ('Marek',
        'Gladysz',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et ' ||
        'dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ' ||
        'commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat ' ||
        'nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit ' ||
        'anim id est laborum.',
        'http://www.ortomedik.pl/wp-content/uploads/bfi_thumb/lekarz-353n6xlisfl9y57x5s0pa8.png',
        '+48500000000',
        'Ciepla 2/3',
        'Makow',
        '36-126',
        'mgladysz@example.com',
        '$2y$12$UFjY7Ex5jDomPCLNktoeG.sGaIJeX98TEiVy12mZ0D3adTtHjbOj6 ');

insert into t_roles(description)
values ('patient'),
       ('doctor'),
       ('director');

