public class Recursivos {

    // 1. Multiplicação de dois naturais via somas sucessivas
    public static int multiplicar(int a, int b) {
        if (a == 0) return 0;
        return b + multiplicar(a - 1, b);
    }

    // 2. Soma de dois naturais via incrementos sucessivos
    public static int somar(int a, int b) {
        if (b == 0) return a;
        return somar(a + 1, b - 1);
    }

    // 3. Soma 1 + 1/2 + 1/3 + ... + 1/N
    public static double somaHarmonica(int n) {
        if (n == 1) return 1.0;
        return 1.0 / n + somaHarmonica(n - 1);
    }

    // 4. Inversão de uma string
    public static String inverter(String s) {
        if (s.isEmpty()) return "";
        return inverter(s.substring(1)) + s.charAt(0);
    }

    // 5. Sequência F(n) = 2*F(n-1) + 3*F(n-2)
    public static int sequenciaF(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return 2 * sequenciaF(n - 1) + 3 * sequenciaF(n - 2);
    }

    // 6. Função de Ackermann
    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    // 7. Soma dos elementos de um vetor
    public static int somaVetor(int[] v, int i) {
        if (i == v.length) return 0;
        return v[i] + somaVetor(v, i + 1);
    }

    // 7. Produto dos elementos de um vetor
    public static int produtoVetor(int[] v, int i) {
        if (i == v.length) return 1;
        return v[i] * produtoVetor(v, i + 1);
    }

    // 8. Verifica se uma palavra é palíndromo
    public static boolean ehPalindromo(String s) {
        return ehPalindromoAux(s, 0, s.length() - 1);
    }
    private static boolean ehPalindromoAux(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return ehPalindromoAux(s, i + 1, j - 1);
    }

    // 9. Gera todas as combinações das n primeiras letras do alfabeto
    public static void permutacoes(String prefixo, String resto) {
        if (resto.isEmpty()) {
            System.out.println(prefixo);
        } else {
            for (int i = 0; i < resto.length(); i++) {
                permutacoes(prefixo + resto.charAt(i), resto.substring(0, i) + resto.substring(i + 1));
            }
        }
    }
    public static void gerarPermutacoes(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append((char)('A' + i));
        permutacoes("", sb.toString());
    }

    // 10. Fibonacci generalizado
    public static int fibg(int f0, int f1, int n) {
        if (n == 0) return f0;
        if (n == 1) return f1;
        return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
    }
}
