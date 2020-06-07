import java.util.List;

public class ViewVoluntario {
    
    public void menuVol(){
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("|Escolha uma opção:                                                                          |");
        System.out.println("|1  -> Aceitar Entrega                                                                       |");
        System.out.println("|2  -> Ver historico de encomendas  entregues                                                |");
        System.out.println("|3  -> Alterar dados pessoais                                                                |");
        System.out.println("|4  -> Entregar Encomenda                                                                    |");
        System.out.println("|0  -> Exit Program                                                                          |");
        System.out.println("|____________________________________________________________________________________________|");
    }

    public void printBarraN(){
        System.out.println();
    }
    public void flush(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void pressioneEnter(){
        System.out.println("\nPressione enter para continuar");
    }

    public void inst(){
        System.out.println("\nEscolha a instrução: ");
    }

    public void printExit(){
        System.out.println("\nObrigado por usar GestVendasApp!");
    }

    public void printVazia(){System.out.println("Nao existem pedidos de momento ou tem entregas pendentes!");}

    public void printError(){
        System.out.println("\nNão escreveu nenhuma das duas opções válidas!");
        System.out.print("Por favor tente outra vez: ");
    }

    public void aceite(){
        System.out.println("Encomenda Aceite para entrega!");
    }
    public void rejeite(){System.out.println("Encomenda rejeitada");}

    public void opc2(List<Encomenda> e){
        if(e.size()<=0) System.out.println("Lista Vazia");
        else {
            System.out.println("Codigo");
            for (Encomenda es : e) {
                if (es.getEntregue()) System.out.println(es.getCodenc());
            }
        }
    }


    public void op1(Encomenda e){
        System.out.println("\nEcomenda:" + e.getCodenc());
        System.out.println("Loja: " +e.getCodloja());
        System.out.println("Inicio da Entrega:" + e.getDatai());
        System.out.println("Entregue: "+ e.getEntregue());
        System.out.println("Fim da Entrega:" + e.getDataf());
    }

    public void op4(){
        System.out.println("Insira o código de encomenda que entregou:");
    }

    public void printMenuPedidos(){
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("|Escolha uma opção:                                                                          |");
        System.out.println("|1  -> Aceitar Pedido                                                                        |");
        System.out.println("|2  -> Rejeitar Pedido                                                                       |");
        System.out.println("|____________________________________________________________________________________________|");
    }


    // ===================== Alterar dados ==============================================

    public void printMenuDados(){
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("|Escolha uma opção:                                                                          |");
        System.out.println("|1  -> Alterar Nome                                                                          |");
        System.out.println("|2  -> Alterar Password                                                                      |");
        System.out.println("|3  -> Alterar Localização                                                                   |");
        System.out.println("|4  -> Alterar raio de ação                                                                  |");
        System.out.println("|0  -> Voltar ao menu Voluntário                                                             |");
        System.out.println("|____________________________________________________________________________________________|");
    }

    public void altNome(){
        System.out.println("Insira o nome novo:");
    }

    public void passordAntiga(){
        System.out.println("Insira a password atual:");
    }

    public void passError(){
        System.out.println("Palavra pass incorreta");
    }

    public void passordNova(){
        System.out.println("Insira a password nova:");
    }

    public void altloc(){
        System.out.println("Insira a nova latitude:");
    }

    public void altloclon(){
        System.out.println("Insira a nova longitude:");
    }

    public void altRaio(){ System.out.println("Insira o novo raio de ação:");}

    public void raioSuc(){System.out.println("Raio de ação alterado com sucesso!");}

    public void printDadosAtuais(Voluntario v){
        System.out.println("\nOs seus dados atuais: ");
        System.out.println("Nome:" + v.getNome());
        System.out.println("Codigo:"  + v.getCod());
        System.out.println("Raio de ação:" + v.getRaio());
        System.out.println("Médico: "+ v.getMedico());
        System.out.println("Classificacao: " + v.getClGeral());
        System.out.println("Localização:\n    " + v.getGPS().toString() + "\n");
    }


}
