public class SistemaInterno extends Funcionario {

    int senha = 2222;

    public void autentica(Autenticavel g) {
        boolean autenticou = g.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
