package pe.edu.upeu.lp2exa1davidreyna.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.DetallepedidoDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Detallepedido;

@Repository
public class DetallepedidoImp implements DetallepedidoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Detallepedido read(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from detalle_pedido where iddetalle_pedido = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Detallepedido.class));
	}

}
