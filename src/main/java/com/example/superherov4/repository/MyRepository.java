package com.example.superherov4.repository;

import com.example.superherov4.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MyRepository {

    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;

    public List<Superhero> getSuperheroes() { //localhost:8081/superhelte
        List<Superhero> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(db_url, uid, pwd)) {
            String SQL = "SELECT SUPERHERO_ID, HERO_NAME, REAL_NAME, CREATION_YEAR, SUPERPOWER_ID, CITY_ID FROM SUPERHERO;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int ID = rs.getInt("SUPERHERO_ID");
                String heroName = rs.getString("HERO_NAME");
                String realName = rs.getString("REAL_NAME");
                int creationYear = rs.getInt("CREATION_YEAR");
                int superpowerID =rs.getInt("SUPERPOWER_ID");
                String cityID = rs.getString("CITY_ID");

                superheroes.add(new Superhero(ID, heroName, realName, creationYear, superpowerID, cityID));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Superhero  () {  //localhost:8080/superhelte/batman


    }
}

