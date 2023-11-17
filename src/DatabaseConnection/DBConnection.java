package DatabaseConnection;

import Classes.AnoFabricacao;
import Classes.AnoModelo;
import Classes.Cambios;
import Classes.CaracteristicasModelo;
import Classes.Clientes;
import Classes.Combustiveis;
import Classes.CompraVeiculo;
import Classes.Cores;
import Classes.Marcas;
import Classes.Modelos;
import Classes.Perfis;
import Classes.PessoaFisica;
import Classes.PessoaJuridica;
import Classes.Usuarios;
import Classes.Veiculos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBConnection {

    //Colocar o nome do banco de dados que você criou
    private static final String URL = "jdbc:mysql://192.168.10.131:3306/lojaVeiculos";
    //Colocar o usuario que loga no MySQL Workbench
    private static final String USER = "estela";
    //Colocar a senha que loga no MySQL Workbench
    private static final String PASSWORD = "luiz";

    //Método que faz a conexão com o banco de dados
    public static Connection GetConnection() {
        try {
            //Classe importada para usar o banco, sempre será usado no JAVA
            System.out.println("Funcionou");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Erro de conexão");
            throw new RuntimeException(e);
        } finally {

        }
    }

    //PERFIL
    public void createPerfis(Perfis perfil) {
        String query = "INSERT INTO perfil (tipo_perfil, nome_perfil, cpf_perfil, rg_perfil, telefone_perfil) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, perfil.getTipo_perfil());
            stmt.setString(2, perfil.getNome_perfil());
            stmt.setString(3, perfil.getCpf_perfil());
            stmt.setString(4, perfil.getRg_perfil());
            stmt.setString(5, perfil.getTelefone_perfil());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Perfis> readAllPerfis() {
        ArrayList<Perfis> perfis = new ArrayList<>();
        String query = "SELECT * FROM perfil";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                perfis.add(new Perfis(rs.getInt("id_perfil"), rs.getString("tipo_perfil"), rs.getString("nome_perfil"), rs.getString("cpf_perfil"), rs.getString("rg_perfil"), rs.getString("telefone_perfil")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return perfis;
    }

    public void updatePerfis(Perfis perfil, int id) {
        String query = "UPDATE perfil SET tipo_perfil = ?, nome_perfil = ?, cpf_perfil = ?, rg_perfil = ?, telefone_perfil = ? WHERE id_perfil = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, perfil.getTipo_perfil());
            stmt.setString(2, perfil.getNome_perfil());
            stmt.setString(3, perfil.getCpf_perfil());
            stmt.setString(4, perfil.getRg_perfil());
            stmt.setString(5, perfil.getTelefone_perfil());
            stmt.setInt(6, perfil.getId_perfil());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePerfis(int id_perfil) {
        String query = "DELETE FROM perfil WHERE id_perfil = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_perfil);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //USUARIOS
    public void createUsuarios(Usuarios usuario) {
        String query = "INSERT INTO usuarios (id_perfil, login_usuario, senha_usuario) VALUES (?, ?, ?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, usuario.getId_perfil());
            stmt.setString(2, usuario.getLogin_usuario());
            stmt.setString(3, usuario.getSenha_usuario());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Usuarios> readAllUsuarios() {
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                usuarios.add(new Usuarios(rs.getInt("id_usuario"), rs.getInt("id_perfil"), rs.getString("login_usuario"), rs.getString("senha_usuario")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    public void updateUsuarios(Usuarios usuario, int id) {
        String query = "UPDATE usuarios SET login_usuario = ?, senha_usuario = ? WHERE id_usuario = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, usuario.getLogin_usuario());
            stmt.setString(2, usuario.getSenha_usuario());
            stmt.setInt(3, usuario.getId_usuario());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUsuarios(int id_usuario) {
        String query = "DELETE FROM usuarios WHERE id_usuario = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_usuario);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //MARCAS
    
    public void createMarcas(Marcas marca) {
        String query = "INSERT INTO marcas (nome_marca) VALUES (?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, marca.getNome_marca());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Marcas> readAllMarcas() {
        ArrayList<Marcas> marcas = new ArrayList<>();
        String query = "SELECT * FROM marcas";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                marcas.add(new Marcas(rs.getInt("id_marca"), rs.getString("nome_marca")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return marcas;
    }

    public void updateMarcas(Marcas marca, int id) {
        String query = "UPDATE marcas SET nome_marca = ? WHERE id_marca = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, marca.getNome_marca());
            stmt.setInt(2, marca.getId_marca());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteMarcas(int id_marca) {
        String query = "DELETE FROM marcas WHERE id_marca = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_marca);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //CARACTERISTICAS_MODELO
    
    public void createCaracModelo(CaracteristicasModelo caracModelo) {
        String query = "INSERT INTO caracteristicas_modelo (especie_caracteristica_modelo, carroceria_caracteristica_modelo, motor_caracteristica_modelo, potencia_caracteristica_modelo, lotacao_caracteristica_modelo) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, caracModelo.getEspecie_caracteristica_modelo());
            stmt.setString(2, caracModelo.getCarroceria_caracteristica_modelo());
            stmt.setString(3, caracModelo.getMotor_caracteristica_modelo());
            stmt.setString(4, caracModelo.getPotencia_caracteristica_modelo());
            stmt.setString(5, caracModelo.getLotacao_caracteristica_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<CaracteristicasModelo> readAllCaracModelo() {
        ArrayList<CaracteristicasModelo> caracModelo = new ArrayList<>();
        String query = "SELECT * FROM caracteristicas_modelo";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                caracModelo.add(new CaracteristicasModelo(rs.getInt("id_caracteristica_modelo"), rs.getString("especie_caracteristica_modelo"), rs.getString("carroceria_caracteristica_modelo"), rs.getString("motor_caracteristica_modelo"), rs.getString("potencia_caracteristica_modelo"), rs.getString("lotacao_caracteristica_modelo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return caracModelo;
    }

    public void updateCaracModelo(CaracteristicasModelo caracModelo, int id) {
        String query = "UPDATE caracteristica_modelo SET especie_caracteristica_modelo = ?, carroceria_caracteristica_modelo = ?, motor_caracteristica_modelo = ?, potencia_caracteristica_modelo = ?, lotacao_caracteristica_modelo = ? WHERE id_caracteristica_modelo = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, caracModelo.getEspecie_caracteristica_modelo());
            stmt.setString(2, caracModelo.getCarroceria_caracteristica_modelo());
            stmt.setString(3, caracModelo.getMotor_caracteristica_modelo());
            stmt.setString(4, caracModelo.getPotencia_caracteristica_modelo());
            stmt.setString(5, caracModelo.getLotacao_caracteristica_modelo());
            stmt.setInt(6, caracModelo.getId_caracteristica_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCaracModelo(int id_caracteristica_modelo) {
        String query = "DELETE FROM caracteristicas_modelo WHERE id_caracteristica_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_caracteristica_modelo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //MODELOS
    
    public void createModelos(Modelos modelo) {
        String query = "INSERT INTO modelos (id_marca, id_caracteristica_modelo, nome_modelo, tipo_modelo, versao_modelo) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, modelo.getId_marca());
            stmt.setInt(2, modelo.getId_caracteristica_modelo());
            stmt.setString(3, modelo.getNome_modelo());
            stmt.setString(4, modelo.getTipo_modelo());
            stmt.setString(5, modelo.getVersao_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Modelos> readAllModelos() {
        
        ArrayList<Modelos> modelos = new ArrayList<>();
        String query = "SELECT * FROM modelos";
        try (
                
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                modelos.add(new Modelos(rs.getInt("id_modelo"), rs.getInt("id_marca"), rs.getInt("id_caracteristica_modelo"), rs.getString("nome_modelo"), rs.getString("tipo_modelo"), rs.getString("versao_modelo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return modelos;
    }

    public void updateModelos(Modelos modelo, int id) {
        String query = "UPDATE modelos SET nome_modelo = ?, tipo_modelo = ?, versao_modelo = ? WHERE id_modelo = ?";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, modelo.getNome_modelo());
            stmt.setString(2, modelo.getTipo_modelo());
            stmt.setString(3, modelo.getVersao_modelo());
            stmt.setInt(4, modelo.getId_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteModelos(int id_modelo) {
        String query = "DELETE FROM modelos WHERE id_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_modelo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //CORES
    
    public void createCores(Cores cor) {
        String query = "INSERT INTO cores (nome_cor) VALUES (?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cor.getNome_cor());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Cores> readAllCores() {
        ArrayList<Cores> cores = new ArrayList<>();
        String query = "SELECT * FROM cores";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                cores.add(new Cores(rs.getInt("id_cor"), rs.getString("nome_cor")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cores;
    }

    public void updateCores(Cores cor, int id) {
        String query = "UPDATE cores SET nome_cor = ? WHERE id_cor = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cor.getNome_cor());
            stmt.setInt(2, cor.getId_cor());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCores(int id_cor) {
        String query = "DELETE FROM cores WHERE id_cor = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_cor);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //ANO_FABRICACAO
    
     public void createAnoFabricacao(AnoFabricacao ano_fabricacao) {
        String query = "INSERT INTO ano_fabricacao (ano_fabricacao) VALUES (?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_fabricacao.getAno_fabricacao());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<AnoFabricacao> readAllAnoFabricacao() {
        ArrayList<AnoFabricacao> ano_fabricacao = new ArrayList<>();
        String query = "SELECT * FROM ano_fabricacao";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ano_fabricacao.add(new AnoFabricacao(rs.getInt("id_ano_fabricacao"), rs.getInt("ano_fabricacao")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ano_fabricacao;
    }

    public void updateAnoFabricacao(AnoFabricacao ano_fabricacao, int id) {
        String query = "UPDATE ano_fabricacao SET ano_fabricacao = ? WHERE id_ano_fabricacao = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_fabricacao.getAno_fabricacao());
            stmt.setInt(2, ano_fabricacao.getId_ano_fabricacao());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAnoFabricacao(int id_ano_fabricacao) {
        String query = "DELETE FROM ano_fabricacao WHERE id_ano_fabricacao = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_ano_fabricacao);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //ANO_MODELO
    
     public void createAnoModelo(AnoModelo ano_modelo) {
        String query = "INSERT INTO ano_modelo (ano_modelo) VALUES (?)";
        try (

                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_modelo.getAno_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<AnoModelo> readAllAnoModelo() {
        ArrayList<AnoModelo> ano_modelo = new ArrayList<>();
        String query = "SELECT * FROM ano_modelo";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ano_modelo.add(new AnoModelo(rs.getInt("id_ano_modelo"), rs.getInt("ano_modelo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ano_modelo;
    }

    public void updateAnoModelo(AnoModelo ano_modelo, int id) {
        String query = "UPDATE ano_modelo SET ano_modelo = ? WHERE id_ano_modelo= ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_modelo.getAno_modelo());
            stmt.setInt(2, ano_modelo.getId_ano_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAnoModelo(int id_ano_modelo) {
        String query = "DELETE FROM ano_modelo WHERE id_ano_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_ano_modelo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //COMBUSTIVEIS
    
     public void createCombustiveis(Combustiveis combustiveis) {
        String query = "INSERT INTO combustiveis (tipo_combustivel) VALUES (?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, combustiveis.getTipo_combustivel());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Combustiveis> readAllAnoCombustiveis() {
        ArrayList<Combustiveis> combustiveis = new ArrayList<>();
        String query = "SELECT * FROM combustiveis";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                combustiveis.add(new Combustiveis(rs.getInt("id_combustivel"), rs.getString("tipo_combustivel")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return combustiveis;
    }

    public void updateCombustiveis(Combustiveis combustiveis, int id) {
        String query = "UPDATE combustiveis SET tipo_combustivel = ? WHERE id_combustivel = ?";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, combustiveis.getTipo_combustivel());
            stmt.setInt(2, combustiveis.getId_combustivel());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCombustiveis(int id_combustivel) {
        String query = "DELETE FROM combustiveis WHERE id_combustivel = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_combustivel);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //CAMBIOS
    
     public void createCambios(Cambios cambios) {
        String query = "INSERT INTO cambios (tipo_cambio) VALUES (?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cambios.getTipo_cambio());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Cambios> readAllCambios() {
        ArrayList<Cambios> cambios = new ArrayList<>();
        String query = "SELECT * FROM cambios";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
           
            while (rs.next()) {
               
                cambios.add(new Cambios(rs.getInt("id_cambio"), rs.getString("tipo_cambio")));
            }
        } catch (SQLException e) {
          
            throw new RuntimeException(e);
        }
       
        return cambios;
    }

    public void updateCambios(Cambios cambios, int id) {
        
        String query = "UPDATE cambios SET tipo_cambio = ? WHERE id_cambio = ?";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cambios.getTipo_cambio());
            stmt.setInt(2, cambios.getId_cambio());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCambios(int id_cambio) {
        String query = "DELETE FROM cambios WHERE id_cambio = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_cambio);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //VEICULOS
    
    public void createVeiculos(Veiculos veiculos) {
        String query = "INSERT INTO veiculos (chassi_veiculo, id_modelo, id_cor, id_ano_fabricacao, id_ano_modelo, id_combustivel, id_cambio, status_veiculo, preco_veiculo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, veiculos.getChassi_veiculo());
            stmt.setInt(2, veiculos.getId_modelo());
            stmt.setInt(3, veiculos.getId_cor());
            stmt.setInt(4, veiculos.getId_ano_fabricacao());
            stmt.setInt(5, veiculos.getId_ano_modelo());
            stmt.setInt(6, veiculos.getId_combustivel());
            stmt.setInt(7, veiculos.getId_cambio());
            stmt.setString(8, veiculos.getStatus_veiculo());
            stmt.setFloat(9, veiculos.getPreco_veiculo());


            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Veiculos> readAllVeiculos() {
        
        ArrayList<Veiculos> veiculos = new ArrayList<>();
        
        String query = "SELECT * FROM veiculos";
        try (
                
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                veiculos.add(new Veiculos(rs.getInt("id_veiculo"), rs.getString("chassi_veiculo"), rs.getInt("id_modelo"), rs.getInt("id_cor"), rs.getInt("id_ano_fabricacao"), rs.getInt("id_ano_modelo"),rs.getInt("id_combustivel"), rs.getInt("id_cambio"), rs.getString("status_veiculo"), rs.getFloat("preco_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return veiculos;
    }

    public void updateVeiculos(Veiculos veiculos, int id) {
        String query = "UPDATE veiculos SET chassi_veiculo = ?, status_veiculo = ?, preco_veiculo = ? WHERE id_veiculo = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, veiculos.getChassi_veiculo());
            stmt.setString(2, veiculos.getStatus_veiculo());
            stmt.setFloat(3, veiculos.getPreco_veiculo());
            stmt.setInt(4, veiculos.getId_veiculo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteVeiculos(int id_veiculo) {
        String query = "DELETE FROM veiculos WHERE id_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_veiculo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //CLIENTES
    
       public void createClientes(Clientes clientes) {
        String query = "INSERT INTO clientes (cep_cliente, telefone_cliente, logradouro_cliente, numero_casa_cliente, bairro_cliente, cidade_cliente, estado_cliente, pais_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, clientes.getCep_cliente());
            stmt.setString(2, clientes.getTelefone_cliente());
            stmt.setString(3, clientes.getLogradouro_cliente());
            stmt.setString(4, clientes.getNumero_casa_cliente());
            stmt.setString(5, clientes.getBairro_cliente());
            stmt.setString(6, clientes.getCidade_cliente());
            stmt.setString(7, clientes.getEstado_cliente());
            stmt.setString(8, clientes.getPais_cliente());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Clientes> readAllClientes() {
        
        ArrayList<Clientes> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientes.add(new Clientes(rs.getInt("id_cliente"), rs.getString("cep_cliente"), rs.getString("telefone_cliente"), rs.getString("logradouro_cliente"), rs.getString("numero_casa_cliente"), rs.getString("bairro_cliente"),rs.getString("cidade_cliente"), rs.getString("estado_cliente"), rs.getString("pais_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void updateClientes(Clientes clientes, int id) {
        String query = "UPDATE clientes SET cep_cliente = ?, telefone_cliente = ?, logradouro_cliente = ?, numero_casa_cliente = ?, bairro_cliente = ?, cidade_cliente = ?, estado_cliente = ?, pais_cliente = ? WHERE id_cliente = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, clientes.getCep_cliente());
            stmt.setString(2, clientes.getTelefone_cliente());
            stmt.setString(3, clientes.getLogradouro_cliente());
            stmt.setString(4, clientes.getNumero_casa_cliente());
            stmt.setString(5, clientes.getBairro_cliente());
            stmt.setString(6, clientes.getCidade_cliente());
            stmt.setString(7, clientes.getEstado_cliente());
            stmt.setString(8, clientes.getPais_cliente());
            stmt.setInt(9, clientes.getId_cliente());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientes(int id_cliente) {
        String query = "DELETE FROM clientes WHERE id_cliente = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_cliente);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //PESSOA_FISICA
    
    public void createPessoaFisica(PessoaFisica pessoa_fisica) {
        String query = "INSERT INTO pessoa_fisica (id_cliente, nome_pessoa_fisica, sobrenome_pessoa_fisica, cpf_pessoa_fisica, rg_pessoa_fisica, data_nascimento_pessoa_fisica) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pessoa_fisica.getId_cliente());
            stmt.setString(2, pessoa_fisica.getNome_pessoa_fisica());
            stmt.setString(3, pessoa_fisica.getSobrenome_pessoa_fisica());
            stmt.setString(4, pessoa_fisica.getCpf_pessoa_fisica());
            stmt.setString(5, pessoa_fisica.getRg_pessoa_fisica());
            stmt.setString(6, pessoa_fisica.getData_nascimento_pessoa_fisica());


            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<PessoaFisica> readAllPessoaFisica() {
        ArrayList<PessoaFisica> pessoa_fisica = new ArrayList<>();
        String query = "SELECT * FROM pessoa_fisica";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pessoa_fisica.add(new PessoaFisica(rs.getInt("id_pessoa_fisica"), rs.getInt("id_cliente"), rs.getString("nome_pessoa_fisica"), rs.getString("sobrenome_pessoa_fisica"), rs.getString("cpf_pessoa_fisica"), rs.getString("rg_pessoa_fisica"),rs.getString("data_nascimento_pessoa_fisica")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pessoa_fisica;
    }

    public void updatePessoaFisica(PessoaFisica pessoa_fisica, int id) {
        String query = "UPDATE pessoa_fisica SET nome_pessoa_fisica = ?, sobrenome_pessoa_fisica = ?, cpf_pessoa_fisica = ?, rg_pessoa_fisica = ?, data_nascimento_pessoa_fisica = ? WHERE id_pessoa_fisica = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pessoa_fisica.getNome_pessoa_fisica());
            stmt.setString(2, pessoa_fisica.getSobrenome_pessoa_fisica());
            stmt.setString(3, pessoa_fisica.getCpf_pessoa_fisica());
            stmt.setString(4, pessoa_fisica.getRg_pessoa_fisica());
            stmt.setString(5, pessoa_fisica.getData_nascimento_pessoa_fisica());
            stmt.setInt(6, pessoa_fisica.getId_pessoa_fisica());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePessoaFisica(int id_pessoa_fisica) {
        String query = "DELETE FROM pessoa_fisica WHERE id_pessoa_fisica = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_pessoa_fisica);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //PESSOA_JURIDICA
    
    public void createPessoaJuridica(PessoaJuridica pessoa_juridica) {
        String query = "INSERT INTO pessoa_juridica (id_cliente, nome_fantasia_pessoa_fisica, razao_social_pessoa_juridica, cnpj_pessoa_juridica, inscricao_estadual_pessoa_juridica, contrato_social_pessoa_juridica) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pessoa_juridica.getId_cliente());
            stmt.setString(2, pessoa_juridica.getNome_fantasia_pessoa_juridica());
            stmt.setString(3, pessoa_juridica.getRazao_social_pessoa_juridica());
            stmt.setString(4, pessoa_juridica.getCnpj_pessoa_juridica());
            stmt.setString(5, pessoa_juridica.getInscricao_estadual_pessoa_juridica());
            stmt.setString(6, pessoa_juridica.getContrato_social_pessoa_juridica());


            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<PessoaJuridica> readAllPessoaJuridica() {
        ArrayList<PessoaJuridica> pessoa_juridica = new ArrayList<>();
        String query = "SELECT * FROM pessoa_juridica";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query); 
                 ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pessoa_juridica.add(new PessoaJuridica(rs.getInt("id_pessoa_juridica"), rs.getInt("id_cliente"), rs.getString("nome_fantasia_pessoa_juridica"), rs.getString("razao_social_pessoa_juridica"), rs.getString("cnpj_pessoa_juridica"), rs.getString("inscricao_estadual_pessoa_juridica"),rs.getString("contrato_social_pessoa_juridica")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pessoa_juridica;
    }

    public void updatePessoaJuridica(PessoaJuridica pessoa_juridica, int id) {
        String query = "UPDATE pessoa_juridica SET nome_fantasia_pessoa_juridica = ?, razao_social_pessoa_juridica = ?, cnpj_pessoa_juridica = ?, inscricao_estadual_pessoa_juridica = ?, inscricao_estadual_pessoa_juridica = ? WHERE id_pessoa_juridica = ?";
        try (
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pessoa_juridica.getNome_fantasia_pessoa_juridica());
            stmt.setString(2, pessoa_juridica.getRazao_social_pessoa_juridica());
            stmt.setString(3, pessoa_juridica.getCnpj_pessoa_juridica());
            stmt.setString(4, pessoa_juridica.getInscricao_estadual_pessoa_juridica());
            stmt.setString(5, pessoa_juridica.getContrato_social_pessoa_juridica());
            stmt.setInt(6, pessoa_juridica.getId_pessoa_juridica());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePessoaJuridica(int id_pessoa_juridica) {
        String query = "DELETE FROM pessoa_juridica WHERE id_pessoa_juridica = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_pessoa_juridica);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //COMPRA_VEICULO
    
    public void createCompraVeiculo(CompraVeiculo compra_veiculo) {
        String query = "INSERT INTO compra_veiculo (id_cliente, id_veiculo, id_usuario, renavam_compra_veiculo, crlv_compra_veiculo, nota_fiscal_compra_veiculo) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, compra_veiculo.getId_cliente());
            stmt.setInt(2, compra_veiculo.getId_veiculo());
            stmt.setInt(3, compra_veiculo.getId_usuario());
            stmt.setString(4, compra_veiculo.getRenavam_compra_veiculo());
            stmt.setString(5, compra_veiculo.getCrlv_compra_veiculo());
            stmt.setString(6, compra_veiculo.getNota_fiscal_compra_veiculo());


            stmt.execute();
        } catch (SQLException e) {
            
            throw new RuntimeException(e);
        }
    }

    public ArrayList<CompraVeiculo> readAllCompraVeiculo() {
       
        ArrayList<CompraVeiculo> compra_veiculo = new ArrayList<>();
        
        String query = "SELECT * FROM compra_veiculo";
        try (
                
                Connection conn = GetConnection();
                 PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                compra_veiculo.add(new CompraVeiculo(rs.getInt("id_compra_veiculo"), rs.getInt("id_cliente"), rs.getInt("id_veiculo"), rs.getInt("id_usuario"), rs.getString("renavam_compra_veiculo"), rs.getString("crlv_compra_veiculo"),rs.getString("nota_fiscal_compra_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return compra_veiculo;
    }

    public void updateCompraVeiculo(CompraVeiculo compra_veiculo, int id) {
       
        String query = "UPDATE compra_veiculo SET renavam_compra_veiculo = ?, crlv_compra_veiculo = ?, nota_fiscal_compra_veiculo = ? WHERE id_compra_veiculo = ?";
        try (
                
                Connection conn = GetConnection(); 
                 PreparedStatement stmt = conn.prepareStatement(query)) {
           
            stmt.setString(1, compra_veiculo.getRenavam_compra_veiculo());
            stmt.setString(2, compra_veiculo.getCrlv_compra_veiculo());
            stmt.setString(3, compra_veiculo.getNota_fiscal_compra_veiculo());
            stmt.setInt(4, compra_veiculo.getId_compra_veiculo());
           
            stmt.execute();
        } catch (SQLException e) {
        
            throw new RuntimeException(e);
        }
    }

    public void deleteCompraVeiculo(int id_compra_veiculo) {
        String query = "DELETE FROM compra_veiculo WHERE id_compra_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_compra_veiculo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
