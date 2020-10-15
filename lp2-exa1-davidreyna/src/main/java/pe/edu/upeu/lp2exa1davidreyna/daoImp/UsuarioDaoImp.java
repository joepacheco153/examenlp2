package pe.edu.upeu.lp2exa1davidreyna.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.UsuarioDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String sql = "select * from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
