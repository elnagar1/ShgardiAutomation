package Courier_App.US01.ViewModel;

import Framework.ExcelReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserModel {
    String FName;
    String LName;
    String Email;
    String Password;
    static  List<UserModel> listA;

    public static List<UserModel> reader() throws IOException {

        ExcelReader reader = new ExcelReader();
        UserModel userModel = null;
        String[][] users = (String[][]) reader.getExcelData();


        System.out.print("The Array is :\n");
        listA = new ArrayList();
        int row = 3;
        int col = 4;

        for (int i = 0; i < row; i++) {
            userModel = new UserModel();
            for (int j = 0; j < col; j++) {
                if (j == 2) {
                    userModel.setEmail(users[i][j]);
                } else if (j == 3) {
                    // String x =users[i][j].substring(2,users[i][j].length()-1);
                    int x = (int) Double.parseDouble(users[i][j]);
                    userModel.setPassword("" + x);
                }
            }
            listA.add(userModel);
        }
        System.out.println(listA.get(0).getEmail() + " ++++++++ " + listA.get(0).getPassword());
        return listA;
    }


    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }


}
