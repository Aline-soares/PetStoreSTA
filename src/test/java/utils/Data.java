package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class Data {

    // Função para ler um arquivo JSON
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    // Função para ler um arquivo CSV
    public Collections<String[]> lerCsv(String caminhoCsv){

        return null;
    }
}
