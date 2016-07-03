package br.com.vendaprodutos.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class GenericDAO<Entidade> {
	
	public void salvar(Entidade entidade){
		private Class<Entidade> classe;		
		public GenericDao(){
			this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;		
		try{
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
		}catch(RuntimeException erro){
			if(transacao != null){
				transacao.rollback();
			}
			throw erro;
		}finally{
			sessao.close();
		}		
	}
	
	public List<Entidade> listar{
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try{
			Criteria consulta = sessao.createCriteria(classe);
			List<Entidade> resultado = consulta.list();
			return resultado;
		}catch(RuntimeException erro){
			throw erro;
		  }finally{
				sessao.close();
	}

		public Entidade buscaar(Long codigo){
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try{
				Criteria consulta = sessao.createCriteria(classe);
				consulta.add(Restrictions.idEq(codigo));
				List<Entidade> resultado = (Entidade) consulta.uniqueResult();
				return resultado;
			}catch(RuntimeException erro){
				throw erro;
			  }finally{
					sessao.close();
		}
			
			public void excluir(Entidade entidade){
				Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
				Transaction transacao = null;
				
				try{
					transacao = sessao.beginTransaction();
					sessao.delete(entidade);
					transacao.commit();
				}catch(RuntimeException erro){
					if(transacao != null){
						transacao.rollback();
					}
					throw erro;
				}finally{
					sessao.close();
				}		
			}
			
			public void editar(Entidade entidade){
				Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
				Transaction transacao = null;
				
				try{
					transacao = sessao.beginTransaction();
					sessao.update(entidade);
					transacao.commit();
				}catch(RuntimeException erro){
					if(transacao != null){
						transacao.rollback();
					}
					throw erro;
				}finally{
					sessao.close();
				}		
			}
			
			public void merge(Entidade entidade){
				Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
				Transaction transacao = null;
				
				try{
					transacao = sessao.beginTransaction();
					sessao.merge(entidade);
					transacao.commit();
				}catch(RuntimeException erro){
					if(transacao != null){
						transacao.rollback();
					}
					throw erro;
				}finally{
					sessao.close();
				}		
			}
}