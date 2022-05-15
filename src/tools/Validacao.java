package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nuno Fonseca
 */
public class Validacao {

    static BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public static String validarString(String msg, byte min, byte max) {
        String res = "";
        do {
            try {
                System.out.println(msg);
                res = bfr.readLine();

                if (res.length() < min || res.length() > max) {
                    System.out.println("Tamanho inválido [" + min + "-" + max + "]");
                }
            } catch (IOException ex) {
                System.out.println("Erro ao ler palavra.");
            }
        } while (res.length() < min || res.length() > max);
        return res;
    }

    public static char validarChar(String msg) {
        String res = "";
        do {
            try {
                System.out.println(msg);
                res = bfr.readLine();

                if (res.length() != 1) {
                    System.out.println("Escreva apenas uma letra.");
                }
            } catch (IOException ex) {
                System.out.println("Erro ao ler letra.");
            }
        } while (res.length() != 1);
        return res.charAt(0);
    }

    public static char validarCharAlternativas(String msg, char[] alternativas) {
        String res = "";
        boolean valido = false;
        do {
            try {
                System.out.print(msg);
                res = bfr.readLine().toUpperCase();

                for (int i = 0; i < alternativas.length; i++) {
                    if (res.charAt(0) == alternativas[i]) {
                        valido = true;
                        break;
                    }
                }

                if (res.length() != 1) {
                    System.out.println("Escreva apenas uma letra.");
                } else if (!valido) {
                    System.out.println("Opção invália.");
                }

            } catch (IOException ex) {
                System.out.println("Erro ao ler letra.");
            }

        } while (res.length() != 1 || !valido);

        return res.charAt(0);
    }

    public static Float validarFloat(String msg, float min, float max) {
        float res = 0;
        do {
            try {
                System.out.println(msg);
                res = Float.parseFloat(bfr.readLine());

                if (res < min || res > max) {
                    System.out.println("Intervalo inválido [" + min + "-" + max + "]");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tipo de número inválido.");
            } catch (IOException ex) {
                System.out.println("Erro ao ler número.");
            }
        } while (res < min || res > max);
        return res;
    }

    public static byte validarByte(String msg, byte min, byte max) {
        byte res = 0;
        do {
            try {
                System.out.println(msg);
                res = Byte.parseByte(bfr.readLine());

                if (res < min || res > max) {
                    System.out.println("Intervalo inválido [" + min + "-" + max + "]");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tipo de número inválido.");
            } catch (IOException ex) {
                System.out.println("Erro ao ler número.");
            }
        } while (res < min || res > max);
        return res;
    }

    public static short validarShort(String msg, short min, short max) {
        short res = 0;
        do {
            try {
                System.out.println(msg);
                res = Short.parseShort(bfr.readLine());

                if (res < min || res > max) {
                    System.out.println("Intervalo inválido [" + min + "-" + max + "]");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tipo de número inválido.");
            } catch (IOException ex) {
                System.out.println("Erro ao ler número.");
            }
        } while (res < min || res > max);
        return res;
    }

    public static int validarInt(String msg, int min, int max) {
        int res = 0;
        do {
            try {
                System.out.println(msg);
                res = Integer.parseInt(bfr.readLine());

                if (res < min || res > max) {
                    System.out.println("Intervalo inválido [" + min + "-" + max + "]");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tipo de número inválido.");
            } catch (IOException ex) {
                System.out.println("Erro ao ler número.");
            }
        } while (res < min || res > max);
        return res;
    }

    public static long validarLong(String msg, long min, long max) {
        long res = 0;
        do {
            try {
                System.out.println(msg);
                res = Long.parseLong(bfr.readLine());

                if (res < min || res > max) {
                    System.out.println("Intervalo inválido [" + min + "-" + max + "]");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tipo de número inválido.");
            } catch (IOException ex) {
                System.out.println("Erro ao ler número.");
            }
        } while (res < min || res > max);
        return res;
    }

    public static double validarDouble(String msg, double min, double max) {
        double res = 0;
        do {
            try {
                System.out.println(msg);
                res = Double.parseDouble(bfr.readLine());

                if (res < min || res > max) {
                    System.out.println("Intervalo inválido [" + min + "-" + max + "]");
                }

            } catch (NumberFormatException e) {
                System.out.println("Tipo de número inválido.");
            } catch (IOException ex) {
                System.out.println("Erro ao ler número.");
            }
        } while (res < min || res > max);
        return res;
    }
}
