package Modelo;

public class modFiguras {

    private float base;
    private float altura;
    private float lado;
    private int radio;

    private float area;
    private float perimetro;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    /*Cuadrado*/
    public float areaCuadrado() {
        return area = lado * lado;
    }

    public float perimetroCuadrado() {
        return perimetro = lado * 4;
    }

    public String desCuadrado() {
        areaCuadrado();
        perimetroCuadrado();
        return "El Área Del Cuadrado Es De: \n" + area + " Y Su Perímetro Es: " + perimetro;
    }

    /*Rectangulo*/
    public float areaRectangulo() {
        return area = base * altura;
    }

    public float perimetroRectangulo() {
        return perimetro = ((base * 2) + (altura * 2));
    }

    public String descripRectangulo() {
        areaRectangulo();
        perimetroRectangulo();
        return "El Área Del Rectangulo Es De: \n" + area + " Y Su Perímetro Es: " + perimetro;
    }

    /*Triangulo*/
    public float areaTriangulo() {
        return area = ((base * altura) / 2);
    }

    public float perimetroTriangulo() {
        return perimetro = base * 3;
    }

    public String descripTriangulo() {
        areaTriangulo();
        perimetroTriangulo();
        return "El Área Del Triangulo Es De: \n" + area + " Y Su Perímetro Es: " + perimetro;
    }

}
