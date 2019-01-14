package LoopsHomework;

public class Game1 {

	public static void main(String[] args) {
		int lifePesho = 100;
		int lifeGosho = 100;
		boolean sickGosho = false;
		boolean sickPesho = false;
		boolean bisonCharge = false;
		boolean druggedPesho = false;
		boolean druggedGosho = false;
		boolean odPesho = false;
		boolean odGosho = false;
		int anfPesho = 0;
		int anfGosho = 0;
		int minLifePesho = 0;
		int minLifeGosho = 0;
		while (lifePesho > minLifePesho && lifeGosho > minLifePesho) {
			double bisonRush = Math.random();
			double bisonTarget = Math.random();
			if (bisonRush > 0.92) {
				bisonCharge = true;
				System.out.print("Ot hrasta izskochi gneven bizon i ");
				if (bisonTarget < 0.5 && druggedPesho == false) {
					System.out.println("pomete Pesho");
					System.out.println("Gosho pecheli slujebno");
					break;
				}
				if (bisonTarget < 0.5 && druggedPesho == true) {
					System.out.println("kato vidq na Pesho zenicite se uplashi i izbqga");
				}
				if (bisonTarget > 0.5 && druggedGosho == false) {

					System.out.println("pomete Gosho");
					System.out.println("Pesho pecheli slujebno");
					break;
				}
				if (bisonTarget > 0.5 && druggedGosho == true) {
					System.out.println("kato vidq na Gosho zenicite se uplashi i izbqga");
				}
			}
			int dmgPesho = (int) (Math.random() * 21);
			double critRakiaPesho = Math.random();
			if (critRakiaPesho < 0.25) {
				System.out.println("RAKIA POWER PESHO!");
				dmgPesho *= 2;
			}
			if (!sickPesho) {
				double sickChancePesho = (Math.random());
				if (sickChancePesho < 0.1) {
					sickPesho = true;
					lifePesho -= 15;
					System.out.println("Pesho hvana sharka i mu ostana " + lifePesho + " krav");

					if (lifePesho <= 0) {
						System.out.println("Sharkata dovarshi Pesho");
						break;
					}

					dmgPesho /= 2;
				}
			} else {
				dmgPesho /= 2;
			}
			double dilarPesho = Math.random();
			if (dilarPesho < 0.2) {
				druggedPesho = true;
				anfPesho += 1;
				lifePesho += 30;
				minLifePesho += 20;
				System.out.println("Pesho nameri nomer na dilar i se napudri(+30 krav)");
				if (anfPesho > 5) {
					odPesho = true;
					lifePesho += 30;
					System.out.println("Na Pesho mu padna nosa ot drogata i izbqga");
					break;
				}

			}
			if (druggedPesho) {
				for (int d = 1; d <= anfPesho; d++) {
					dmgPesho *= 1.5;
				}
			}
			double mdmaPesho = Math.random();
			if (mdmaPesho < 0.31) {
				System.out.println("Pesho nameri bash MDMA i vkara na Gosho kombo - 5 udara po " + dmgPesho + " dmg");
				for (int i = 1; i <= 5; i++) {
					lifeGosho -= dmgPesho;

					if (lifeGosho <= minLifeGosho) {
						System.out.println("Gosho ne izdarja i padna na " + i + " udar");
						break;
					}

				}
			} else {
				System.out.println("Pesho prasna Gosho s " + dmgPesho + " dmg");

			}
			if (lifeGosho <= dmgPesho) {
				lifeGosho = 0;
			} else {
				lifeGosho -= dmgPesho;
				if (lifeGosho < minLifeGosho && druggedGosho) {
					System.out.println("Gosho poluchi sarcebiene ot drogata i Pesho go zavede v bolnica");
					break;
				}
			}
			if (lifeGosho == 0) {
				System.out.println("Gosho umrq");
				break;
			}

			System.out.println("Gosho ima oshte " + lifeGosho + " krav");

			int dmgGosho = (int) (Math.random() * 21);
			double critRakiaGosho = Math.random();
			if (critRakiaGosho < 0.25) {
				System.out.println("RAKIA POWER GOSHO!");
				dmgGosho *= 2;
			}
			if (!sickGosho) {
				double sickChanceGosho = (Math.random());
				if (sickChanceGosho < 0.1) {
					sickGosho = true;
					lifeGosho -= 15;
					System.out.println("Gosho hvana sharka i mu ostana " + lifeGosho + " krav");

					if (lifeGosho <= 0) {
						System.out.println("Sharkata dovarshi Gosho");
						break;
					}
					dmgGosho /= 2;
				}
			} else {
				dmgGosho /= 2;
			}
			double dilarGosho = Math.random();
			if (dilarGosho < 0.2) {
				druggedGosho = true;
				lifeGosho += 30;
				anfGosho += 1;
				minLifeGosho += 20;
				System.out.println("Gosho nameri nomer na dilar i se napudri(+30 krav)");
				if (anfGosho > 5) {
					odGosho = true;
					System.out.println("Na Gosho mu padna nosa ot drogata i izbqga");
					break;
				}

			}
			if (druggedGosho) {
				for (int d = 1; d <= anfGosho; d++) {
					dmgPesho *= 1.5;
				}
			}

			double mdmaGosho = Math.random();
			if (mdmaGosho < 0.31) {
				System.out.println("Gosho nameri bash MDMA i vkara na Pesho kombo 5 udara po " + dmgGosho + " dmg");
				for (int i = 1; i <= 5; i++) {
					lifePesho -= dmgGosho;
					if (lifePesho <= minLifePesho) {
						System.out.println("Pesho ne izdarja i padna na " + i + " udar");
						break;
					}
				}
			} else {
				System.out.println("Gosho prasna Pesho s " + dmgPesho + " dmg");

			}
			if (lifePesho <= dmgGosho) {
				lifePesho = 0;
			} else {
				lifePesho -= dmgGosho;
				if (lifePesho < minLifePesho && druggedPesho) {
					System.out.println("Pesho poluchi sarcebiene ot drogata i Gosho go zavede v bolnica");
					break;
				}
			}
			if (lifePesho == 0) {
				System.out.println("Pesho umrq");
				break;
			}

			System.out.println("Pesho ima oshte " + lifePesho + " krav");
		}
		if (odPesho || odGosho) {
			System.out.println("Drogata razvali hubaviq boi");
		}
		if (bisonCharge && !odPesho && !odGosho) {
			System.out.println("Glupaviq bizon razvali hubaviq boi...");
		} else {
			if (lifeGosho <= minLifeGosho) {
				System.out.println("Pesho pecheli");
			} else {
				System.out.println("Gosho pecheli");
			}
		}

	}

}
