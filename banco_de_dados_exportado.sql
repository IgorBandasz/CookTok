create database dbCookTok;
use dbcooktok;

create table tbingrediente(
	pkcodingre integer not null auto_increment,
    nomeingre varchar(30) not null unique,
    primary key(pkcodingre)
);

create table tbreceita(
	pkcodreceita integer not null auto_increment,
    nomereceita varchar(80) not null,
    tempo integer,
    primary key(pkcodreceita)
);

create table tbinstrucao(
	pkcodinstru integer not null auto_increment,
    nomeinstru varchar(200) not null,
    fkcodreceita integer not null,
    primary key(pkcodinstru),
    foreign key(fkcodreceita) references tbreceita(pkcodreceita)
);

create table tbrelingrerec(
	pkcodrel integer not null auto_increment,
    fkcodreceita integer not null,
    fkcodingre integer not null,
    primary key(pkcodrel),
    foreign key(fkcodreceita) references tbreceita(pkcodreceita),
    foreign key(fkcodingre) references tbingrediente(pkcodingre)
);