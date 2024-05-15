package br.com.alura.minhasmusicas.modelos;
public class MinhasPreferidas {
    
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " e considerado sucesso absoluto e preferido por todos!!");
        }else{
            System.out.println(audio.getTitulo() + " Uma excelente opcao para ser escutada ou deixar na fila");
        }
    }
}
