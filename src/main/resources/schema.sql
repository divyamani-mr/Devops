drop table if exists batch CASCADE;
drop table if exists scholar cascade ;
create table batch
(
    id            varchar(255) not null,
    created_at    timestamp    not null,
    created_by    varchar(255) not null,
    modified_at   timestamp    not null,
    modified_by   varchar(255) not null,
    name          varchar(255) not null,
    vt_manager_id varchar(255) not null,
    primary key (id)
);

create table scholar
(
    inumber varchar(10) not null,
    scholar_name  varchar(12) ,
    cgpa float,
    stream varchar(10),
    batch varchar(5),
    practicalphase integer,
    teamname varchar(10),
    lob varchar(10),
    managername varchar(12),
    managerinumber varchar(10),
    techstack varchar(10),
    vtname varchar(12),
    vtinumber varchar(10),
    vtproject varchar(15) ,
    primary key (inumber)
);