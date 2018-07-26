package com.jas.bridgeTest;

/**
 * ClassName:BridgeTest
 * Package:com.jas.bridgeTest
 * Descrip: 桥接模式
 *
 * @Date:2018/7/21 下午9:56
 * @Author:jas
 */
public class BridgeTest {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        DrivenManager drivenManager = new DrivenManager(mysql);
//        drivenManager.setDatabase(new Mysql());
        drivenManager.useDatabase();
    }
}

interface Database {
    void useDatabase();
}

class Mysql implements Database {
    public void useDatabase() {
        System.out.println("mysql实现数据库接口");
    }
}

class Oracle implements Database {
    public void useDatabase() {
        System.out.println("oracle实现数据库接口");
    }
}

abstract class DatabaseDriven implements Database{
    private Database database;

    public DatabaseDriven(Database database){
        this.database = database;
    }

    public void useDatabase() {
        database.useDatabase();
    }
//
//    public void setDatabase(Database database){
//        this.database =  database;
//    }
//
//    public Database getDatabase(){
//        return database;
//    }
}

class DrivenManager extends DatabaseDriven{

    public DrivenManager(Database database) {
        super(database);
    }


//    @Override
//    public void useDatabase() {
//        super.getDatabase().useDatabase();
//    }
}
