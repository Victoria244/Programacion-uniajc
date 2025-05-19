package EvaluadorNotasEstudiantes;

import java.util.Scanner;

public class EvaluadorEstudiante {
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public EvaluadorEstudiante(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Validar que las notas estén entre 0.0 y 5.0
    public void validarNotas() {
        Scanner scanner = new Scanner(System.in);

        while (nota1 < 0.0 || nota1 > 5.0 || nota2 < 0.0 || nota2 > 5.0 || nota3 < 0.0 || nota3 > 5.0) {
            System.out.println("Las notas deben estar entre 0.0 y 5.0. Ingréselas nuevamente.");

            System.out.print("Ingrese nota 1: ");
            nota1 = scanner.nextDouble();

            System.out.print("Ingrese nota 2: ");
            nota2 = scanner.nextDouble();

            System.out.print("Ingrese nota 3: ");
            nota3 = scanner.nextDouble();
        }
    }

    // Calcular nota final
    public double calcularNotaFinal() {
        return nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.4;
    }

    // Verificar si aprueba
    public String verificarEstado() {
        double notaFinal = calcularNotaFinal();
        return (notaFinal >= 3.0) ? "Aprueba" : "Reprueba";
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese nota 3: ");
        double nota3 = scanner.nextDouble();

        EvaluadorEstudiante estudiante = new EvaluadorEstudiante(nota1, nota2, nota3);

        estudiante.validarNotas();
        double notaFinal = estudiante.calcularNotaFinal();
        String estado = estudiante.verificarEstado();

        System.out.println("Nota final: " + notaFinal);
        System.out.println("Estado: " + estado);

        scanner.close();
    }
}
