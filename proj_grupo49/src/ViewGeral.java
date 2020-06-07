import java.util.Iterator;
import java.util.Set;

public class ViewGeral {

    public void printHeader(){
        System.out.println("|============================================================================================|");
        System.out.println("||                                     Welcome to                                           ||");
        System.out.println("||                                      TRAZ AQUI !                                         ||");
        System.out.println("|============================================================================================|");
    }

    public void menuInicial(){
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("|Sign in / Sign up as:                                                                       |");
        System.out.println("|1  -> Loja                                                                                  |");
        System.out.println("|2  -> Utilizador                                                                            |");
        System.out.println("|3  -> Voluntário                                                                            |");
        System.out.println("|4  -> Transportadora                                                                        |");
        System.out.println("|5  -> Utilizadores mais frequentes                                                          |");
        System.out.println("|6  -> Transportadoras mais frequentes(km)                                                   |");
        System.out.println("|7  -> Gravar estado                                                                         |");
        System.out.println("|8  -> Load file/ or .dat                                                                    |");
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

    public void printExit(){
        System.out.println("\nObrigado por usar Traz Aqui!");
    }

    public void printError(){
        System.out.println("\nNão escreveu nenhuma das duas opções válidas!");
        System.out.print("Por favor tente outra vez: ");
    }

    public void maisUsados(Set<Utilizador> aux){
        Iterator<Utilizador> it = aux.iterator();
        if (aux.size()==0){
            System.out.println("Lista Vazia");
            return;
        }
        System.out.println("Utilizadores ordenados em ordem ao numero de compras!");
        if(aux.size()<10){
            int size = aux.size();
            while(it.hasNext() && size>0){
                Utilizador u = it.next();
                System.out.println(u.getCod());
                size--;
            }
        }
        else{
            int size=10;
            while(it.hasNext() && size>0) {
                Utilizador u = it.next();
                System.out.println(u.getCod());
                size--;
            }
        }
    }


    public void load(){
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("|LOAD:                                                                                       |");
        System.out.println("|1  -> Ler a partir de ficheiros                                                             |");
        System.out.println("|2  -> Ficheiros .dat guardados                                                              |");
        System.out.println("|0  -> Voltar ao Menu                                                                        |");
        System.out.println("|____________________________________________________________________________________________|");
    }

    public void readError(){
        System.out.println("Os ficheiros a load não encontrados! Por favor repita o processo!");
    }

    public void loadError(){
        System.out.println("Ainda naão existem dados na aplicação por favor realize primeiro o paço de load!");
    }

    public void alreadyLoad(){
        System.out.println("Ficheiros Lidos!");
    }

    public void loadAgain(){
        System.out.println("Deseja ler novos ficheiros por cima dos atuais?(1).      Exit(0)");
    }

    public void insiraFilePath(){
        System.out.println("Insira o filePath do ficheiro a dar load!");
    }



}
