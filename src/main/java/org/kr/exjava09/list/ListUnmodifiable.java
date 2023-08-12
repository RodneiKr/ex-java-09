package main.java.org.kr.exjava09.list;

import java.util.List;

public class ListUnmodifiable {

    public static void main(String[] args) {
        final List<JavaBean> javaBeanList = List.of(
                new JavaBean(1, "ex"),
                new JavaBean(2, "java"),
                new JavaBean(3, "09")
        );
//        javaBeanList.add(new JavaBean(9, "erro")); // ERRO de execucao
        System.out.println("\n\n\n");
        javaBeanList.forEach(System.out::println);
        javaBeanList.get(0).setNome("EXXXXXXXXXX");  //  isso eh ruim, os valores dos atributos do bean NAO poderiam ser alterados
        System.out.println();
        javaBeanList.forEach(System.out::println);
    }
}

class JavaBean {
    private Integer id;
    private String nome;

    public JavaBean(final Integer id, final String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id=" + this.id + ", nome=" + this.nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}