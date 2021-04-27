import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Behaviour1 extends OneShotBehaviour {
    @Override
    public void action() {
      System.out.println("this is OneShotBehaviour B1");
      int A=10;
        ACLMessage msg =new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID("A3", AID.ISLOCALNAME));
        msg.setContent(Integer.toString(A));
        this.myAgent.send(msg);
        System.out.println("Message sent");

    }
}
