package JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCTEMPALTE {

    @Autowired
    JdbcTemplate jdbctempalte;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    SimpleJdbcCallFactory simpleJdbcCallFactory;

    public String getCountry(Integer scheduleId) {
        return jdbctempalte.queryForObject("Select country from optimizer_table " +
                "where schedule id= ?", new Object[]{scheduleId}, String.class);

    }


}

    class SimpleJdbcCallFactory {

        @Autowired
        JdbcTemplate template;

        public SimpleJdbcCall getSimpleJdbcCallTemplate() {
            return new SimpleJdbcCall(template);
        }

}
