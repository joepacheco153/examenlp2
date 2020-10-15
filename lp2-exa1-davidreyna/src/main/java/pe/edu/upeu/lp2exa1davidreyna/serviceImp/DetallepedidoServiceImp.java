package pe.edu.upeu.lp2exa1davidreyna.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1davidreyna.dao.DetallepedidoDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Detallepedido;
import pe.edu.upeu.lp2exa1davidreyna.service.DetallepedidoService;

@Service
public class DetallepedidoServiceImp  implements DetallepedidoService{
	@Autowired
	private DetallepedidoDao detallepedidoDao;

	@Override
	public Detallepedido read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return detallepedidoDao.read(id);
		
	}
	

}
