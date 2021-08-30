package factory;

import entity.User;

public class UserFactory
{
    public static User createUser (int ID, String firstName, String lastName, String cellNum, String orderNum, boolean orderStatus)
    {
        User user = new User.Builder()
                .setID(ID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setCellNum(cellNum)
                .setOrderNum(orderNum)
                .setOrderStatus(orderStatus)
                .build();
        return user;
    }
}
