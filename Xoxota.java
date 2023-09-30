package Xoxota; 

import robocode.*;

public class Xoxota extends Robot {
    
    public void run() {
     
        while (true) {
            ahead(100); 
            turnGunRight(360); 
            back(100); 
            turnGunRight(360); 
        }
    }
    
    public void onScannedRobot(ScannedRobotEvent event) {
        
        fire(1); 
    }
    
    public void onHitByBullet(HitByBulletEvent event) {
        
        turnLeft(90 - event.getBearing()); 
    }
}

