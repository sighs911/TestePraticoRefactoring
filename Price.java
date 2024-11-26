public abstract class Price {
  public abstract int getPriceCode();

  public double getCharge(int daysRented, Rental aRental) {
    double thisAmount = 0;

    switch (aRental.getMovie().getPriceCode()) {
      case Movie.REGULAR:
        thisAmount += 2;
        if (aRental.getDaysRented() > 2) {
          thisAmount += (aRental.getDaysRented() - 2) * 1.5;
        }
        break;
      case Movie.NEW_RELEASE:
        thisAmount += aRental.getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmount += 1.5;
        if (aRental.getDaysRented() > 3) {
          thisAmount += (aRental.getDaysRented() - 3) * 1.5;
        }
        break;
    }
    return thisAmount;
  }
}