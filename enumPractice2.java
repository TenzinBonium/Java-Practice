class Cola {
  enum ColaSize {
    ml250, ml500, l1
  }

  ColaSize ml;
}

public class enumPractice2 {
  public static void main(String[] args) {
    Cola size = new Cola();
    size.ml = Cola.ColaSize.l1;
    System.out.println("Cola Size: " + size.ml);
  }
}