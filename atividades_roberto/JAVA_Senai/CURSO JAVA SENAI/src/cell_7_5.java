public class cell_7_5 {
    private String name;
    private boolean isAberto;
    private int seguranca;

    public cell_7_5 (String name, boolean isAberto, int seguranca){
        this.name=name;
        this.isAberto=isAberto;
        this.seguranca=seguranca;
    }

    public String getName(){
        return name;
    }

    public boolean getIsOpen(){
        return isAberto;
    }


    public void setIsopen(int code){
        if (code != seguranca){
            System.out.println("Codigo incorreto");
        }else {
            if (isAberto){
                this.isAberto = false;
                System.out.println("cela " + name + " Fechada");
            }else {
                System.out.println("cela "+name+" aberta");
                this.isAberto = true;
            }

        }

    }
}
