package anonimusinner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        MonitoringSystem generaIndicatorMonitoringModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал");
            }
        };
        MonitoringSystem errorMonitoringModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал");
            }
        };

        generaIndicatorMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();


    }

    /*
    * new <ИМЕНИ_НЕТ> <класс родительский/реализуемый параметр>(параметры конструктора родителя){
    * };
     */
}
// неэффективный вариант создания классов
/*
class GeneraIndicatorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал");
    }
}

class ErrorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал");
    }
}

class SecurityModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал");
    }
}*/
