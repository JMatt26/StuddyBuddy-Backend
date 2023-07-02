package Repositories;

import Models.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Integer> {

    public Location findLocationByLocationId(int locationId);
    public List<Location> findAllLocationByCity(String cityName);
    public List<Location> findAllLocationByBuildingName(String buildingName);
}
