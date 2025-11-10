import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] a = {
            {1, 4, 15, 7},
            {8, 10, 2, 11},
            {14, 3, 6, 13},
            {12, 9, 5, 0}
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
        }
        System.out.println("\n");

        int ch;
        System.out.println("          -----INSTRUCITIONS-----         ");
        System.out.println("1] Move zero box UP,DOWN,RIGHT,LEFT\n2] Total number will be count after sorting the number in ascending order ");
        System.out.println("If you start Game type 1 otherwise  type 2\n");
        System.out.println("If you want restart the game enter 5\nIf you want exit form the game enter 3\n");
        ch = sc.nextInt();

        if (ch == 1) {
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 0) {
                        System.out.print("[]\t");
                    } else {
                        System.out.printf("%d\t", a[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println("\nMove box in right  or left or down or up");
            System.out.println("4 is Left\n6 is Right\n8 is Up\n2 is Down\n");
            System.out.println("If you want restart the game enter 5\nIf you want exit form the game enter 3\n\n");

            int count = 0;

            while (true) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 4: {
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (i == 0 && j == 0 && a[i][j] == 0) {
                                    break;
                                } else if (j == 0 && (i == 0 || i == 1 || i == 2 || i == 3) && a[i][j] == 0) {
                                    break;
                                } else if (a[i][j] == 0) {
                                    int temp;
                                    temp = a[i][j];
                                    a[i][j] = a[i][j - 1];
                                    a[i][j - 1] = temp;
                                    count++;
                                } else {
                                    continue;
                                }
                            }
                        }

                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (a[i][j] == 0) {
                                    System.out.print("[]\t");
                                } else {
                                    System.out.printf("%d\t", a[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.printf("\nNumber of moves: %d\n\n", count);
                        break;
                    }

                    case 6: {
                        System.out.println();
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (j == 3 && (i == 0 || i == 1 || i == 2 || i == 3) && a[i][j] == 0) {
                                    break;
                                } else if (a[i][j] == 0) {
                                    int temp;
                                    temp = a[i][j];
                                    a[i][j] = a[i][j + 1];
                                    a[i][j + 1] = temp;
                                    count++;
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (a[i][j] == 0) {
                                    System.out.print("[]\t");
                                } else {
                                    System.out.printf("%d\t", a[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.printf("\nNumber of moves: %d\n\n", count);
                        break;
                    }

                    case 8: {
                        System.out.println();
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (j == 0 && (i == 0 || i == 1 || i == 2 || i == 3) && a[j][i] == 0) {
                                    break;
                                } else if (a[j][i] == 0) {
                                    int temp;
                                    temp = a[j][i];
                                    a[j][i] = a[j - 1][i];
                                    a[j - 1][i] = temp;
                                    count++;
                                } else {
                                    continue;
                                }
                            }
                        }
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (a[i][j] == 0) {
                                    System.out.print("[]\t");
                                } else {
                                    System.out.printf("%d\t", a[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.printf("\nNumber of moves: %d\n\n", count);
                        break;
                    }

                    case 2: {
                        System.out.println();
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (j == 3 && (i == 0 || i == 1 || i == 2 || i == 3) && a[j][i] == 0) {
                                    break;
                                } else if (a[j][i] == 0) {
                                    int temp;
                                    temp = a[j][i];
                                    a[j][i] = a[j + 1][i];
                                    a[j + 1][i] = temp;
                                    count++;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        }
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (a[i][j] == 0) {
                                    System.out.print("[]\t");
                                } else {
                                    System.out.printf("%d\t", a[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.printf("\nNumber of moves: %d\n\n", count);
                        break;
                    }

                    case 5: {
                        System.out.println();
                        int c = 0;
                        count = c;
                        int[][] b = {
                            {1, 4, 15, 7},
                            {8, 10, 2, 11},
                            {14, 3, 6, 13},
                            {12, 9, 5, 0}
                        };
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                a[i][j] = b[i][j];
                            }
                        }
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (a[i][j] == 0) {
                                    System.out.print("[]\t");
                                } else {
                                    System.out.printf("%d\t", a[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.printf("\nNumber of moves: %d\n\n", count);
                        break;
                    }

                    default: {
                        System.out.println("You exit from the game");
                        System.exit(0);
                    }
                }
            }
        } else {
            System.out.println("Thank you ");
        }

        sc.close();
    }
}
