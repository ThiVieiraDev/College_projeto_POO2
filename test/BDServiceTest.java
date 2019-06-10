/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import generico.BDService;
import modelos.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import services.ClienteService;
import testes.BDServiceMSG;

/**
 *
 * @author W10
 */
public class BDServiceTest {
    
    @Before
    public void setUp(){
        BDService instance = new BDService() {};
    }
    
    @Test
    public void testeSalvar(){
        System.out.println("Salvar");
        ClienteService instance = new ClienteService();
        Cliente cliente = new Cliente();
        Cliente result = instance.salvar(cliente);
        assertNull(result);
        
        
    }
    
}
