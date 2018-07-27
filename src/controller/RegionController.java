/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.RegionDAO;
import entities.Region;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gusma
 */
public class RegionController implements RegionInterfaceController {

    private RegionDAO regionDAO;

    public RegionController() {

    }

    public RegionController(Connection connection) {
        this.regionDAO = new RegionDAO(connection);

    }

    @Override
    public boolean save(String regionId, String regionName) {
        //Region region = new Region();
       // region.setRegionId(Integer.parseInt(regionId));
        //region.setRegionName(regionName);
//        Region region = new Region(Integer.parseInt(regionId), regionName);
//        return this.regionDAO.insert(region);
          return this.regionDAO.insert(new Region(Integer.parseInt(regionId), regionName));
    }

    @Override
    public boolean edit(String regionId, String regionName) {
       // Region region = new Region();
       // region.setRegionId(Integer.parseInt(regionId));
       // region.setRegionName(regionName);
        //Region region  = new Region(Integer.parseInt(regionId), regionName);
        return this.regionDAO.update(new Region(Integer.parseInt(regionId), regionName));
        //return this.regionDAO.update(region);
    }

    @Override
    public boolean drop(int id) {
        return this.regionDAO.delete(id);
    }

    @Override
    public List<Region> binding() {
        return this.regionDAO.getAll();
    }

    @Override
    public List<Region> bindingsort(String category, String sort) {
        return this.regionDAO.getAllcs(category, sort);
    }

    @Override
    public List<Region> find(String category, String data) {
        return this.regionDAO.search(category, data);
    }

    @Override
    public Region findById(int id) {
        return this.regionDAO.getById(id);
    }

}
