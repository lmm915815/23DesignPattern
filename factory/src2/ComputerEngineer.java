/*************************************************************************
	> File Name: ComputerEngineer.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 09:21:17 PM PDT
 ************************************************************************/
package org.tlq.abstractfactory;
import org.tlq.test.*;
public class ComputerEngineer{

    private Cpu cpu= null;
    private Mainboard board = null;
    public void makeComputer(AbstractFactory af){
        prepareHardwares(af);
    }
    private void prepareHardwares(AbstractFactory af){
        this.cpu = af.createCpu();
        this.board = af.createMainboard();
        this.cpu.calculate();
        this.board.installCPU();
    }
}

