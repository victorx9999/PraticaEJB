package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(name = "mensagemService")
@Remote
public class MensagemService {
    @EJB
    private MensagemDAO mensagemDAO;

    public List<Mensagem> listar() {
        return mensagemDAO.listar();
    }

    public void inserir(long id, String texto) {
        Mensagem novaMensagem = new Mensagem(id, texto);
        mensagemDAO.inserir(novaMensagem);
    }

    public List<Mensagem> pesquisarPorId(long id) {
        return mensagemDAO.pesquisarPorId(id);
    }
}