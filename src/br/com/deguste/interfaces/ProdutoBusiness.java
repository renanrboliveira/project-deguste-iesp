<<<<<<< HEAD
package br.com.deguste.interfaces;


import java.util.List;

import br.com.deguste.dao.IGenericDAO;
import br.com.deguste.model.entity.Produto;

public interface ProdutoBusiness extends IGenericDAO<Produto>{
	
	public Produto salvar(Produto user) throws Exception;
	public List<Produto> selectFornecedores();
	public List<Produto> produtoPorCodigo(Produto produto);
}
=======
package br.com.deguste.interfaces;


import java.util.List;

import br.com.deguste.dao.IGenericDAO;
import br.com.deguste.model.entity.Produto;

public interface ProdutoBusiness extends IGenericDAO<Produto>{
	
	public Produto salvar(Produto user) throws Exception;
	public List<Produto> selectFornecedores();
	public List<Produto> produtoPorCodigo(Produto produto);
}
>>>>>>> bafbdf018ef0117e4c6395b601a35fc901b6f766
