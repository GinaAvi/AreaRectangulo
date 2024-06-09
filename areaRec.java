class Main {
  public static void main(String[] args) {
    int base,altura,area;
    
    System.out.println("Base del rectangulo");          
    base=Integer.parseInt(System.console().readLine("Base: "));
    System.out.println("Altura del rectangulo");
    altura=Integer.parseInt(System.console().readLine("Altura: "));
    area=base*altura;
    System.out.println("El area del rectangulo es: "+area);
  }
}