import jade.core.behaviours.Behaviour;

public class Behaviour3 extends Behaviour {
    int step =0;

    public void action () {
        System.out.println("MY Name is"+ this.myAgent.getLocalName());

        switch (step)
        {
            case 0: System.out.println("STEP" + step);step++; break;
            case 1:System.out.println("STEP" + step); step++; break;
            case 2: System.out.println("STEP" + step); step++; break;
        }

        System.out.println("This is a Generic Behaviour");
    }

    public boolean done(){ return step==3;}
}
