import jade.core.Agent;

public class C1 extends Agent {
    @Override
    protected void setup() {
        if(this.getLocalName().equals("A1")) this.addBehaviour(new Behaviour1());
        if(this.getLocalName().equals("A2")) this.addBehaviour(new Behaviour2());
        if(this.getLocalName().equals("A3")) this.addBehaviour(new Behaviour3());
    }
/*   OneShotBehaviour: comportement qui sert à executer action une seule fois
    par défaut done true  (done à ne pas programmer)

    CyclicBehaviour
    comportement qui sert à executer action plusieurs fois sans arrêt
    par défaut done false  (done à ne pas programmer)

    Generic Behaviour  définir l'action et gérer done ( l'utilisateur)


    public void  action() */
}
