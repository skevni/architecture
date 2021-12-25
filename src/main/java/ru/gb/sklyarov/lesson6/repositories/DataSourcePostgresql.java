package ru.gb.sklyarov.lesson6.repositories;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class DataSourcePostgresql {
    private static DriverManagerDataSource dataSource;

    private DataSourcePostgresql(){};

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("org.postgresql.Driver");
            dataSource.setUrl("jdbc:postgresql://localhost:5432/erp");
            dataSource.setUsername("postgres");
            dataSource.setPassword("postgres");
        }
        return dataSource;
    }
}
