

import java.util.Scanner;

public class EntradaSalida
{	
	public static void mostrarMenu()
	{
		System.out.println("---------------------------------------------");
		System.out.println("---------------MEN� PRINCIPAL----------------" + "\n");
		System.out.println("-- 1. Buscar patolog�as por nombre. 	   --");
		System.out.println("-- 2. Buscar s�ntomas por nombre.          --");
		System.out.println("-- 3. Listar patolog�as.                   --");
		System.out.println("-- 4. Buscar lista patolog�a por s�ntomas. --");
		System.out.println("-- 5. Listar s�ntomas por patolog�a.       --");
		System.out.println("---------------------------------------------");
	}
	
		public static int recogerOpcion()
	{
		int opcion = 0;
			@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		opcion = sc.nextInt();
		return opcion;
	}
	
	public static String recogerPatologia()
	{
		String patologia = null;
			@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println ("Introduzca nombre de patolog�a:");
		patologia = sc.nextLine();
		return patologia;
	}
}
