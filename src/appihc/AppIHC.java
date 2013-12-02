package appihc;


import Controller.MasterController;
/**
 * Main Application
 * @author Rodrigo Zanella Ribeiro
 */
public class AppIHC {

    public static void main(String[] args) {
        MasterController masterController = new MasterController();
        masterController.execute();
    }
}
