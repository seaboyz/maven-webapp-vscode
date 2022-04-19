public enum Role {

  EMPLOYEE {
    @Override
    public String toString() {
      return "Employee";
    }
  },
  FINANCE_MANAGER {
    @Override
    public String toString() {
      return "Finance Manager";
    }
  },
  NOT_CURRENT_EMPLOYEE {
    @Override
    public String toString() {
      return "Not a current employee";
    }
  }

}