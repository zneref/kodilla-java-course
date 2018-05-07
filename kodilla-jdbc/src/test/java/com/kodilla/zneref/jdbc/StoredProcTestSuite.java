package com.kodilla.zneref.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "update readers set vip_level=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.execute(sqlUpdate);

        //When
        String sqlProcedureCall = "call UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheck = "select count(*) as ile from readers where vip_level=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheck);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("ile");
        }

        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "update books set bestseller=0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.execute(sqlUpdate);

        //When
        String sqlProcedureCall = "call UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheck = "select count(*) as bestsellers from books where bestseller=1";
        ResultSet rs = statement.executeQuery(sqlCheck);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("bestsellers");
        }

        assertEquals(1, howMany); // one book has been ranted more than twice
    }
}
