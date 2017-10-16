package com.jdbclearn.sqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main (String[] args) {

        System.out.println("你好，世界！");

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=EFTest",
                                                                "sa",
                                                                "gushihao");
            CallableStatement callableStatement = connection.prepareCall("insert into Students values('江泽民', '女', 34, '上海市', '江蛤蟆')");
            callableStatement.execute();
            connection.close();
        } catch (SQLException e) {
            System.out.println("数据库连接错误！");
            e.printStackTrace();
        }
    }
}
