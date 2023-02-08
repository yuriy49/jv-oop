package core.basesyntax;

public class MainApp {


  public static void Main() {

    Machine excavator = new Excavator();
    Machine bulldozer = new Bulldozer();
    Machine truck = new Truck();

    Machine [] machines = new Machine[] {truck, bulldozer, excavator};

    for (Machine machine: machines) {
      System.out.println(machine.doWork());
      System.out.println(machine.stopWork());
    }


  }
}
