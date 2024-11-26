public abstract class Price {
  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented, Rental aRental) {
    int frequentRenterPoints = 0;
    // add frequent renter points
    frequentRenterPoints++;
    if ((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
        aRental.getDaysRented() > 1)
      frequentRenterPoints++;
    return frequentRenterPoints;
  }
}