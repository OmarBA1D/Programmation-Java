/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_tolower.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 14:15:55 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 14:21:46 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <ctype.h>
#include <stdio.h>

int	ft_tolower(int c)
{
	if (c >= 'A' && c <= 'Z')
	{
		return (c + 32);
	}
	return (c);
}

int	main(void)
{
	char	letra;

	letra = 'G';
	printf("Original: %c\n", letra);
	printf("Convertido: %c\n", ft_tolower(letra));
	return (0);
}
