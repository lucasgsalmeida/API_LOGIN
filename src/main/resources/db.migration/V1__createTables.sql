create table Usuarios (
                          id int,
                          email TEXT,
                          senha TEXT,
                          role TEXT,
                          constraint user_fk foreign key (id_cliente) references Clientes(id),
                          constraint user_pk primary key (id, id_cliente)
);