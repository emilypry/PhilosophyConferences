package org.launchcode.models.data;

import org.launchcode.models.Conference;
import org.springframework.data.repository.CrudRepository;

public interface ConferenceDao extends CrudRepository<Conference, Integer>{
}
