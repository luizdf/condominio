/**
 * 
 */
package org.luiz.condominio.facade;

import org.luiz.condominio.dao.UnidadeMedidaDAO;
import org.luiz.condominio.facade.generic.GenericFacade;
import org.luiz.condominio.vo.UnidadeMedida;

/**
 * @author luizantonioalmeida
 *
 */
public class UnidadeMedidaFacade extends GenericFacade<UnidadeMedida> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1592388971450585648L;
	private static UnidadeMedidaFacade service;
	private UnidadeMedidaDAO<UnidadeMedida> dao; 

	public static UnidadeMedidaFacade getInstance() {
		if (service == null){
			service = new UnidadeMedidaFacade();
		}
		return service;
	}

	@Override
	protected UnidadeMedidaDAO<UnidadeMedida> getDAO() {
		if (dao == null){
			dao = new UnidadeMedidaDAO<UnidadeMedida>(getEm());
		}
		
		return dao;
	}
	
	public UnidadeMedida findById(Long id) {
		UnidadeMedida result = getDAO().findById(id);
		return result;
	}
}
