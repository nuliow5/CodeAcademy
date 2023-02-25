package org.OOP.Tank;

public class Map {
    private int mapSize = 10;
    private int [][] gameMap;
    private Tank tank;

    public Map(int mapSize, Tank tank) {
        this.mapSize = mapSize;
        this.gameMap = new int[mapSize][mapSize];
        this.tank = tank;
    }

    public void printMap(){

        int xValue = tank.getxCoordinate();
        int yValue = tank.getyCoordinate();
//        tankInMap();
        gameMap[yValue][xValue] = 1;

        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
        //clean
        gameMap[yValue][xValue] = 0;
    }

    public int[][] tankInMap(){
        gameMap[tank.getxCoordinate()][tank.getyCoordinate()] = 1;
        return gameMap;
    }



    public int getMapSize() {
        return mapSize;
    }

    public int[][] getGameMap() {
        return gameMap;
    }



}
