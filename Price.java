public abstract class Price {
  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented, Rental aRental) {
    return 1;
  }
}