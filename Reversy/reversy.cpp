#include "reversy.h"
#include <iostream>

void Menu::Choice_of_game()
{
	std::cout << "Choose the game:" << std::endl << std::endl;
	std::cout << "Reversy" << std::endl;
	for (int i = 0; i < 4; i++)
	{
		std::cout << "???????" << std::endl;
	}

	int coef = 0;

	while (coef == 0) {

		std::string answer;
		std::cin >> answer;

		if (answer == "Reversy" || answer == "reversy")
		{
			coef = 1;
			std::cout << "Welcome to Reversy!";
		}

		else
		{
			std::cout << "No games with that name found" << std::endl << "Try again" << std::endl;
		}
	}
}
