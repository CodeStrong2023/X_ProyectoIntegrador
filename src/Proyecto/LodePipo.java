package Proyecto;

import java.util.HashMap;
import java.util.Scanner;

public class LodePipo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte opmax = 1;
        byte opPlato;
        byte opCarta;
        byte opMesa;
        float total = 0;
        String pedido = "";
        float total1 = 0;
        String pedido1 = "";
        float total2 = 0;
        String pedido2 = "";
        HashMap<Integer, String> Carta = new HashMap<>();
        //*Diccionario
        Carta.put(350, "Empanada");
        Carta.put(800, "Picada");
        Carta.put(600, "Ensalada");
        Carta.put(4000, "Carne a la Masa");
        Carta.put(3200, "Sorrentinos");
        Carta.put(3400, "Milanesa a la Napolitana");
        Carta.put(2650, "Albondigas con Pure");
        Carta.put(2800, "Ravioles");
        Carta.put(680, "Helado");
        Carta.put(900, "Tiramisu");
        Carta.put(500, "Ensalada de Frutas");
        Carta.put(750, "Cafe con Medialuna");
        Carta.put(1000, "Coca Cola");
        Carta.put(850, "Agua Saborizada");
        Carta.put(1600, "Cerveza");
        Carta.put(3000, "Vino");
        Carta.put(860, "Agua Mineral");


        do {
            System.out.println("\tBienvenido a el menu");
            System.out.println("0. Regresar");
            System.out.println("Seleccione la mesa que desea cargar");
            opMesa = sc.nextByte();
            System.out.println("0. Regresar");
            if (opMesa == 1) {
                do {
                    mostrarMenu();
                    opCarta = sc.nextByte();
                    switch (opCarta) {
                        case 1:
                            Entradas();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total += 300;
                                pedido += "\nEmpanadas";
                            } else if (opPlato == 2) {
                                total += 500;
                                pedido += "\nPicada";
                            } else if (opPlato == 3) {
                                total += 500;
                                pedido += "\nEnsalada";
                            }
                            break;
                        case 2:
                            pPrincip();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total += 2500;
                                pedido += "\nCarne a la masa";
                            } else if (opPlato == 2) {
                                total += 500;
                                pedido += "\nSorrentinos";
                            } else if (opPlato == 3) {
                                total += 500;
                                pedido += "\nMilanesa a la Napolitana";
                            } else if (opPlato == 4) {
                                total += 500;
                                pedido += "\nAlbondigas con Pure";
                            } else if (opPlato == 5) {
                                total += 500;
                                pedido += "\nRavioles";
                            }
                            break;
                        case 3:
                            Postres();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total += 2500;
                                pedido += "\nHelado";
                            } else if (opPlato == 2) {
                                total += 500;
                                pedido += "\nTiramisu";
                            } else if (opPlato == 3) {
                                total += 500;
                                pedido += "\nEnsalada de Frutas";
                            } else if (opPlato == 4) {
                                total += 500;
                                pedido += "\nCafe con medialuna";
                            }
                            break;
                        case 4:
                            Bebidas();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total += 2500;
                                pedido += "\nCoca Cola - 500ml";
                            } else if (opPlato == 2) {
                                total += 500;
                                pedido += "\nAgua Saborizada - 1000ml";
                            } else if (opPlato == 3) {
                                total += 500;
                                pedido += "\nCerveza Andes - 1000ml";
                            } else if (opPlato == 4) {
                                total += 500;
                                pedido += "\nVino Malbec - 1000ml";
                            } else if (opPlato == 5) {
                                total += 500;
                                pedido += "\nAgua Mineral - 1000ml";
                            }
                            break;
                        case 5:
                            System.out.println("Usted a pedido:");
                            System.out.println(pedido);
                            System.out.println("El total del pedido es: $" + total);
                            total = 0;
                            pedido = "";
                    }
                }while (opCarta != 0);
            } else if (opMesa == 2) {
                        do {
                            mostrarMenu();
                            System.out.println("Seleccione ");opCarta = sc.nextByte();
                            switch (opCarta) {
                                case 1:
                                    Entradas();
                                    opPlato = sc.nextByte();
                                    if (opPlato == 1) {
                                        total1 += 300;
                                        pedido1 += "\nEmpanadas";
                                    } else if (opPlato == 2) {
                                        total1 += 500;
                                        pedido1 += "\nPicada";
                                    } else if (opPlato == 3) {
                                        total1 += 500;
                                        pedido1 += "\nEnsalada";
                                    }
                                    break;
                                case 2:
                                    pPrincip();
                                    opPlato = sc.nextByte();
                                    if (opPlato == 1) {
                                        total1 += 2500;
                                        pedido1 += "\nCarne a la masa";
                                    } else if (opPlato == 2) {
                                        total1 += 500;
                                        pedido1 += "\nSorrentinos";
                                    } else if (opPlato == 3) {
                                        total1 += 500;
                                        pedido1 += "\nMilanesa a la Napolitana";
                                    } else if (opPlato == 4) {
                                        total1 += 500;
                                        pedido1 += "\nAlbondigas con Pure";
                                    } else if (opPlato == 5) {
                                        total1 += 500;
                                        pedido1 += "\nRavioles";
                                    }
                                    break;
                                case 3:
                                    Postres();
                                    opPlato = sc.nextByte();
                                    if (opPlato == 1) {
                                        total1 += 2500;
                                        pedido1 += "\nHelado";
                                    } else if (opPlato == 2) {
                                        total1 += 500;
                                        pedido1 += "\nTiramisu";
                                    } else if (opPlato == 3) {
                                        total1 += 500;
                                        pedido1 += "\nEnsalada de Frutas";
                                    } else if (opPlato == 4) {
                                        total1 += 500;
                                        pedido1 += "\nCafe con medialuna";
                                    }
                                    break;
                                case 4:
                                    Bebidas();
                                    opPlato = sc.nextByte();
                                    if (opPlato == 1) {
                                        total1 += 2500;
                                        pedido1 += "\nCoca Cola - 500ml";
                                    } else if (opPlato == 2) {
                                        total1 += 500;
                                        pedido1 += "\nAgua Saborizada - 1000ml";
                                    } else if (opPlato == 3) {
                                        total1 += 500;
                                        pedido1 += "\nCerveza Andes - 1000ml";
                                    } else if (opPlato == 4) {
                                        total1 += 500;
                                        pedido1 += "\nVino Malbec - 1000ml";
                                    } else if (opPlato == 5) {
                                        total1 += 500;
                                        pedido1 += "\nAgua Mineral - 1000ml";
                                    }
                                    break;
                                case 5:
                                    System.out.println("Usted a pedido:");
                                    System.out.println(pedido1);
                                    System.out.println("El total del pedido es: $" + total1);
                                    total1 = 0;
                                    pedido = "";

                            }
                        } while (opCarta != 0);

            } else if (opMesa == 3) {
                do {
                    mostrarMenu();
                    System.out.println("Seleccione ");opCarta = sc.nextByte();
                    switch (opCarta) {
                        case 1:
                            Entradas();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total2 += 300;
                                pedido2 += "\nEmpanadas";
                            } else if (opPlato == 2) {
                                total2 += 500;
                                pedido2 += "\nPicada";
                            } else if (opPlato == 3) {
                                total2 += 500;
                                pedido2 += "\nEnsalada";
                            }
                            break;
                        case 2:
                            pPrincip();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total2 += 2500;
                                pedido2 += "\nCarne a la masa";
                            } else if (opPlato == 2) {
                                total2 += 500;
                                pedido2 += "\nSorrentinos";
                            } else if (opPlato == 3) {
                                total2 += 500;
                                pedido2 += "\nMilanesa a la Napolitana";
                            } else if (opPlato == 4) {
                                total2 += 500;
                                pedido2 += "\nAlbondigas con Pure";
                            } else if (opPlato == 5) {
                                total2 += 500;
                                pedido2 += "\nRavioles";
                            }
                            break;
                        case 3:
                            Postres();
                            opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total2 += 2500;
                                pedido2 += "\nHelado";
                            } else if (opPlato == 2) {
                                total2 += 500;
                                pedido2 += "\nTiramisu";
                            } else if (opPlato == 3) {
                                total2 += 500;
                                pedido2 += "\nEnsalada de Frutas";
                            } else if (opPlato == 4) {
                                total2 += 500;
                                pedido2 += "\nCafe con medialuna";
                            }
                            break;
                        case 4:
                            Bebidas();
                            System.out.println("Seleccione el plato deseado");opPlato = sc.nextByte();
                            if (opPlato == 1) {
                                total2 += 2500;
                                pedido2 += "\nCoca Cola - 500ml";
                            } else if (opPlato == 2) {
                                total2 += 500;
                                pedido2 += "\nAgua Saborizada - 1000ml";
                            } else if (opPlato == 3) {
                                total2 += 500;
                                pedido2 += "\nCerveza Andes - 1000ml";
                            } else if (opPlato == 4) {
                                total2 += 500;
                                pedido2 += "\nVino Malbec - 1000ml";
                            } else if (opPlato == 5) {
                                total2 += 500;
                                pedido2 += "\nAgua Mineral - 1000ml";
                            }
                            break;
                        case 5:
                            System.out.println("Usted a pedido:");
                            System.out.println(pedido2);
                            System.out.println("El total del pedido es: $" + total2);
                            total2 = 0;
                            pedido2 = "";

                    }
                } while (opCarta != 0);

            }
                } while (opMesa != 0);
            }

            static void mostrarMenu(){
                System.out.println("""
                            ------------MENU------------
                            .1   Entradas
                            .2   Plato Principal
                            .3   Postres
                            .4   Bebidas
                            .5   Imprimir Cuenta
                            .0   Regresar
                            Seleccione lo que desea ver:
                            """);
            }
            static void Entradas(){
                System.out.println("""
                                    ------------ENTRADAS------------
                                    1. Empanadas
                                    2. Picada
                                    3. Ensalada
                                    Seleccione el plato deseado: 
                                """);
            }
            static void pPrincip(){
                System.out.println("""
                                    ------------PLATOS PRINCIPALES------------
                                    1. Carne a la masa
                                    2. Sorrentinos
                                    3. Milanesa a la Napolitana
                                    4. Albondigas con Pure
                                    5. Ravioles
                                    Seleccione el plato deseado:                                  
                                    """);
            }
            static void Postres(){
                System.out.println("""
                                    ------------Postres------------
                                    1. Helado
                                    2. Tiramisu
                                    3. Ensalada de Frutas
                                    4. Cafe con medialuna
                                    Seleccione el plato deseado:
                                    """);
            }
            static void Bebidas(){
                System.out.println("""
                                    ------------BEBIDAS------------
                                    1. Coca Cola - 500ml
                                    2. Agua Saborizada - 1000ml
                                    3. Cerveza Andes - 1000ml
                                    4. Vino Malbec - 1000ml
                                    "5. Agua Mineral - 1000ml
                                    Seleccione el plato deseado:
                                    """);
            }


        }
