import java.util.Scanner;

public class TesteCidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		 String[] cityNames = {"Maringá", "Londrina", "Cascavel", "Ponta Grossa", "Foz do Iguaçu"};
	        Cidade[] cities = new Cidade[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Insira  as informações para:  " + cityNames[i] + ":");
	            System.out.print("ID: ");
	            int id = scanner.nextInt();

	            System.out.print("Quantidades  de veiculos na cidade:  ");
	            int veiculo = scanner.nextInt();

	            System.out.print(" Número de acidentes (ano anterior) com vítimas: ");
	            int acidente = scanner.nextInt();

	            cities[i] = new Cidade(cityNames[i], id, veiculo, acidente);
	        }

	        // 1. Encontre a cidade com maior e menor número de acidentes
	        Cidade maxAccidentsCity = findMaxAccidentsCity(cities);
	        Cidade minAccidentsCity = findMinAccidentsCity(cities);

	        System.out.println("Cidade com maior número de acidentes: " + maxAccidentsCity.nome);
	        System.out.println("Cidade com menor número de acidentes: " + minAccidentsCity.nome);

	        // 2. Calcular a média anual de acidentes por cidade por quantidade de veículos
	        for (Cidade city : cities) {
	            double averageAccidentsPerVehicle = (double) city.acidente / city.veiculo * 100; // Convert to percentage
	            System.out.println("Média anual de acidentes por veículo em: " + city.nome + ": " + String.format("%.2f", averageAccidentsPerVehicle) + "%");
	        }

	        // 3. Calcule a média total de acidentes por veículo para todas as cidades
	        int totalacidente = 0;
	        int totalveiculo = 0;
	        for (Cidade city : cities) {
	            totalacidente += city.acidente;
	            totalveiculo += city.veiculo;
	        }
	        double totalAverageAccidentsPerVehicle = (double) totalacidente / totalveiculo * 100; // Convert to percentage
	        System.out.println("Média total de acidentes anuais por veículo: " + String.format("%.2f", totalAverageAccidentsPerVehicle) + "%");
	    }

	    private static Cidade findMaxAccidentsCity(Cidade[] cities) {
	        Cidade maxAccidentsCity = cities[0];
	        for (Cidade city : cities) {
	            if (city.acidente > maxAccidentsCity.acidente) {
	                maxAccidentsCity = city;
	            }
	        }
	        return maxAccidentsCity;
	    }

	    private static Cidade findMinAccidentsCity(Cidade[] cities) {
	        Cidade minAccidentsCity = cities[0];
	        for (Cidade city : cities) {
	            if (city.acidente < minAccidentsCity.acidente) {
	                minAccidentsCity = city;
	            }
	        }
	        return minAccidentsCity;
	    }
	}
