package EJ01;

public class Main {

	public static void main(String[] args) {

				Persona p1 = new Persona("Paco", "García", "48484848A");
				CuentaCorriente cuenta1 = new CuentaCorriente();
				cuenta1 = null;
				CuentaAhorro cuenta2 = new CuentaAhorro();
				cuenta2 = null;

				Scanner sc = new Scanner(System.in);
				int opcion;
				int id;

				do {

					System.out.println("1.-Crear cuenta.");
					System.out.println("2.-Realizar operaciones de cuenta.");
					System.out.println("3.-Mostrar datos de cuenta.");
					System.out.println("4.-Salir.");

					System.out.print("\nIntroduce la opción: ");
					opcion = sc.nextInt();

					switch (opcion) {
					// Caso de crear cuenta
					case 1: {

						System.out.println("\n¿Qué tipo de cuenta va a crear?");
						System.out.println("1.-Cuenta corriente.");
						System.out.println("2.-Cuenta de ahorro.");

						System.out.print("\nIntroduce la opcion: ");
						id = sc.nextInt();

						if (id == 1) {

							cuenta1 = new CuentaCorriente();

							System.out.print("Introduce el número de cuenta: ");
							cuenta1.setNumerocuenta(sc.nextLong());
							System.out.print("Introduce el saldo de la cuenta: ");
							cuenta1.setSaldo(sc.nextDouble());

							System.out.println("\nSe han introducido los datos correctamente\n");
							break;

						} else if (id == 2) {

							cuenta2 = new CuentaAhorro();

							System.out.print("Introduce el número de cuenta: ");
							cuenta2.setNumerocuenta(sc.nextLong());
							System.out.print("Introduce el saldo de la cuenta: ");
							cuenta2.setSaldo(sc.nextDouble());
							System.out.print("Introduzca el tipo de interés que tiene: ");
							cuenta2.setInteres_variable(sc.nextDouble());
							System.out.println("\nSe han introducido los datos correctamente\n");
							break;

						} else {
							System.out.println("Error.");
						}

					}
						break;

					case 2:

						if (cuenta1 == null || cuenta2 == null) {

							System.out.println("\nNo hay ninguna cuenta creada\n");

						} else {

							System.out.println("\n¿Qué desea realizar?");
							System.out.println("1.-Ingresar.");
							System.out.println("2.-Retirar.");

							System.out.print("\nIntroduce la opción: ");
							opcion = sc.nextInt();

							if (opcion == 1) {

								System.out.println("\n¿En qué cuenta desea realizar el ingreso?");

								System.out.println("1.-Cuenta corriente.");
								System.out.println("2.-Cuenta de ahorro.");

								System.out.print("\nIntroduce la opción: ");
								id = sc.nextInt();

								if (id == 1) {
									System.out.println("\n¿Cuánto va a ingresar?");
									System.out.println("Introduzca la cantidad: ");
									double ingreso = sc.nextDouble();
									cuenta1.ingreso(ingreso);
									System.out.println();
									System.out.println("\nEl ingreso se ha efectuado correctamente.\n");
									break;
								} else if (id == 2) {
									System.out.println("\n¿Cuánto va a ingresar?");
									System.out.println("Introduzca la cantidad: ");
									double ingreso = sc.nextDouble();
									cuenta2.ingreso(ingreso);
									System.out.println();
									System.out.println("\nEl ingreso se ha efectuado correctamente.\n");
									break;
								}

							} else if (opcion == 2) {

								System.out.println("\n¿En qué cuenta desea realizar el retiro?");

								System.out.println("1.-Cuenta corriente.");
								System.out.println("2.-Cuenta de ahorro.");

								System.out.print("\nIntroduce la opción: ");
								id = sc.nextInt();

								if (id == 1) {
									System.out.println("\n¿Cuánto va a retirar?");
									System.out.println("Introduzca la cantidad: ");
									double retiro = sc.nextDouble();
									cuenta1.retirar(retiro);
									System.out.println();
									System.out.println("\nEl ingreso se ha efectuado correctamente.\n");
									break;
								} else if (id == 2) {
									System.out.println("\n¿Cuánto va a ingresar?");
									System.out.println("Introduzca la cantidad: ");
									double retiro = sc.nextDouble();
									cuenta2.retirar(retiro);
									System.out.println();
									System.out.println("\nEl ingreso se ha efectuado correctamente.\n");
									break;
								}

							}

						}

						break;
					
					case 3:

						if (cuenta1 == null || cuenta2 == null) {

							System.out.println("\nNo hay ninguna cuenta creada\n");

						} else {
							System.out.println("\n¿En qué tipo de cuenta desea ver sus datos?");
							System.out.println("1.-Cuenta corriente.");
							System.out.println("2.-Cuenta de ahorro.");

							System.out.print("\nIntroduce la opción: ");
							opcion = sc.nextInt();

							if (opcion == 1) {

								System.out.println();
								System.out.println(p1.toString());
								cuenta1.actualizarSaldo();
								System.out.println(cuenta1.toString());
								System.out.println();
								break;
								
							} else if (opcion == 2) {

								System.out.println();
								System.out.println(p1.toString());
								cuenta2.actualizarSaldo();
								System.out.println(cuenta2.toString());
								System.out.println();
								break;
							}
						}
						
						break;
					}

				} while (opcion != 4);

	}

}
