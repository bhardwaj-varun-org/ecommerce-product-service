create table if not exists products (
                                         id bigserial not null,
                                         name varchar not null,
                                         code varchar not null,
                                         description text not null,
                                         primary key (id),
                                         UNIQUE (code)
    );