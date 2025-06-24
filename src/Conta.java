
public class Conta {
    public float numConta;           //ganha 150 reais      //ganha 50 reais
    protected String tipo;        // cp = conta poupança cc = conta corrente
    private String dono;
    private float saldo;
    private boolean status;        // aberta = true fechada = false

    public Conta(String type, String owner){
        if(!type.equalsIgnoreCase("cc") && !type.equalsIgnoreCase("cp")){
            throw new IllegalArgumentException("Conta Invalida/ ERROR ");
        } else if (type.equals("cc")) {
            this.saldo = 50;
        } else if(type.equals("cp")){
            this.saldo = 150;
        }
        this.status = false;
        this.numConta = (float)Math.floor((float)Math.random()*10000);
        this.tipo = type;
        this.dono = owner;
    }

    public void abrirConta(){
        this.status = true;
    }
    public void fecharConta(){
        this.status = false;
    }
    public void depositar(float f){        //metodo setter
        this.saldo += f;
    }
    public void sacar(float valor){         // metodo getter
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso");
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }
    public void pagarMensal(){
        if(this.tipo.equals("cc")){
            this.saldo -= 12;
        }else if(this.tipo.equals("cp")){
            this.saldo -= 20;
        }
    }

    public double getNumConta(){return this.numConta;}
    public float getSaldo(){return this.saldo;}
    public boolean getStatus(){return this.status;}
    public String getTipo(){return this.tipo;}
    public String getDono(){return this.dono;}

    protected void setSaldo(float s){ this.saldo = s; }
    public void setTipo(String t){this.tipo = t; }
    public void setDono(String d){this.dono = d;}
    public void setNumConta(float n){this.numConta = n;}




}
