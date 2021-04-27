import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;

public class Behaviour3 extends Behaviour {
    int step =0;

    public void action () {
        System.out.println("MY Name is"+ this.myAgent.getLocalName());

        switch (step) {
            case 0, 1, 2 -> {
                System.out.println("STEP" + step);
                step++;
            }
        }

        System.out.println("This is a Generic Behaviour");
//receiving a table
        ACLMessage msg;
        msg= this.myAgent.blockingReceive();
        if (null != msg)
            try {
               int[] A = (int[]) msg.getContentObject();
                System.out.println("Message recu ");
                int i=0;
                for(i=0;i<A.length;i++){ System.out.print(" "+A[i]+" ");}
                System.out.println(" ");

            } catch (UnreadableException e) {
                e.printStackTrace();
            }

       /*
        ACLMessage msg;
        msg= this.myAgent.receive();
        if (msg != null)
        System.out.println("Message recu ");
       */
        /* msg= this.myAgent.Blokingreceive();
        if (msg.getcontent() != null)
        System.out.println("Message recu ");
       */
    }


    public boolean done(){ return step==3;}
}
