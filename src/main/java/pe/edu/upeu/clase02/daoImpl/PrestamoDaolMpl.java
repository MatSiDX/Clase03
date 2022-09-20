package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Prestamo;

@Component
public class PrestamoDaolMpl implements Todo<Prestamo> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO prestamo(fecha_prestamo, fecha_devolucion, idempleado, idalumno) VALUES(now(),?,?,?)";
		return jdbcTemplate.update(SQL, t.getFecha_prestamo(), t.getFecha_devolución(), t.getIdempleado());
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO prestamo(fecha_prestamo, fecha_devolucion, idempleado, idalumno) VALUES(?,?,?,?)";
		return jdbcTemplate.update(SQL, t.getFecha_prestamo(), t.getFecha_devolución(), t.getIdempleado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM prestamo WHERE idprestamo=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		try {
			Prestamo p = jdbcTemplate.queryForObject("SELECT * FROM prestamo WHERE idprestamo=?",
					BeanPropertyRowMapper.newInstance(Prestamo.class), id);
			return p;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Prestamo> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from Prestamo", BeanPropertyRowMapper.newInstance(Prestamo.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}	
	

}
