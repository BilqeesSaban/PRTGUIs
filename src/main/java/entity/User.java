package entity;

public class User
{
    private int ID;
    private String firstName;
    private String lastName;
    private String cellNum;
    private String orderNum;
    private boolean orderStatus;

    private User()
    {

    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellNum() {
        return cellNum;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    private User (Builder builder)
    {
        this.ID = builder.ID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.cellNum = builder.cellNum;
        this.orderNum = builder.orderNum;
        this.orderStatus = builder.orderStatus;
    }

    @Override
    public String toString() {
        return "entity.User{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellNum='" + cellNum + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }

    public static class Builder
    {
        private int ID;
        private String firstName;
        private String lastName;
        private String cellNum;
        private String orderNum;
        private boolean orderStatus;

        public Builder setID(int ID) {
            this.ID = ID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCellNum(String cellNum) {
            this.cellNum = cellNum;
            return this;
        }

        public Builder setOrderNum(String orderNum) {
            this.orderNum = orderNum;
            return this;
        }

        public Builder setOrderStatus(boolean orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder copy (User user)
        {
            this.ID = user.ID;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.cellNum = user.cellNum;
            this.orderNum = user.orderNum;
            this.orderStatus = user.orderStatus;

            return this;
        }

        public User build()
        {
            return new User (this);
        }

    }

}
