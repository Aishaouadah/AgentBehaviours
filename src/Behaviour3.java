import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class Behaviour3 extends Behaviour {
    int step =0;

    public void action () {
        System.out.println("MY Name is"+ this.myAgent.getLocalName());

        switch (step)
        {
            case 0,1,2: System.out.println("STEP" + step);step++; break;
        }

        System.out.println("This is a Generic Behaviour");

        ACLMessage msg;
        msg= this.myAgent.blockingReceive();
        if (msg.getContent() != null)
        System.out.println("Message recu ");

    }


    public boolean done(){ return step==3;}
}
