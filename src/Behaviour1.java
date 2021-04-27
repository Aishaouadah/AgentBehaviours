import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

import java.io.IOException;

public class Behaviour1 extends OneShotBehaviour {
    @Override
    public void action() {
      System.out.println("this is OneShotBehaviour B1");
      int[] A={10,4,5,7,8};
        ACLMessage msg =new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID("A3", AID.ISLOCALNAME));
        try {
            msg.setContentObject(A);
        }
         catch (IOException e) {
            e.printStackTrace();
        }

        this.myAgent.send(msg);
        System.out.println("Message sent");

    }
}
