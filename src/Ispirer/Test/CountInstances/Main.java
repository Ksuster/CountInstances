package Ispirer.Test.CountInstances;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        InstanceCounter a = new InstanceCounter();
        InstanceCounter b = new InstanceCounter();

        JOptionPane.showMessageDialog(null, "Количество созданных экземпляров: " + InstanceCounter.getInstanceCount());
    }
}
