public class Main {
    public static void main(String[] args){
        String [] jadeArg = new String[2];
            StringBuffer SbAgent = new StringBuffer();
            SbAgent.append("A1:C1;");
            SbAgent.append("A2:C1;");
            SbAgent.append("A3:C1;");
            jadeArg[0]="-gui";
            jadeArg[1]=SbAgent.toString();
            jade.Boot.main(jadeArg);


    }
}
