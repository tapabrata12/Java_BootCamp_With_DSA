class Finalized {
  long getTime() {
    return System.currentTimeMillis();
  }

  protected void finalize() throws Throwable {
    // Perform cleanup operations here
    System.out.println("Cleanup operations executed.");
  }

  public static void main(String[] args) {
    Finalized obj = new Finalized();
    System.out.println("The current time is: " + obj.getTime());
    obj = null; // Set the reference to null
    System.gc(); // Explicitly call the garbage collector
  }
}
