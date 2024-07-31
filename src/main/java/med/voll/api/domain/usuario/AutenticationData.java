package med.voll.api.domain.usuario;

//representa o DTO que o frontEnd está enviando na requisição
public record AutenticationData(String login, String senha) {
}
