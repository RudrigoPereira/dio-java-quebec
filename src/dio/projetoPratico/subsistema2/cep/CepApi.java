package dio.projetoPratico.subsistema2.cep;

import dio.projetoPratico.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia=new CepApi();

    private CepApi(){}

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Taboão da Serra";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
