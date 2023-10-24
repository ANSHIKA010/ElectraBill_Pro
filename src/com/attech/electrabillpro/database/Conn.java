package com.attech.electrabillpro.database;


import com.attech.electrabillpro.Constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    public Connection c;
    public Statement s;
    public Conn() throws SQLException {
        c = DriverManager.getConnection("jdbc:mysql:///ebs", Constant.DB_USER, Constant.DB_PASSWORD);
        s = c.createStatement();
    }
}
