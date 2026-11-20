import com.google.gson.Gson;

public class PrincipalJson {

    public static void main(String[] args) {
        String json = "{\"nome\":\"Matheus\",\"idade\":24,\"cidade\":\"Guarulhos\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json,Pessoa.class);
        System.out.println(pessoa);



        var livroJson = "{\"titulo\":\"Blue Rose\",\"autor\":\"Matheus\",\"editora\":{\"nome\":\"company\",\"cidade\":\"São Paulo\"}}";

        Livro livro = gson.fromJson(livroJson,Livro.class);
        System.out.println(livro);






    }

}
