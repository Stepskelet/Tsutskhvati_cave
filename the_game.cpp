﻿#include <iostream>
#include <io.h>
#include <fcntl.h>

int main()
{
	_setmode(_fileno(stdout), _O_U16TEXT);

	for (int i = 0; i < 10; i++)
	{
		wchar_t symbol = ' ';

		if (i == 0)
		{
			symbol = '_';
		}

		else if (i == 9)
		{
			symbol = L'‾';
		}

		for (int j = 0; j < 10; j++)
		{
			if ((j == 0 || j == 9) && i != 0 && i != 9)
			{
				std::wcout << '|';
			}

			else
			{
				std::wcout << symbol;
			}
		}

		std::wcout << std::endl;
	}

	return 0;
}