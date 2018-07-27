/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gusma
 */
public class RegionDAO implements RegionInterfaceDAO {

    private Connection connection;

    public RegionDAO() {

    }

    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Insert Function for Region.
     *
     * @param region dari input user.
     * @return boolean
     */
    @Override
    public boolean insert(Region region) {
        boolean flag = false;
        String query = "INSERT INTO Regions VALUES (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, region.getRegionId());
            preparedStatement.setString(2, region.getRegionName());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * Show function update region.
     *
     * @param region update by user
     * @return false
     */
    @Override
    public boolean update(Region region) {
        String query = "UPDATE Regions SET region_name=? WHERE region_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getRegionName());
            preparedStatement.setInt(2, region.getRegionId());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Function Delete Region.
     *
     * @param id input by user.
     * @return false
     */
    @Override
    public boolean delete(int id) {
        try {
            String query = "DELETE FROM Regions WHERE region_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Select function All
     *
     * @return dagas
     */
    @Override
    public List<Region> getAll() {
        List<Region> datas = new ArrayList<>();
        String query = "SELECT * FROM Regions";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setRegionId(rs.getInt(1));
                region.setRegionName(rs.getString(2));
                datas.add(region);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    /**
     * Select function by category and sort
     *
     * @param category String
     * @param sort String
     * @return datas
     */
    @Override
    public List<Region> getAllcs(String category, String sort) {

        List<Region> datas = new ArrayList<>();
        String query = "SELECT * FROM Regions ORDER BY "+category+" "+ sort;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setRegionId(rs.getInt(1));
                region.setRegionName(rs.getString(2));
                datas.add(region);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<Region> search(String category, String data) {
        List<Region> datas = new ArrayList<>();
        String query = "SELECT * FROM Regions WHERE "+category+" LIKE '%"+data+"%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setRegionId(rs.getInt("region_id"));
                region.setRegionName(rs.getString("region_name"));
                datas.add(region);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public Region getById(int id) {
        Region region = new Region();
        String query = "SELECT * FROM Regions WHERE region_id="+id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                
                region.setRegionId(rs.getInt("region_id"));
                region.setRegionName(rs.getString("region_name"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return region;
    }

}
