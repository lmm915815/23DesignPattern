/*************************************************************************
	> File Name: ComputerEngineer.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 02:32:38 AM PDT
 ************************************************************************/
package org.tlq.test;
public class ComputerEngineer{

    private Cpu cpu = null;
    private Mainboard mainboard = null;
    public void makeComputer(int cpuType , int mainboard){
        prepareHardwares(cpuType , mainboard);
    }

    private void prepareHardwares(int cpuType , int mainboard){
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainboard = MainboardFactory.createMainboard(mainboard);

        this.cpu.calculate();
        this.mainboard.installCPU();

    }


}

