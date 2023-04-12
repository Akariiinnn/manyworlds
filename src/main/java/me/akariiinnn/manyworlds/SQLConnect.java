package me.akariiinnn.manyworlds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnect {

    private String url = "jdbc:mysql://localhost/SpigotDatas";
    private String user = "root";
    private String password = "1234";
    private Connection connection = null;

    private Statement statement = null;

    public SQLConnect(String url, String user, String password)
    {
        this.url = url;
        this.user = user;
        this.password = password;

        try
        {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch(SQLException e)
        {
            System.out.println("Unable to connect to db");
        }
    }

    public SQLConnect()
    {
        try
        {
            this.connection = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to db");
        } catch(SQLException e)
        {
            System.out.println("Unable to connect to db");
            e.printStackTrace();
        }
    }

    public void createTable()
    {
        try
        {
            this.statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS PlayerStatsSpeed(username varchar(255), last_x int, last_y int, last_z int, last_world varchar(64), PRIMARY KEY (username));";
            this.statement.execute(sql);
            System.out.println("PlayerStats table successfully created/already existing");
            this.statement.close();
            this.connection.close();
        } catch(SQLException e)
        {
            System.out.println("Unable to create table");
            e.printStackTrace();
        }
    }


    public Statement getStatement()
    {
        return this.statement;
    }
    public Connection getConnection()
    {
        return this.connection;
    }


}
