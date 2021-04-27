import jade.core.behaviours.CyclicBehaviour;

public class Behaviour2  extends CyclicBehaviour {
    int i=0;
    @Override
    public void action() {


            i++;
            System.out.println("MY Name is"+ this.myAgent.getLocalName());
            System.out.println("This is a CyclicBehaviour");
            if (i==5) {this.myAgent.doSuspend();}

        }



    }
